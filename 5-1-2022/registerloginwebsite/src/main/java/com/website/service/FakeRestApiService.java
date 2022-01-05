package com.website.service;

import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.website.request.PostApiRequest;
import com.website.response.GenericResponse;

public interface FakeRestApiService {

	public GenericResponse getData(HttpSession session) throws JsonProcessingException;
	public GenericResponse postData(HttpSession session,PostApiRequest postApiRequest) throws JsonProcessingException;
}
