package com.website.model;

import java.io.Serializable;

public class ResponseToken implements Serializable{

	private String token;

	public String getToken() {
		return token;
	}

	public ResponseToken() {
		
	}
	
public ResponseToken(String token) {
	this.token = token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
}
