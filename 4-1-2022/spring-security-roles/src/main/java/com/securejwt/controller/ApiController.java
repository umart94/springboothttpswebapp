package com.securejwt.controller;

public abstract class ApiController {

	private static final String API_PATH = "/api/v1/";

	public static final String AUTHENTICATE_URL = API_PATH + "authenticate";
	public static final String REGISTER_URL = API_PATH + "register";
	public static final String REFRESH_TOKEN = API_PATH + "refreshtoken";
	public static final String CUSTOMER_URL = API_PATH + "customer";
	public static final String PIN_URL = API_PATH + "pin";
	public static final String INTRA_FT_URL = API_PATH + "ft";
	public static final String IBFT_FT_URL = API_PATH + "ibft";
	public static final String BILL_URL = API_PATH + "bill";
	public static final String BALANCE_INQUIRY_URL = API_PATH + "balance";
	public static final String MINI_STATEMENT_URL = API_PATH + "statement";
	public static final String CARD_MANAGEMENT_URL = API_PATH + "cardmanagement";
	public static final String ACCOUNT_MANAGEMENT_URL = API_PATH + "account";
	public static final String CHANNEL_PIN_MANAGEMENT_URL = API_PATH + "pinmanagement";
	public static final String LINKED_ACCOUNT_URL = API_PATH + "fetchlinkaccounts";
	public static final String SWAGGER_URL =  "/swagger-ui/";
	public static final String HELLO_WORLD_URL =  API_PATH + "hello";
	public static final String USER_URL =  API_PATH + "user";
	public static final String ADMIN_URL =  API_PATH + "admin";

	

}