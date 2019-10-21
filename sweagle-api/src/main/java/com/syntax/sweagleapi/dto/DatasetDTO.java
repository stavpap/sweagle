package com.syntax.sweagleapi.dto;

/**
 * The object that holds the details of the dataset and is used by the request and the response of our api.
 */
public class DatasetDTO {
	private long id;
	private String name;
	private String description;
	private PayloadDTO payload;

	//Default constructor is necessary for jackson mapping.
	public DatasetDTO() {	
	}
	
	public DatasetDTO(long id, String name, String description, PayloadDTO payload) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.payload = payload;
	}

	public DatasetDTO(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PayloadDTO getPayload() {
		return payload;
	}

	public void setPayload(PayloadDTO payload) {
		this.payload = payload;
	}

}
