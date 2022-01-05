package com.website.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PostApiRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5323871017361923965L;
	
	@NotNull(message = "userId may not be null")
	@NotEmpty(message = "userId may not be empty")
	@NotBlank(message = "userId may not be blank")
	public String userId;
	@NotNull(message = "body may not be null")
	@NotEmpty(message = "body may not be empty")
	@NotBlank(message = "body may not be blank")
	public String body;
	@NotNull(message = "title may not be null")
	@NotEmpty(message = "title may not be empty")
	@NotBlank(message = "title may not be blank")
	public String title;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public PostApiRequest(String userId, String body, String title) {
		super();
		this.userId = userId;
		this.body = body;
		this.title = title;
	}
	public PostApiRequest() {
		
	}
	@Override
	public String toString() {
		return "PostApiRequest [userId=" + userId + ", body=" + body + ", title=" + title + "]";
	}
}
