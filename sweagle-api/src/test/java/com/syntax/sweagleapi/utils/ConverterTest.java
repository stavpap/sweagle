package com.syntax.sweagleapi.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.syntax.sweagleapi.db.sweagle.tables.records.DatasetRecord;
import com.syntax.sweagleapi.db.sweagle.tables.records.PayloadRecord;
import com.syntax.sweagleapi.dto.DatasetDTO;
import com.syntax.sweagleapi.dto.PayloadDTO;

//Unit tests for the Converter class
@RunWith(SpringJUnit4ClassRunner.class)
public class ConverterTest {

	@Test
	   public void convertToDatasetRecordTest() {
		DatasetRecord expected = buildDatasetRecord();
		DatasetRecord actual = Converter.toDatasetRecord(buildDatasetDTO());
		assertThat(expected,is(actual));
	}
	
	@Test
	   public void convertToPayloadRecordTest() {
		PayloadRecord expected = buildPayloadRecord();
		PayloadRecord actual = Converter.toPayloadRecord(buildPayloadDTO(), buildDatasetRecord());
		assertThat(expected,is(actual));
	}

	private DatasetRecord buildDatasetRecord() {
		DatasetRecord dataset = new DatasetRecord(1L,"datasetRecord1", "Test dataset record 1");
		return dataset;
	}

	private DatasetDTO buildDatasetDTO() {
		DatasetDTO dataset = new DatasetDTO(1L, "datasetRecord1", "Test dataset record 1", new PayloadDTO(1L));
		return dataset;
	}
	
	private PayloadDTO buildPayloadDTO() {
		PayloadDTO payloadDTO = new PayloadDTO();
		payloadDTO.setData("test data");
		return payloadDTO;
	}
	
	private PayloadRecord buildPayloadRecord() {
		PayloadRecord payload = new PayloadRecord();
		payload.setDatasetId(1L);
		payload.setData("test data".getBytes());
		return payload;
		
	}
}
