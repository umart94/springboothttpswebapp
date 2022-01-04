package com.securejwt.response;

import java.io.Serializable;


public class PostApiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7928414475833889435L;
	
	private String userId;
	
	private String id;
	
	private String title;
	
	private String completed;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public PostApiResponse(String userId, String id, String title, String completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	public PostApiResponse() {
		
	}
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	
	
	
}
