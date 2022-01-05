package com.website.response;

import java.io.Serializable;

public class GetApiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1640256073680091863L;
	
	public String userId;
    public String id;
    public String title;
    public String completed;
	public GetApiResponse(String userId, String id, String title, String completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	public GetApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
    
    

}
