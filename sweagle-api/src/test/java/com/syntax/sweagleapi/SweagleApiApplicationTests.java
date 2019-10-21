package com.syntax.sweagleapi;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//Integration tests for our api.
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SweagleApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	private static final String ALL_DATASETS_PAYLOADS = "{\"id\":1,\"name\":\"dataset1\",\"description\":\"this is dataset 1\",\"payload\":{\"id\":1,\"createDate\":\"2019-10-21 14:28:20.0\",\"updateDate\":\"2019-10-21 14:28:20.0\",\"data\":\"first payload\"}},{\"id\":2,\"name\":\"dataset2\",\"description\":\"this is dataset 2\",\"payload\":{\"id\":2,\"createDate\":\"2019-10-21 14:28:20.0\",\"updateDate\":\"2019-10-21 14:28:20.0\",\"data\":\"second payload\"}}";
	
	private static final String ALL_DATASETS_NO_PAYLOADS = "{\"id\":1,\"name\":\"dataset1\",\"description\":\"this is dataset 1\"},{\"id\":2,\"name\":\"dataset2\",\"description\":\"this is dataset 2\"},{\"id\":3,\"name\":\"dataset3\",\"description\":\"this is dataset 3\"}";
	
	private static final String DATASET_PAYLOAD = "{\"id\":1,\"name\":\"dataset1\",\"description\":\"this is dataset 1\",\"payload\":{\"id\":1,\"createDate\":\"2019-10-21 14:28:20.0\",\"updateDate\":\"2019-10-21 14:28:20.0\",\"data\":\"first payload\"}}";
	
	private static final String DATASET_NO_PAYLOAD = "{\"id\":1,\"name\":\"dataset1\",\"description\":\"this is dataset 1\"}";
	
	@Test
	public void getAllWithPayloadTest() throws Exception {
		this.mockMvc.perform(get("/datasets?returnPayload=true")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(ALL_DATASETS_PAYLOADS)));
	}
	
	@Test
	public void getAllWithoutPayloadTest() throws Exception {
		this.mockMvc.perform(get("/datasets?returnPayload=false")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(ALL_DATASETS_NO_PAYLOADS)));
	}
	
	@Test
	public void getByIdWithPayloadTest() throws Exception {
		this.mockMvc.perform(get("/datasets/1?returnPayload=true")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(DATASET_PAYLOAD)));
	}
	
	@Test
	public void getByIdWithoutPayloadTest() throws Exception {
		this.mockMvc.perform(get("/datasets/1?returnPayload=false")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(DATASET_NO_PAYLOAD)));
	}
	
	@Test
	public void getByNameWithPayloadTest() throws Exception {
		this.mockMvc.perform(get("/datasets/name/dataset1?returnPayload=true")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(DATASET_PAYLOAD)));
	}
	
	@Test
	public void getByNameWithoutPayloadTest() throws Exception {
		this.mockMvc.perform(get("/datasets/name/dataset1?returnPayload=false")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(DATASET_NO_PAYLOAD)));
	}
}
