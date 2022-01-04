package com.securejwt.response;



import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.securejwt.util.Constants;

@JsonInclude(Include.NON_NULL)
public class GenericResponse<T> implements Serializable{

   

    /**
	 * 
	 */
	private static final long serialVersionUID = -5314905093245755465L;

	@JsonProperty
	protected String responseCode;

    @JsonProperty
	protected String responseDescription;

    @JsonProperty
    protected T data;
    
    @JsonProperty
   	protected String authData;
	
	public GenericResponse() {
		super();
		this.responseCode = "00";
		this.responseDescription = "Processed OK";
	}

	public GenericResponse(String responseCode, String responseDescription, T data) {
		super();
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
		this.data = data;
	}
	

	
    public GenericResponse(String responseCode, T data) {
		super();
		this.responseCode = responseCode;
		this.responseDescription = Constants.ResponseCodes.RESPONSE_MAP.get(responseCode);
		this.data = data;
		
	}
    
    public GenericResponse(String responseCode, String authData) {
		super();
		this.responseCode = responseCode;
		this.responseDescription = authData;
		
	}
    
    

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	
	
}
