package com.vpm.golfjoust.models;

public class Deal extends BaseGolfJoustDomainClass {
	private Long id;
	private String message;
	private String expiry;
	private String uri;
	private Boolean status;
	private String courseName;

	public Deal(Long id, String message, String expiry, String uri,
			Boolean status, String courseName) {
		super();
		this.id = id;
		this.message = message;
		this.expiry = expiry;
		this.uri = uri;
		this.status = status;
		this.courseName = courseName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
