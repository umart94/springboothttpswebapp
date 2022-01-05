package com.securejwt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.securejwt.request.PostApiRequest;
import com.securejwt.response.GenericResponse;
import com.securejwt.response.GetApiResponse;
import com.securejwt.response.PostApiResponse;
import com.securejwt.service.ApiService;
import com.securejwt.util.Constants;

@Service
public class ApiServiceImpl implements ApiService{

	@Autowired
	private RestTemplate restTemplate;
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
	@Override
	public GenericResponse getResponse() {
		// TODO Auto-generated method stub
		String getRequestURI = "https://jsonplaceholder.typicode.com/todos/";
		ResponseEntity<List<GetApiResponse>> todosResponse =
		        restTemplate.exchange(getRequestURI,
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<GetApiResponse>>() {
		            });
		List<GetApiResponse> todos = todosResponse.getBody();
		GenericResponse todosfinalGetResponse = new GenericResponse<>(Constants.ResponseCodes.OK, Constants.ResponseDescription.OK,todos);
		return todosfinalGetResponse;
	}


	@Override
	public GenericResponse postResponse(PostApiRequest postApiRequest) {
		String postRequestURI = "https://jsonplaceholder.typicode.com/posts";
		HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
		    HttpEntity<PostApiRequest> request = new HttpEntity<>(postApiRequest, headers);
		    ResponseEntity<PostApiResponse> result = restTemplate.postForEntity(postRequestURI, request, PostApiResponse.class);
		    GenericResponse genericResult = new GenericResponse<>(Constants.ResponseCodes.OK,Constants.ResponseDescription.OK,result.getBody());
		    return genericResult;
	}

}
