package com.syntax.sweagleapi.dto;

/**
 * The object that holds the details of the payload and is used by the request and the response of our api.
 */
public class PayloadDTO {
	private long id;
	private String createDate;
	private String updateDate;
	private String data;

	//Default constructor is necessary for jackson and jooq mapping.
	public PayloadDTO() {
	}

	public PayloadDTO(long id, String createDate, String updateDate, String data) {
		this.id = id;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.data = data;
	}

	public PayloadDTO(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
