package com.website.util;



import java.util.HashMap;

public class Constants {

	public static final int WRONG_PASSWORD_LIMIT = 3;

	public static final String USER_STATUS_ACTIVATED = "1";
	public static final String USER_STATUS_BLOCKED = "2";
	public static final String USER_STATUS_INACTIVE = "3";
	public static final String USER_STATUS_DEACTIVATED = "4";
	public static final String USER_STATUS_LOCKED = "5";

	public static final String BENEF_STATUS_ACTIVE = "1";
	public static final String BENEF_STATUS_INACTIVE = "2";
	public static final String BENEF_STATUS_NOT_VERIFIED = "3";

	public static final String PREPAID = "1";
	public static final String POSTPAID = "2";

	public static final String NBP_IMD = "979898";

	public static final String PAN = "6014921111111111111";
	public static final String IBFT_PAN = "6014920001000013";
	public static final String UBPS_PAN = "6014922222222222";
	public static final String PAYTOCNIC_PAN = "6014944444444444";

	public static final String IBFT_FETCH_ACCOUNT_NO = "00000200224000234219";
	public static final String IBFT_FETCH_ACCOUNT_TYPE = "20";
	public static final int ALIAS_LENGTH = 20;

	public static final String UBPSFUNDTRANSFER_LEDGERACCOUNT = "00027100133000002130";

	public static final String PAYTOCNIC_LEDGERACCOUNT = "00027100133000002130";

	public static final String BACKOFFICE_RDA = "BACKOFFICE";

	public static class CARD_TYPES {
		public static final String EMV = "EMV Debit";
		public static final String PAY_PAK = "PayPak Debit";
	}

	public static class ResponseCodes {
		
		
		public static final String ACCOUNT_NOT_FOUND = "01";
		public static final String CUSTOMER_NOT_FOUND = "01";
		public static final String UNABLE_TO_GET_ACCOUNT_TITLE = "01";
		public static final String UNABLE_TO_PROCESS = "99";
		public static final String UNABLE_TRANSFER_FUNDS = "01";
		public static final String INVALID_TO_FROM_ACCOUNT = "01";
		public static final String PIN_ALREADY_GENERATED = "01";

		public static final int RESPONSE_TYPE_RBTS = 1;
		public static final int RESPONSE_TYPE_ONELINK = 2;
		public static final int RESPONSE_TYPE_NBP = 3;
		public static final int RESPONSE_TYPE_CRM = 4;
		public static final int RESPONSE_TYPE_EURONET = 5;
		public static final String RESPONSE_TYPE_ONLINK_UBPS = "06";
		public static final int RESPONSE_TYPE_JAZZCASH = 7;
		public static final int RESPONSE_TYPE_UMPS = 8;
		public static final int RESPONSE_TYPE_IRIS = 9;
		public static final int RESPONSE_TYPE_NPC = 10;

		
		public static final String OK_200 = "200";
		public static final String CREATED_201 = "201";
		public static final String BADREQUEST_400 = "400";
		public static final String UNAUTHORIZED_401 = "401";
		public static final String OK = "00";
		public static final String INVALID_PARAMS = "01";
		public static final String INCORRECT_OTP = "02";
		public static final String BENEF_NOT_FOUND = "03";
		public static final String OWN_ACCOUNT_BENEF = "04";
		public static final String BENEF_ALREADY_EXIST = "05";
		//public static final String BENEF_ALREADY_ACTIVE = "06";
		public static final String INVALID_INFO = "07";
		public static final String INVALID_CREDENTIALS = "08";
		public static final String USERNAME_NOT_EXIST = "09";
		public static final String USER_LOCKED = "10";
		public static final String NO_OTP_CREATED = "11";
		public static final String INVALID_BRANCH_CODE = "12";
		public static final String USERNAME_ALREADY_EXIST = "13";
		public static final String ACCOUNT_ALREADY_EXIST = "14";
		public static final String CNIC_ALREADY_EXIST = "15";
		public static final String BENEF_NOT_VALIDATED = "16";

		// shafiq - error codes
		public static final String FROMACCOUNT_INVALID = "20";
		public static final String BENEFICIARY_INVALID = "21";
		public static final String ACCOUNT_ALREADY_LINKED = "22";
		public static final String INVALID_ACCOUNT = "01";
		public static final String INVALID_ACCOUNT_2 = "23";
		public static final String CATEGORY_INVALID = "24";
		public static final String UNABLE_TO_GET_STATEMENT = "25";
		public static final String TITLE_NOT_FOUND = "26";
		public static final String ACCOUNT_STATUS_NOT_VALID = "27";
		public static final String OWN_ACCOUNT_FT = "28";
		public static final String USER_NOT_EXIST = "29";
		public static final String AMOUNT_LIMIT_EXCEEDED = "30";
		public static final String TRAN_LIMIT_EXCEEDED = "31";
		public static final String ALIAS_NOT_PROVIDED = "32";
		public static final String ALIAS_LENGTH_EXCEEDED = "33";
		public static final String NO_RECORD_FOUND = "34";
		public static final String NEW_PASS_GENERATED = "35";
		public static final String INVALID_PASSWORD = "39";
		public static final String TITLE_NOT_FETCHED = "40";
		public static final String INVALID_ACCOUNT_LENGTH = "41";
		public static final String ALLOWED_REGISTRATION_COUNT_EXCEEDED = "42";
		public static final String BP_MIN_AMOUNT = "43";
		public static final String BP_MAX_AMOUNT = "44";
		public static final String USERNAME_WHITESPACES = "45";
		public static final String PWD_WHITESPACES = "46";
		public static final String CARD_EXPIRED = "47";
		public static final String CNIC_MISMATCH = "48";
		public static final String ACCOUNT_MISMATCH = "49";
		public static final String CARD_MISMATCH = "50";
		public static final String CARD_NOT_ACTIVE = "51";
		public static final String REG_NOT_ALLOWED = "52";

		public static final String USERNAME_LENGTH = "53";
		public static final String INVALID_USERNAME = "54";
		public static final String FPIN_NOT_MATCH = "55";
		public static final String FPIN_SPACES = "56";
		public static final String INVALID_FPIN = "57";
		public static final String INCORRECT_OTP_1 = "58";
		public static final String FPIN_NOT_GENERATED = "59";
		public static final String ACCOUNT_STATUS_NOT_ACTIVE = "60";
		public static final String USER_INACTIVE = "61";
		public static final String UMPS_CARD_NOT_GEN = "62";
		public static final String MPIN_NOT_MATCH = "63";
		public static final String CUSTOMER_IS_SELF_REGISTERED = "64";
		public static final String CUSTOMER_INACTIVE = "65";
		public static final String ACCOUNT_ALREADY_DEFAULT = "66";
		public static final String ACCOUNT_CANNOT_REMOVE = "67";
		public static final String ACCOUNT_CANNOT_ADD = "69";
		public static final String ACCOUNT_ADD_LIMIT = "70";
		public static final String OTP_ATTEMPT_EXHAUST = "71";
		public static final String EMAIL_COUNT_EXHAUST = "72";
		public static final String MPIN_EXHAUST = "73";
		public static final String PIN_ALREADY_SET = "74";
		public static final String UFONE_570_ERROR = "75";
		public static final String UFONE_50_ERROR = "76";
		public static final String CARD_BLOCK = "1001";
		public static final String CARD_FRESH = "1002";
		public static final String PROVIDED_INFO_MISMATCH = "1003";
		public static final String CREDIT_RESTRICT_RDA_ACCOUNT = "1004";
		/*
		 * public static final String BENEF_VALIDATED = "36"; public static final String
		 * BENEF_UPDATED = "37"; public static final String BENEF_DELETED = "38";
		 * 
		 * public static final String BENEF_DELETED = "38";
		 */

		

		public static final String SESSION_INVALID = "605";
		public static final String SESSION_EXPIRED = "606";
		public static final String INVALID_LOGIN = "607";
		public static final String LOCKED_USER = "608";
		public static final String MULTI_LOGIN = "609";
		public static final String INACTIVE_USER = "610";
		public static final String INVALID_FP_TOKEN = "611";
		public static final String FP_TOKEN_NOT_REGISTERED_ON_DEVICE = "612";
		public static final String FP_TOKEN_NOT_ENABLE_ON_DEVICE = "613";

		public static final String DEVICE_ALREADY_ENROLLED = "614";
		public static final String BLOCKED_USER = "615";
		public static final String IB_NOT_ALLOWED = "616";
		public static final String NO_INVESTMENT_FOUND = "617";
		public static final String INVALID_CNIC_LENGTH = "644";
		
		
	
		
		/*
		 * public static final String SESSION_INVALID = "505"; public static final
		 * String SESSION_EXPIRED = "506"; public static final String INVALID_LOGIN =
		 * "507"; public static final String LOCKED_USER = "508"; public static final
		 * String MULTI_LOGIN = "509";
		 */

		public static final String UNABLE_TO_PROCESS_MESSAGE = "Unable to process at this time. Please, try again later";
		public static final String INVALID_TO_ACCOUNT = "68";
		public static final String FORGOT_PASSWORD_RSP = "Dear Customer, please do not share your OTP with anyone. Your OTP has been sent to your email and mobile number. Please login with this OTP to create your own password.";
		public static final String MESSAGE_SUCCESSFUL_CHANGED_PASSWORD = "Dear Customer, Your Password has been changed successfully! ";

		public static final String VALUES_MISMATCH = "999";

		public static final HashMap<String, String> RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4396790457518423520L;

			{
				put(OK, "Processed OK");
				put(INVALID_PARAMS, "Required Parameters Not Provided");
				put(INCORRECT_OTP_1, "Incorrect OTP Provided");
				put(OTP_ATTEMPT_EXHAUST, "OTP tries exhaust");
				// put(INCORRECT_OTP, "Incorrect OTP Provided");
				put(INCORRECT_OTP, "Incorrect MPIN Provided");
				put(BENEF_NOT_FOUND, "Beneficiary Not Found");
				put(OWN_ACCOUNT_BENEF, "Own account cannot be beneficiary");
				put(BENEF_ALREADY_EXIST, "Beneficiary already exists");
				put(BENEF_NOT_VALIDATED, "Beneficiary Not Validated");
				//put(BENEF_ALREADY_ACTIVE, "Beneficiary already active");
				put(INVALID_CREDENTIALS, "Invalid credentials provided");
				put(USERNAME_NOT_EXIST, "Username doesnot exist");
				put(USER_LOCKED, "Entered account is locked");
				put(NO_OTP_CREATED, "No OTP created");
				put(INVALID_BRANCH_CODE, "Invalid branch code");
				put(USERNAME_ALREADY_EXIST, "Username already exists");
				put(FROMACCOUNT_INVALID, "From account invalid");
				put(ACCOUNT_ALREADY_EXIST, "Account already exists");
				put(UNABLE_TO_PROCESS, UNABLE_TO_PROCESS_MESSAGE);
				put(ACCOUNT_ALREADY_DEFAULT, "Account already set to default");
				put(ACCOUNT_CANNOT_REMOVE, "Registered/Default account cannot be removed");
				put(ACCOUNT_CANNOT_ADD, "Provided account number is not allowed for addition.");
				put(ACCOUNT_ADD_LIMIT, "Customer account addition limit exceeds.");
				put(BENEFICIARY_INVALID, "Unable to validate beneficiary.");
				put(ACCOUNT_ALREADY_LINKED, "Account already linked.");
				put(INVALID_ACCOUNT, "Invalid account provided for title fetch.");
				put(INVALID_ACCOUNT_2, "Invalid account details provided.");
				put(CUSTOMER_IS_SELF_REGISTERED,
						"Your NBP Digital transaction activation is pending. You will be contacted by NBP call center representative. You may contact NBP call center also for activation at 021-111-627-627.");
				put(CUSTOMER_INACTIVE, "Customer is  InActive");
				put(INVALID_ACCOUNT_LENGTH, "To Account Length should be 10 digits only.");
				put(CATEGORY_INVALID, "Invalid category.");
				put(UNABLE_TO_GET_STATEMENT, "Unable to get statement at this time.");
				put(TITLE_NOT_FOUND, "Invalid account provided for title fetch");
				put(TITLE_NOT_FETCHED, "Cannot fetch title right now.");
				put(CNIC_ALREADY_EXIST, "CNIC already exists");
				put(INVALID_INFO, "Invalid info provided");
				put(ACCOUNT_STATUS_NOT_VALID, "Account is Inactive/Dormant OR Closed");
				put(ACCOUNT_STATUS_NOT_ACTIVE, "Account is Inactive/Invalid OR Closed");
				put(OWN_ACCOUNT_FT, "Cannot perform title fetch of the same account");
				put(USER_NOT_EXIST, "Invalid CNIC");
				put(AMOUNT_LIMIT_EXCEEDED, "Transaction amount exceeds daily limit");
				put(TRAN_LIMIT_EXCEEDED, "Daily allowed transactions limit has expired");
				put(ALIAS_NOT_PROVIDED, "Short name not provided");
				put(ALIAS_LENGTH_EXCEEDED, "Short name length must not be greater than 20 characters");
				put(NO_RECORD_FOUND, "No record found");
				put(INVALID_TO_ACCOUNT, "Invalid To account");
				put(ALLOWED_REGISTRATION_COUNT_EXCEEDED, "Total allowed registration Count on App exceeded");
				put(BP_MIN_AMOUNT, "Bill Payment amount is less than minimum amount");
				put(BP_MAX_AMOUNT, "Bill Payment amount is greater than maximum amount");
				put(NEW_PASS_GENERATED,
						"Your USER ID and New One Time password is sent to your EmailAddress. Please login with One Time Password and create your new password");
				put(INVALID_PASSWORD,
						"\"Password to be created as per below NBP Password Policy.\n\n"
								+ "a. Password Must contain Lower & Upper Case Characters (e.g.a-z, A-Z).\n"
								+ "b. Must have atleast one digit and special character.\n"
								+ "c. Atleast eight (8) alphanumeric characters long\n");
				put(USERNAME_WHITESPACES, "Username cannot contain spaces");
				put(PWD_WHITESPACES, "Password cannot contain spaces");

				put(CARD_EXPIRED, "Provided card number is expired.");
				put(CNIC_MISMATCH, "CNIC mismatch.");
				put(ACCOUNT_MISMATCH, "Account mismatch");
				put(CARD_MISMATCH, "Invalid card number is provided.");
				put(CARD_NOT_ACTIVE, "Card is not active");
				put(CARD_BLOCK,
						"Card is permanently blocked. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(CARD_FRESH,
						"Card is Fresh kindly Activate your card. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(PROVIDED_INFO_MISMATCH, "Provided Information mismatch");
				put(CREDIT_RESTRICT_RDA_ACCOUNT, "Credit Restriction applied for RDA Account");
				put(REG_NOT_ALLOWED, "Only NBP staff is allowed to register on the application");

				put(USERNAME_LENGTH, "Username length should not be less than 8 and greater than 14");
				put(INVALID_USERNAME, "Username to be created as per below NBP username Policy.\n\n"
						+ "a. Username must contain lower or upper case Characters (e.g.a-z, A-Z).\n"
						+ "b. Can contain digit and underscore or dash alongwith Lower or Upper Case Characters (e.g.a-z, A-Z).\n"
						+ "c. Cannot be < 6 and > 14 \n");
				put(FPIN_NOT_MATCH, "Re enter financial pin doesn't match with the original one");
				put(MPIN_NOT_MATCH, "Re enter Mpin doesn't match with the original one");
				put(MPIN_EXHAUST,
						"MPIN exhausted for current user due to multiple wrong pin attempts. Please reset your pin.");
				put(FPIN_SPACES, "Financial pin cannot contain spaces");
				put(INVALID_FPIN,
						"FPIN to be created as per below NBP FPIN Policy.\n\n"
								+ "a. FPIN must contain alphanumeric (e.g.a-z, 0-9) characters.\n"
								+ "b. Should not contain uppercase characters.\n"
								+ "c. Should be only (6) alphanumeric characters long\n");
				put(FPIN_NOT_GENERATED, "Please generate your financial pin First");
				put(USER_INACTIVE, "User is inactive");
				put(UMPS_CARD_NOT_GEN, "Virtual card not generated. Please add a virtual card to avail the services.");
				put(EMAIL_COUNT_EXHAUST, UNABLE_TO_PROCESS_MESSAGE);
				put(INVALID_CNIC_LENGTH, "CNIC length must be exactly 13 characters long");
				put(UNABLE_TO_GET_ACCOUNT_TITLE, "Unable to get Account Title");
				
				put(UNABLE_TRANSFER_FUNDS, "Unable to transfer funds");
				put(ACCOUNT_NOT_FOUND, "Account Not Found");
				put(CUSTOMER_NOT_FOUND, "Customer Not Found");
				put(INVALID_TO_FROM_ACCOUNT, "To and From account must not be same.");
				put(RESPONSE_TYPE_ONLINK_UBPS, "Invalid Processing Code");
				
				
				/*
				 * put(BENEF_VALIDATED, "Beneficiary successfully validated");
				 * put(BENEF_UPDATED, "Beneficiary successfully updated"); put(BENEF_DELETED,
				 * "Beneficiary successfully deleted"); put(BENEF_DELETED,
				 * "Beneficiary successfully deleted");
				 */

				put(SESSION_INVALID,
						"Session is invalid, please login again. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(SESSION_EXPIRED,
						"Session timed out, please login again. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(MULTI_LOGIN,
						"Your account has been logged in somewhere else. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(INVALID_LOGIN,
						"Invalid User ID or Password. Please enter the correct credentials. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(INVALID_FP_TOKEN, "Invalid Token for Finger Print Login.");
				put(FP_TOKEN_NOT_REGISTERED_ON_DEVICE, "Finger Print is not registered on this device.");
				put(FP_TOKEN_NOT_ENABLE_ON_DEVICE, "Finger Print is not enabled on this device.");
				put(LOCKED_USER,
						"Dear Customer, your recent login attempt failed. User is locked due to multiple wrong password attempts. Please Use Forgot Password option to reset Password. For further assistance, please call NBP Helpline +9221-111-627-627.");
				put(BLOCKED_USER,
						"Dear Customer, your recent login attempt failed. User ID is permanently blocked. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(INACTIVE_USER,
						"Dear Customer, your Mobile App is temporary blocked. Please call NBP Helpline +9221-111-627-627 for activation of Mobile App. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(DEVICE_ALREADY_ENROLLED, "Device Already Enrolled");
				put(PIN_ALREADY_SET, "You have already used this password");
				put(UFONE_570_ERROR, "Ufone Super Card 570 has been discontinued");
				put(UFONE_50_ERROR, "Ufone Super Card 50 has been discontinued");
				put(IB_NOT_ALLOWED,
						"Dear Customer, you are not allowed to use Internet Banking for now. For further assistance, please call NBP HelpLine +9221-111-627-627.");
				put(VALUES_MISMATCH, "Requested data does not matched");
				put(NO_INVESTMENT_FOUND, "No Investment Found.");
			}
		};

		public static final HashMap<String, String> IRIS_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4609555256841258125L;

			{
				put("00", "SUCCESS");
				put("99", UNABLE_TO_PROCESS_MESSAGE);
				put("01", "Customer not found.");
				put("02", "Stolen/Lost Card");
			}
		};

		public static final HashMap<String, String> ONLINK_UBPS_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4609555256841258125L;

			{

				put("00", "Success");
				put("21", "Unable to process at this time. Please, try again later");// Inactive Channel
				put("22", "Unable to process at this time. Please, try again later");// Invalid Signature
				put("25", "Unable to process at this time. Please, try again later");// UBPS service timed out or is not
																						// available
				put("27", "Unable to process at this time. Please, try again later");// Internal / Unspecified Error
				put("66", "Bill in Process");
				put("86", "Malformed Index in Relationship Inquiry");
				put("87", "Invalid Index");
				put("88", "Customer Not Found");
				put("89", "Bill Already Paid");
				put("90", "Transaction Not Supported");
				put("91", "Utility Company ID not Found");
				put("92", "Consumer Number Not Found");
				put("93", "Unable to process at this time. Please, try again later");// Login Failed Network Message
				put("94", "Bill Not Found");
				put("95", "Unable to process at this time. Please, try again later");// Web Service timed out or is not
																						// available
				put("97", "Unable to process at this time. Please, try again later");// Exception
				put("96", "Unable to process at this time. Please, try again later");// OneLink Webservice not
																						// responding properly

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);
			}
		};

		public static final HashMap<String, String> RBTS_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -5728578945340083934L;

			{
				put("00", "SUCCESS");
				put("01", "Communication Failure");
				put("02", "Difference in Working Dates");
				put("03", "A/C does not exists");
				put("04", "Record Locked");
				put("05", "F.C Account");
				put("06", "A/C Closed");
				put("07",
						"There is a restriction on your account. Please visit your branch to get it resolved and then try again later.");
				put("08", "Insufficient Balance");
				put("09", "Sanction Limit is Expired");
				put("10", UNABLE_TO_PROCESS_MESSAGE);// Insufficient D.Power
				put("11", UNABLE_TO_PROCESS_MESSAGE);// "Invalid Instrument"
				put("12", UNABLE_TO_PROCESS_MESSAGE);// "Instrument Already Stop
														// Marked");
				put("13", UNABLE_TO_PROCESS_MESSAGE);// "Instrument Already
														// Paid");
				put("14", UNABLE_TO_PROCESS_MESSAGE);// "Instrument belongs to
														// removed cheque book");
				put("15", "Cheque Book is not issued");
				put("16", "Already reversed");
				put("17", "A/C not exists(for statement inquiry)");
				put("18", "Invalid CNIC");
				put("19", "Account Type not allowed");
				put("20", "Invalid wallet or wallet length");
				put("21", "Wallet not Verified");
				put("31", "Processed Not or Uncomplete");
				put("32", "EBS Timeout");
				put("33", "Profile Timeout");
				put("34", UNABLE_TO_PROCESS_MESSAGE);// "Timeout Cloud");
				put("35", UNABLE_TO_PROCESS_MESSAGE);// "Transaction Failed at
														// EBS");
				put("36", UNABLE_TO_PROCESS_MESSAGE);// "Transaction Failed at
														// Profile");
				put("37", "System Error");
				put("38", UNABLE_TO_PROCESS_MESSAGE);// "Invalid transaction");
				put("39", "Original Failed");
				put("40", "Reversed");
				put("41", "Reversal Sent to SAF");
				put("42", UNABLE_TO_PROCESS_MESSAGE);// "Login Failed to
														// Cloud");
				put("43", UNABLE_TO_PROCESS_MESSAGE);// "Not Processed due to
														// time out");
				put("44", UNABLE_TO_PROCESS_MESSAGE); // "Profile Link Down"
				put("45", UNABLE_TO_PROCESS_MESSAGE); // "EBS Link Down"
				put("46", UNABLE_TO_PROCESS_MESSAGE); // "General Input Error at EBS"
				put("47", UNABLE_TO_PROCESS_MESSAGE); // "EBS and Profile Link Down"
				put("48", UNABLE_TO_PROCESS_MESSAGE); // "Already Reversed"
				put("49", UNABLE_TO_PROCESS_MESSAGE); // "Input Invalid"
				put("50", UNABLE_TO_PROCESS_MESSAGE);// "Advice Sent to SAF");
				put("51", UNABLE_TO_PROCESS_MESSAGE);// "Islamic Sys Timeout");
				put("52", UNABLE_TO_PROCESS_MESSAGE);// "Islamic Sys Link
														// Down");
				put("53", UNABLE_TO_PROCESS_MESSAGE);// "EBS and Islamic Link
														// Down");
				put("54", UNABLE_TO_PROCESS_MESSAGE);// "FIS and Islamic Link
														// Down");
				put("55", UNABLE_TO_PROCESS_MESSAGE);// "FIS, Islamic and EBS
														// Link Down");
				put("56", "Failed Islamic");
				put("57", "Cancelled/Only");
				put("66", "Branch Not active");
				put("77", UNABLE_TO_PROCESS_MESSAGE);// "Process Failed due to
														// invalid write/rewrite");
				put("86", UNABLE_TO_PROCESS_MESSAGE);// "Processing error-From
														// input value");
				put("87", UNABLE_TO_PROCESS_MESSAGE);// "Processing
														// error-general input
														// error");
				put("97", UNABLE_TO_PROCESS_MESSAGE);// "Already Exist");
				put("88", UNABLE_TO_PROCESS_MESSAGE);// "EBS Reversed");
				put("59", UNABLE_TO_PROCESS_MESSAGE);// "Connection Timeout");
				put("58", UNABLE_TO_PROCESS_MESSAGE);// "Socket Timeout");
				put("95", UNABLE_TO_PROCESS_MESSAGE);// "EXCEPTION"

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("502", "Suspected Transaction");
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("506", "Transaction is expired");
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);
			}
		};

		public static final HashMap<String, String> ONELINK_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -4924567296159734373L;

			{
				put("00", "SUCCESS");
				put("01", "Limit exceeded");
				put("02", "Invalid account provided for title fetch");
				put("03", "Account In-active");
				put("04", "Low balance");
				put("05", "No pan");
				put("06", "No imd");
				put("07", UNABLE_TO_PROCESS_MESSAGE);// "CARD_DATA");
				put("08", UNABLE_TO_PROCESS_MESSAGE);// CARD_RECORD");
				put("09", UNABLE_TO_PROCESS_MESSAGE);// "FLD_ERROR");
				put("10", UNABLE_TO_PROCESS_MESSAGE);// "DUP_TRAN");
				put("11", UNABLE_TO_PROCESS_MESSAGE);// "BAD_TRAN_CODE");
				put("12", UNABLE_TO_PROCESS_MESSAGE);// "CARD_STATUS");
				put("13", UNABLE_TO_PROCESS_MESSAGE);// "CTREE");
				put("14", "Warm card");
				put("15", "Hot card");
				put("16", "Bad card status");
				put("17", UNABLE_TO_PROCESS_MESSAGE);// "UNKNOWN_AUTH_MODE");
				put("18", UNABLE_TO_PROCESS_MESSAGE);// "TRAN_DATE");
				put("19", UNABLE_TO_PROCESS_MESSAGE);// "CURR_CODE");
				put("20", UNABLE_TO_PROCESS_MESSAGE);// "NO_TRAN_ON_IMD");
				put("32", UNABLE_TO_PROCESS_MESSAGE);// "CARDDB_FILE");
				put("33", UNABLE_TO_PROCESS_MESSAGE);// "BALDB_FILE");
				put("34", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_NOT_AUTHORIZED");
				put("35", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_ALREADY_REVERSED");
				put("36", UNABLE_TO_PROCESS_MESSAGE);// "ACQ_REVERSAL");
				put("37", UNABLE_TO_PROCESS_MESSAGE);// "REP_AMT");
				put("38", UNABLE_TO_PROCESS_MESSAGE);// "TRANCODE_MISMATCH");
				put("39", UNABLE_TO_PROCESS_MESSAGE);// "BAD_TRAN_TYPE");
				put("40", UNABLE_TO_PROCESS_MESSAGE);// "EXLOG_FILE");
				put("41", UNABLE_TO_PROCESS_MESSAGE);// "EXP_DT_MISMATCH");
				put("42", UNABLE_TO_PROCESS_MESSAGE);// "ACQ_ADJUSTMENT");
				put("43", UNABLE_TO_PROCESS_MESSAGE);// "ACQ_NACK");
				put("44", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_ALREADY_NACKED");
				put("45", UNABLE_TO_PROCESS_MESSAGE);// "T2_DATA_MISMATCH");
				put("46", UNABLE_TO_PROCESS_MESSAGE);// "UNABLE_TO_PROCESS");
				put("47", UNABLE_TO_PROCESS_MESSAGE);// "ERR_CURRENCY_CONVERSION");
				put("48", UNABLE_TO_PROCESS_MESSAGE);// "Invalid Amount");
				put("49", UNABLE_TO_PROCESS_MESSAGE);// "ERR_O2_INT2");
				put("50", UNABLE_TO_PROCESS_MESSAGE);// "HOST_STATUS_UNKNOWN");
				put("51", UNABLE_TO_PROCESS_MESSAGE);// "HOST_NOT_PROCESSING");
				put("52", UNABLE_TO_PROCESS_MESSAGE);// "HOST_IN_STANDIN_MODE");
				put("53", UNABLE_TO_PROCESS_MESSAGE);// "HOST_IN_BAL_DWNLD_MODE");
				put("54", UNABLE_TO_PROCESS_MESSAGE);// "SAF_TRANSMIT_MODE");
				put("55", UNABLE_TO_PROCESS_MESSAGE);// "HOST_LINK_DOWN");
				put("56", UNABLE_TO_PROCESS_MESSAGE);// "SENT_TO_HOST");
				put("57", UNABLE_TO_PROCESS_MESSAGE);// "SENT_TO_QNB");
				put("59", UNABLE_TO_PROCESS_MESSAGE);// "HOST_REJECT");
				put("60", UNABLE_TO_PROCESS_MESSAGE);// "PIN_RETRIES_EXHAUSTED");
				put("61", UNABLE_TO_PROCESS_MESSAGE);// "HSM_NOT_RESPONDING");
				put("62", UNABLE_TO_PROCESS_MESSAGE);// "HOST_OFFLINE");
				put("63", UNABLE_TO_PROCESS_MESSAGE);// "DEST_NOT_FOUND");
				put("64", UNABLE_TO_PROCESS_MESSAGE);// "DEST_NOT_REGISTERED");
				put("65", "Cash transaction not allowed");
				put("66", "Transaction not allowed");
				put("67", "Invalid account status");
				put("68", "Invalid account provided for title fetch");
				put("69", UNABLE_TO_PROCESS_MESSAGE);// "BAD_PIN_COMPARE");
				put("70", UNABLE_TO_PROCESS_MESSAGE);// "REFUSED_IMD");
				put("71", UNABLE_TO_PROCESS_MESSAGE);// "NO_PROFILE_AVAILABLE");
				put("72", UNABLE_TO_PROCESS_MESSAGE);// "THIS_CURR_NOT_ALLOWED");
				put("73", UNABLE_TO_PROCESS_MESSAGE);// "CHECK_DIGIT_FAILED");
				put("74", UNABLE_TO_PROCESS_MESSAGE);// "TRAN_SRC_NOT_ALLOWED");
				put("75", UNABLE_TO_PROCESS_MESSAGE);// "UNKNOWN_TRAN_SOURCE");
				put("76", UNABLE_TO_PROCESS_MESSAGE);// "MANUAL_ENTRY_NOT_ALLOWED");
				put("77", UNABLE_TO_PROCESS_MESSAGE);// "REFER_TO_ISSUER");
				put("78", UNABLE_TO_PROCESS_MESSAGE);// "INVALID_MERCHANT");
				put("79", UNABLE_TO_PROCESS_MESSAGE);// "HONOR_WITH_ID");
				put("80", UNABLE_TO_PROCESS_MESSAGE);// "MESSAGE_FORMAT_ERROR");
				put("81", UNABLE_TO_PROCESS_MESSAGE);// "SECURITY_VIOLATION");
				put("82", UNABLE_TO_PROCESS_MESSAGE);// "MAIL_ORDER_NOT_ALLOWED");
				put("83", UNABLE_TO_PROCESS_MESSAGE);// "NO_COMMS_KEY");
				put("84", UNABLE_TO_PROCESS_MESSAGE);// "NO_PIN_KEY");
				put("85", UNABLE_TO_PROCESS_MESSAGE);// "NO_DEC_TAB");
				put("86", UNABLE_TO_PROCESS_MESSAGE);// "INCORRECT_PIN_LEN");
				put("87", UNABLE_TO_PROCESS_MESSAGE);// "CASH_RETRACT");
				put("88", UNABLE_TO_PROCESS_MESSAGE);// "FAULTY_ENCASH");
				put("89", UNABLE_TO_PROCESS_MESSAGE);// "SHORT_DISPENSE");
				put("90", UNABLE_TO_PROCESS_MESSAGE);// "CUSTOMER_NOT_FOUND");
				put("91", UNABLE_TO_PROCESS_MESSAGE);// "ISS_REVERSAL");
				put("92", UNABLE_TO_PROCESS_MESSAGE);// "ACCOUNT_LOCKED");
				put("93", UNABLE_TO_PROCESS_MESSAGE);// "CUST_REL_NOT_FOUND");
				put("94", UNABLE_TO_PROCESS_MESSAGE);// "PERMISSION_DENIED");
				put("95", UNABLE_TO_PROCESS_MESSAGE);// "TRAN_REJECT");
				put("96", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_ALREADY_REJECTED");
				put("97", UNABLE_TO_PROCESS_MESSAGE);// "BAD_EXP_DATE");
				put("98", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_AMT_INCORRECT");
				put("99", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_DATA_ELEM_MISMATCH");
				put("21", UNABLE_TO_PROCESS_MESSAGE);// "NO_TRAN_ON_ACCT");
				put("22", UNABLE_TO_PROCESS_MESSAGE);// "BAD_CARD_CYC_DT");
				put("23", UNABLE_TO_PROCESS_MESSAGE);// "BAD_CARD_CYC_LEN");
				put("24", UNABLE_TO_PROCESS_MESSAGE);// "BAD_PIN");
				put("25", UNABLE_TO_PROCESS_MESSAGE);// "CARD_EXP_DT");
				put("26", UNABLE_TO_PROCESS_MESSAGE);// "O2_CARD_EXP_DT");
				put("27", UNABLE_TO_PROCESS_MESSAGE);// "BAD_O2_CYC_DT");
				put("28", UNABLE_TO_PROCESS_MESSAGE);// "NO_ACCT_LINKED");
				put("29", UNABLE_TO_PROCESS_MESSAGE);// "O2_INT");
				put("30", UNABLE_TO_PROCESS_MESSAGE);// "ORIG_TRAN_NOT_FOUND");
				put("31", UNABLE_TO_PROCESS_MESSAGE);// "TRANLOG_FILE");
				put("59", UNABLE_TO_PROCESS_MESSAGE);// "Connection Timeout");
				put("58", UNABLE_TO_PROCESS_MESSAGE);// "Socket Timeout");
				put("95", UNABLE_TO_PROCESS_MESSAGE);// "EXCEPTION"

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);
			}
		};

		public static final HashMap<String, String> CRM_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -507403582047116831L;

			{
				put("00", "SUCCESS");
				put("01", "Invalid Account Number");
				put("02", "NO TRANSACTIONS FOUND");
				put("03", "Invalid CNIC Number");
				put("04", "CNIC Number length must be 15 digit");
				put("05", "Account Number length must be 10 digit");
				put("06", "You cannot Avail this Service");

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);
			}
		};

		public static final HashMap<String, String> JAZZCASH_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 3009936467433872974L;

			{
				put("00", "SUCCESS");
				put("-1", UNABLE_TO_PROCESS_MESSAGE); // System internal error.
				put("1", UNABLE_TO_PROCESS_MESSAGE); // System busy. Please try again later.
				put("10", UNABLE_TO_PROCESS_MESSAGE); // Request message structure is invalid.
				put("11", UNABLE_TO_PROCESS_MESSAGE); // Request message is invalid.
				put("12", UNABLE_TO_PROCESS_MESSAGE); // CommandID is invalid.
				put("13", UNABLE_TO_PROCESS_MESSAGE); // The OriginatorConversationID is duplicated.
				put("14", UNABLE_TO_PROCESS_MESSAGE); // The Caller information is invalid.
				put("15", UNABLE_TO_PROCESS_MESSAGE); // The CommandID is not assigned to the Caller.
				put("16", UNABLE_TO_PROCESS_MESSAGE); // The KeyOwner information is invalid.

				put("2000", UNABLE_TO_PROCESS_MESSAGE); // Initiator authentication error.
				put("2001", "Receiver is invalid.");
				put("2002", "Transaction information is invalid.");
				put("2003", UNABLE_TO_PROCESS_MESSAGE); // Service is invalid.
				put("2004", UNABLE_TO_PROCESS_MESSAGE); // Channel is invalid.
				put("2005", UNABLE_TO_PROCESS_MESSAGE); // Can not match the reason type.
				put("2006", "Limit is breached.");
				put("2007", "KYC File is invalid.");
				put("2008", "Amount is invalid.");
				put("2009", "Insufficient balance.");
				put("2010", "The MSISDN don't match with the CNIC.");
				put("2011", UNABLE_TO_PROCESS_MESSAGE); // The Original TID of registration does not exist.
				put("2012", UNABLE_TO_PROCESS_MESSAGE); // The registration order has not been rejected yet.
				put("2013", UNABLE_TO_PROCESS_MESSAGE); // New PIN is invalid.
				put("2014", UNABLE_TO_PROCESS_MESSAGE); // New Password is invalid.
				put("2016", UNABLE_TO_PROCESS_MESSAGE);
				put("2017", UNABLE_TO_PROCESS_MESSAGE); // Original transaction is not complete.
				put("2018", UNABLE_TO_PROCESS_MESSAGE); // Original transaction is not successful.
				put("2019", UNABLE_TO_PROCESS_MESSAGE); // Original transaction is reversing.
				put("2020", UNABLE_TO_PROCESS_MESSAGE); // Original transaction was already reversed.
				put("2021", UNABLE_TO_PROCESS_MESSAGE); // The NFC tag number already exists in the system.

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);
			}
		};

		public static final HashMap<String, String> UMPS_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 5199599392618110266L;

			{
				put("00", "SUCCESS");
				put("01", "The cardholder should contact the Issuer.");
				put("03", "Invalid merchant");
				put("04", "This card is picked up.");
				put("05", "The cardholder's certification fails");
				put("10", "Display the approved partial amount and prompt the operator.");
				put("11", "It is a VIP client.");
				put("12", "Invalid transaction");
				put("13", "Invalid amount");
				put("14", "Invalid card number");

				put("15", "This card has no corresponding Issuer.");
				put("16", "Update the third magnetic track.");
				put("21", "This card has not been initialized or it is a dormant card.");
				put("22", "Operation error or exceeding the allowable days for transaction");
				put("25", "There is no original transaction and please contact the Issuer.");
				put("30", UNABLE_TO_PROCESS_MESSAGE); // Please retry it.
				put("34", "Fraudulent card; pick-up card");
				put("38", "The times of PIN errors is beyond the limit, and please contact the Issuer.");
				put("40", "Transaction that is not supported by the Issuer");
				put("41",
						"The card has been reported for the loss, and captured (ATM). Lost card, please pick up it (POS).");
				put("43", "This card has been captured. Please contact the Issuer.");
				put("45", "Please use IC card");
				put("51", "Insufficient available balance");
				put("54", "The card is expired");
				put("55", "Wrong PIN");
				put("57", "This card is not allowed for transaction.");
				put("58", "The Issuer does not allow this card to be used for this transaction at this terminal.");
				put("59", "Error in the card verification");
				put("61", "Exceeds transaction limit");
				put("62", "Restricted card");
				put("64", "The transaction amount does not match with the original transaction amount.");

				put("65", "Exceed the limit for times of withdrawal");
				put("68", UNABLE_TO_PROCESS_MESSAGE); // Transaction time-out, please retry it.
				put("90", UNABLE_TO_PROCESS_MESSAGE); // The daily cutoff of the system is conducted. Please retry it
														// later.
				put("91", UNABLE_TO_PROCESS_MESSAGE); // Exceptional Issuer status, please retry it later.
				put("92", UNABLE_TO_PROCESS_MESSAGE); // The connectivity of Issuer is exceptional. Please retry it
														// later.
				put("94", UNABLE_TO_PROCESS_MESSAGE); // Reject, transaction duplicated. Please retry it later.
				put("96", UNABLE_TO_PROCESS_MESSAGE); // Reject the switching center exceptional. Please retry it later.
				put("97", UNABLE_TO_PROCESS_MESSAGE); // The terminal number has not been registered.
				put("98", UNABLE_TO_PROCESS_MESSAGE); // The Issuer is time out.
				put("99", UNABLE_TO_PROCESS_MESSAGE); // Error in PIN format. Please re-sign in.

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);

			}
		};

		public static final HashMap<String, String> EURONET_RESPONSE_MAP = new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 3009936467433872974L;

			{
				put("00", "SUCCESS");
				put("04", UNABLE_TO_PROCESS_MESSAGE);
				put("19", "Encryption Key Sync Error");
				put("01", "Message Format Error/Invalid Transaction");
				put("02", "Invalid Card Number");
				put("03", "Expired Card");
				put("20", "Card Status ‘Hot’ marked (Card Captured)");
				put("05", "Invalid Processing Code");
				put("06", "Invalid Amount");
				put("07", "Message Format Error");
				put("08", "Accepted Reversal");
				put("09", "Invalid Card Number"); // Do not Honor
				put("10", "System Malfunction");
				put("11", "PIN Tries Exceeded");
				put("12", "Invalid Account");
				put("13", "Invalid Account");
				put("14", "Exceeds Withdrawal Amount Limit");
				put("15", "Exceeds Withdrawal Frequency Limit");
				put("16", "Exceeds Withdrawal Amount Limit");
				put("17", "Transaction Count Limit Exceeded");
				put("18", "Message Format Error");
				put("21", "Restricted Card");
				put("22", "Do not Honor");
				put("23", "User not Defined");
				put("24", "Insufficient Funds");
				put("25", "Transaction Destination");
				put("26", "Accepted Reversal (Partial Dispense)");
				put("28", "Accepted Reversal");
				put("30", "Transaction not Permitted to Cardholder");
				put("31", "Accepted Reversal");
				put("32", "Account Status Invalid");
				put("33", "System Malfunction");
				put("37", "System Malfunction");
				put("34", "General Decline");
				put("35", "Account Status Invalid");
				put("36", "Card Issuer Unavailable");
				put("38", UNABLE_TO_PROCESS_MESSAGE);// "Duplicate
														// Transmission");
				put("39", UNABLE_TO_PROCESS_MESSAGE);// "Card Issuer Timed
														// Out");
				put("40", UNABLE_TO_PROCESS_MESSAGE);// "Accepted Reversal");
				put("43", UNABLE_TO_PROCESS_MESSAGE);// "PIN Tries Exceeded");
				put("50", UNABLE_TO_PROCESS_MESSAGE);// "Card Issuer Timed
														// Out");
				put("54", UNABLE_TO_PROCESS_MESSAGE);// "CVV Validation Error");
				put("55", UNABLE_TO_PROCESS_MESSAGE);// "CVV Validation Error");
				put("56", UNABLE_TO_PROCESS_MESSAGE);// "Expired Card");
				put("63", UNABLE_TO_PROCESS_MESSAGE);// "Accepted Reversal");
				put("65", UNABLE_TO_PROCESS_MESSAGE);// "Invalid Processing
														// Code");
				put("66", UNABLE_TO_PROCESS_MESSAGE);// "Accepted Reversal");
				put("68", "Tran. not successful due to bill already paid");
				put("71", UNABLE_TO_PROCESS_MESSAGE);// "Do not Honor");
				put("75", "Invalid Account");
				put("76", "Invalid Account");
				put("77", "Invalid Account");
				put("78", UNABLE_TO_PROCESS_MESSAGE);// "Exceeds Withdrawal
														// Amount Limit");
				put("79", UNABLE_TO_PROCESS_MESSAGE);// "Unable to locate record
														// in database");
				put("86", UNABLE_TO_PROCESS_MESSAGE);// "Transaction Destination
														// Cannot be Found");
				put("87", UNABLE_TO_PROCESS_MESSAGE);// "Restricted Card");
				put("93", UNABLE_TO_PROCESS_MESSAGE);// "Card Issuer
														// Unavailable");
				put("99", UNABLE_TO_PROCESS_MESSAGE);// "Accepted Reversal");
				put("59", UNABLE_TO_PROCESS_MESSAGE);// "Connection Timeout");
				put("58", UNABLE_TO_PROCESS_MESSAGE);// "Socket Timeout");
				put("95", UNABLE_TO_PROCESS_MESSAGE);// "EXCEPTION"

				put("100", UNABLE_TO_PROCESS_MESSAGE);
				put("500", UNABLE_TO_PROCESS_MESSAGE);
				put("501", UNABLE_TO_PROCESS_MESSAGE);
				put("503", UNABLE_TO_PROCESS_MESSAGE);
				put("504", UNABLE_TO_PROCESS_MESSAGE);
				put("505", UNABLE_TO_PROCESS_MESSAGE);
				put("507", UNABLE_TO_PROCESS_MESSAGE);
				put("508", UNABLE_TO_PROCESS_MESSAGE);
				put("509", UNABLE_TO_PROCESS_MESSAGE);
				put("510", UNABLE_TO_PROCESS_MESSAGE);
				
				
			}
		};

	}
	
	public static class ResponseDescription {
		public static final String CUSTOMER_NOT_FOUND = "Customer Not Found.";
		public static final String INVALID_ACCOUNT = "Invalid Account Details Provided.";
		public static final String ACCOUNT_NOT_FOUND = "Account Not Found.";
		public static final String UNABLE_TO_GET_ACCOUNT_TITLE = "Unable To Get Account Title";
		public static final String UNABLE_TO_PROCESS = "Unable to process at this time. Please, try again later";
		public static final String UNABLE_TRANSFER_FUNDS = "Unable To Transfer Funds";
		public static final String INVALID_TO_FROM_ACCOUNT = "Invalid To and From Account";
		public static final String PIN_ALREADY_GENERATED = "Pin Already Generated.";
		public static final String OK = "OK";
		public static final String TOKEN_GENERATED = "token successfully generated";
		public static final String USER_REGISTERED = "user successfully generated";
		public static final String INVALID_USERNAME_OR_PASSWORD = "Invalid username or password";
		
	}

	public static class BENEF_TYPES {
		public static final int ThreePFT = 1;// -- NBP
		public static final int IBFT = 2;// -- ALL_OTHER_BANKS
		public static final int UTILITY = 3;// -- //gas electricity phone paani
		public static final int TELCO = 4;// -- // mobile
		public static final int INTERNET = 5;// -- wateen waghera
		public static final int ONLINE_SHOPPING = 6; // daraz
		public static final int INSURANCE = 7;// -- //EFU_C, EFU_T, JLI_A,
												// JLI_I, JLI_NI
		public static final int EDUCATION = 8;// -- // LUMS, BeaconHouse,
		public static final int INVESTMENT = 9;
		public static final int OTHER = 10;
		public static final int GOVT = 11;
		public static final int PAYTOCNIC = 12;
		public static final int CREDITCARD = 13;
		public static final int TOPUP = 14;
		public static final int VOUCHER = 15;
		public static final int PAYBYIBAN = 16;


	}

	public static class ACTIVITY {
		public static final String Login = "Login";
		public static final String ThreePFT = "ThreePFT";
		public static final String IBFT = "IBFT";
		public static final String PAYTOCNIC = "PayToCNIC";
		public static final String PAYTOCNICSCREENING = "GetATAList";
		public static final String PAYTOCNIC_TITLE_FETCH = "PayToCNICTitleFetch";
		public static final String PAYTOCNIC_INCOMING_CALL = "PayToCNICIncomingPaymentCall";
		public static final String Create_Benef = "CreateBenef";
		public static final String Update_Benef = "UpdateBenef";
		public static final String Validate_Benef = "ValidateBenef";
		public static final String Delete_Benef = "DeleteBenef";
		public static final String ACCOUNT_STATEMENT = "AccStatement";
		public static final String CHANGE_PASSWORD = "ChangePassword";
		public static final String FORGET_PASSWORD = "ForgetPassword";
		public static final String RDA_FORGET_PASSWORD = "RdaForgetMPIN";
		public static final String RDA_FORGET_MPIN = "RdaForgetPassword";
		public static final String BillPayment = "BillPayment";
		public static final String Purchase = "MerchantPayment";
		public static final String ENABLE_DISABLE_FP = "Enable/Disable Fingerprint";
		public static final String SAVE_DEVICE_VALIDATE_OTP = "Save Device and Validate OTP";
		public static final String FIREBASE_NOTIFICATION = "FireBase Notification";
		public static final String OwnAccount = "OwnAccount";
		public static final String CARD_ACTIVATION = "CardActivation";
		public static final String CARD_VERIFICATION = "CardVerification";
		public static final String CHANGE_CARD_STATUS = "ChangeCardStatus";
		public static final String GET_CARD_STATUS = "GetCardStatus";
		public static final String NPC_PURCHASE = "NpcPurchase";
	}

	public static class Status {
		public static final String Success = "Success";
		public static final String Fail = "Fail";
		public static final String Processing = "Processing";
		public static final String Pending = "Pending";
	}

	public static class MPAY {

		public static final String TRANSFER_TITLE_FETCH = "RBTSTitleFetch"; // RBTS
																			// Call
		public static final String BALANCE_INQUIRY = "RBTSBalanceInquiry"; // RBTS
																			// Call
		public static final String FUNDS_TRANSFER = "RBTSFundTransfer"; // RBTS
																		// Call
		public static final String BALANCE_ENQUIRY = "BalanceEnquiry";
		
		public static final String ACCOUNT_INFORMATION = "GetAccountInformation"; // CRM
																					// Call
		// public static final String ACCOUNT_STATEMENT = "GetAccountStatement";
		// // CRM Call
		// public static final String ACCOUNT_INFORMATION_ISLAMIC =
		// "GetIslamicAccountInformation"; // CRM Call

		public static final String ACCOUNT_INFORMATION_REG = "GetAccountInformationRegistration";

		public static final String ACCOUNT_STATEMENT_ISLAMIC = "GetIslamicAccountStatement"; // CRM
																								// Call
		public static final String IBFT_FUNDS_TRANSFER = "OutgoingIBFT"; // One
																			// Link
																			// Call
		public static final String IBFT_TITLE_FETCH = "OneLinkTitleFetch"; // One
																			// Link
																			// Call
		public static final String GET_ACCOUNT_STATEMENT = "GetAccountStatement"; // CRM
																					// Call
		public static final String UBPS_INQUIRY = "ubpsInquiry"; // One Link
																	// Call
		public static final String UBPS_FUND_TRANSFER = "ubpsFundTransfer"; // OneLink Call

		public static final String PAY_TO_CNIC_TRANSFER = "payToCNIC";

		public static final String PAY_TO_CNIC_SCREENING = "GetATAList";

		public static final String PAY_TO_CNIC_TITLE_FETCH = "payToCNICTitleFetch";

		public static final String KPPSC_PAYMENT = "kppsc-payment";

		public static final String CARD_RELATIONSHIP_INQUIRY = "cardRelationshipInquiry"; // CRM

		public static final String CUSTOMER_DETAIL = "CustomerDetail"; // IRIS CRM

		public static final String PIN_VERIFICAION_INQUIRY = "pinValidation"; //

		public static final String PIN_CHANGE = "PINChange"; //

		public static final String ACTIVE_CARD_RDA = "ActivateCardRda"; //

		public static final String ACTIVE_CARD_RDA_NON_SAF = "ActivateCardRdaNonSaf"; //

		public static final String VALIDATE_PIN = "ValidatePin"; //

		public static final String SET_EMAIL_ADD = "SetEmailAdd"; //

		public static final String EMAIL_SERVICE_WITH_ATTACHMENT = "EmailServiceWithAttachement";

//		public static final String RDA_ACCOUNT_INFORMATION = "GetAccountInformationRda"; // AccountInformation
		public static final String RDA_CHECK_USERNAME_AVAILABILITY = "CheckUsernameAvailabilityRda"; // CheckUsernameAvailability
		public static final String RDA_FUNDS_TRANSFER = "RBTSFundTransferRda"; // RBTS Fund Transfer RDA
		public static final String RDA_REPATRIATION = "RepatriationRda"; // RBTS Repatriation RDA
		public static final String RDA_RBTS_PURCHASE = "RBTSPurchaseRda"; // RBTS Purchase RDA
		public static final String RDA_CUSTOMER_INVESTMENT_NPC = "CustomerInvestmentRdaNpc"; // NPC Customer
																								// InvestmentFF RDA
		public static final String RDA_CARD_ISSUANCE = "InsertApplicationRda"; // Card Issuance
		public static final String RDA_CHEQQUE_ISSUANCE = "InsertChequeRda"; // Card Issuance
		public static final String RDA_SHOW_INVESTMENT = "showInvestmentRdaNpc";
		public static final String RDA_ENCASHMENT = "customerEncashmentRdaNpc";
		public static final String RATES_RDA = "GetRatesRda";
		public static final String VERIFY_CHEQUE_BOOK = "verifyChequeBook";
		public static final String UPDATE_CHEQUE_BOOK = "updateChequeBook";
		public static final String GET_CARD_STATUS_RDA = "GetCardStatusRda";
		public static final String BLOCK_CARD_HOT = "BlockCardHotRda";
		public static final String BLOCK_CARD_WARM = "BlockCardWarmRda";
		public static final String NPC_STATEMENT = "NPCStatement";

		/// RAAST customer (CAS Services)
		public static final String ONE_STEP_REGISTRATION = "one-step-register";
		public static final String UPDATE_CUSTOMER_INFO = "update-customerInfo";
		public static final String UPDATE_CUSTOMER_STATUS = "update-customerStatus";
		public static final String DELETE_CUSTOMER = "delete-customer";

		/// RAAST Alias (CAS Services)
		public static final String UPDATE_ALIAS = "update-alias";
		public static final String UPDATE_ALIAS_STATUS = "update-aliasStatus";
		public static final String LINK_ALIAS_TO_ACCOUNT = "linkAliastoAccount";
		public static final String DELINK_ALIAS_FROM_ACCOUNT = "delinkAliasfromAccount";
		public static final String GET_ALIAS_ACCOUNTS = "get-aliasaccounts";
		public static final String REGISTER_ALIAS = "register-alias";

		/// RAAST Customer Account (CAS Services)
		public static final String LINK_ACCOUNT_TO_ALIAS = "linkAccount-toalias";
		public static final String DELINK_ACCOUNT_FROM_ALIAS = "delinkAccount-fromalias";
		public static final String DEFAULT_ACCOUNT_FOR_ALIAS = "defaultaccount-forAlias";
		public static final String DELETE_ACCOUNT = "delete-account";
		public static final String GET_DEFAULT_ACCOUNT_BY_ALIAS = "get-defaultAccountbyAlias";

		/// RAAST titlefetch (CAS Services)
		public static final String TITLE_FETCH = "titlefetch";
		public static final String GET_BANK_LIST = "get-bankList";
		public static final String CREDIT_INQUIRY = "credit-inquiry";
		public static final String PAYMENT_REQUEST = "payment-request";

	}

	public static class SMSTEMPLATES {

		public static final String LOGIN_SMS = "Dear Customer, you have successfully logged in to NBP %s Banking at %s on %s. For further assistance, please call NBP Helpline 021111627627.";
		public static final String FIRST_LOGIN_SMS = "Dear customer, welcome to the world of NBP Digital, your request for mobile banking activation has completed. Please enjoy the NBP Digital banking anytime anywhere in the world. For any assistance, please call NBP HELPLINE +9221-111-627-627.";
		public static final String INVALID_LOGIN_SMS = "Dear Customer, your recent login attempt failed. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String LOCKED_USER_SMS = "Dear Customer, User is locked due to multiple wrong password attempts. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String ADDACCOUNT_SMS = "Dear Customer, your account %s has been successfully added. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String CHANGE_PASS_SMS = "Dear Customer, your mobile banking password has been updated successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String CHANGE_MPIN_SMS = "Dear Customer, your MPIN has been changed successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String FPIN_GENERATION_SMS = "Dear Customer, your mobile banking financial transaction pin has been generated successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String FORGOT_PASS_SMS = "You have successfully changed your password. Please note your one time password second part %s against userid %s.";
		public static final String FORGOT_MPIN_SMS = "Dear Customer, your MPIN has been reset successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String REGISTER_PASS_SMS = "Dear Customer, you have successfully registered. Please note your One Time Password (OTP) second part is %s against userid %s.";
		public static final String SELF_REGISTER_SMS = "Dear Customer, Welcome to the world of NBP Digital, enjoy banking anytime and anywhere across the globe. For any assistance, please call NBP Helpline +9221-111-627-627.";

		public static final String SELF_REGISTER_SMS_2 = "Dear Customer, for activation, please call at +9221-111-627-627 or NBP Representative will call you & ask CNIC, Mother’s Name, DOB & Email Address for verification.";
		public static final String SELF_REGISTER_SMS_3 = "NBP representative will NEVER ask for your ATM/Debit Card #, ATM/Debit PIN, MPIN, OTP, Username or password. Please do not share such details with anyone. For any assistance, please call NBP Helpline +9221-111-627-627.";

		public static final String OTP_SMS = "Dear Customer, please do not share your OTP with anyone. Your OTP for %s transaction is %s. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String OTP_2FA_SMS = "Dear Customer, Your OTP for this device is %s. For further assistance, please call NBP HelpLine +9221-111-627-627.";

		public static final String FT_SENDER_SMS = "Dear Customer, You have successfully transferred %s. %s from Account %s to %s.";
		public static final String PURCHASE_SENDER_SMS = "Dear Customer, You have successfully made a retail transaction of %s %s from %s against your account %s on %s at %s.";
		public static final String FT_RCVR_SMS = "Dear Customer, You have successfully received %s. %s from Account %s to %s.";
		public static final String IBFT_SENDER_SMS = "Dear Customer, You have successfully transferred %s. %s from Account %s to %s.";
		public static final String IBFT_RCVR_SMS = "Dear Customer, You have successfully received %s. %s from Account %s to %s.";
		public static final String UBPS_SMS = "Dear Customer, bill payment of amount %s for Company Name %s Consumer %s successfully made on %s from Account %s.";
		// public static final String PAYTOCNIC_SMS = "You have successfully transferred
		// remmittance of PKR. %s from Account %s to CNIC %s on %s.";
		public static final String PAYTOCNIC_SMS = "Your request for sending remmittance of PKR. %s from Account %s to CNIC %s on %s.";

		public static final String PAYTOCNIC_RCVR_SMS = "You have successfully received remmittance of PKR. %s from Account %s to CNIC %s on %s.";
		public static final String BENEF_OTP_SMS = "Dear Customer, please do not share your OTP with anyone. Your second part of OTP for Beneficiary Addition of transaction %s is %s.";
		public static final String KPPSC_SMS = "Dear Customer, \nbill payment of amount PKR. %s for %s tranId %s successfully made on %s from Account %s.";
		public static final String CARD_PROV_SMS = "Dear Customer, \nYou have successfully provisioned your virtual card. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_DELETE_SMS = "Dear Customer, \nYou have successfully deleted your virtual card. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_PIN_CHANGE_SMS = "Dear Customer, \nYou have successfully changed your virtual card PIN. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_PIN_FORGOT_SMS = "Dear Customer, \nYou have successfully reset your virtual card PIN. For further assistance, call NBP Helpline: 021-111-627-627.";
	
		///cas
		public static final String PAYBYIBAN_SENDER_SMS = "Dear Customer, You have successfully transferred %s. %s from Account %s to %s.";
		public static final String PAYBYIBAN_RCVR_SMS = "Dear Customer, You have successfully received %s. %s from Account %s to %s.";
	
		//ONBOARDING
		public static final String OTP_SMS_ONBOARDING = "Dear Customer, please do not share your OTP with anyone. Your OTP for NBP Digital %s is %s. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String REG_SMS_ONBOARDING="Dear Customer, Your upgradation process has been completed. For email activation, please call at 021-111627627 or NBP Representative will call you @phone; ask CNIC, Mother’s Name, DOB @email Email Address for verification.";
		public static final String REG_SMS_ONBOARDING_COMP="Dear Customer, Congratulations Your NBP digital activation has been completed. Welcome to the world of NBP Digital, enjoy banking anytime and anywhere across the globe. For any assistance, please call NBP Helpline 021-111627627.";
		public static final String REG_EMAIL_ONBOARDING="Dear Customer, Congratulations Your NBP digital activation has been completed. Welcome to the world of NBP Digital, enjoy banking anytime and anywhere across the globe. For any assistance, please call NBP Helpline 021-111627627.";
		
	}

	public static class DISPLAYMESSAGES {
		public static final String FT_DISPLAY_MSG = "Dear %s, \nYou have successfully transferred %s. %s from Account %s to %s at %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String IBFT_DISPLAY_MSG = "Dear %s, \nYou have successfully transferred %s. %s from Account %s to %s at %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		// public static final String PAYTOCNIC_DISPLAY_MSG = "Dear %s, \nYou have
		// successfully transferred remmittance of PKR. %s from Account %s to CNIC %s at
		// %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String PAYTOCNIC_DISPLAY_MSG = "Dear %s, \nYour request for sending remmittance of PKR. %s from Account %s to CNIC %s at %s has successfully processed. For further assistance, please call NBP HelpLine 021-111-627-627.";

		public static final String FPIN_DISPLAY_MSG = "Dear Customer, \nYou have successfully generated your mobile banking financial transaction pin.";
		public static final String INVALID_FPIN_DISPLAY_MSG = "FPIN to be created as per below NBP FPIN Policy.\n\n"
				+ "a. FPIN Must contain alphanumeric (e.g.a-z, 0-9) characters.\n"
				+ "b. Should not contain uppercase characters.\n"
				+ "c. Should be only (6) alphanumeric characters long\n";

	}

	public static class EMAILTEMPLATES {

		public static final String LOGIN_EMAIL = "Dear Customer, \nyou have successfully logged in to NBP %s Banking at %s on %s. For further assistance, please call NBP Helpline 021-111-627-627.";
		public static final String FIRST_LOGIN_EMAIL = "Dear Customer, \nWelcome to the world of NBP Digital, please enjoy the NBP %s Banking anytime anywhere in the world. For any assistance, please call NBP HELPLINE 021-111-627-627.";
		public static final String INVALID_LOGIN_EMAIL = "Dear Customer, \nyour recent login attempt failed. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String LOCKED_USER_EMAIL = "Dear Customer, \nyour recent login attempt failed. User is locked due to multiple wrong password attempts. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String OTP_EMAIL = "Dear Customer, \nPlease do not share your OTP with anyone. \nYour OTP for %s transaction is %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String OTP_2FA_EMAIL = "Dear Customer, \nYour OTP for this device is %s. For further assistance, please call NBP HelpLine 021-111-627-627.";

		public static final String CHANGE_PASS_EMAIL = "Dear Customer,\nYour mobile banking password has been updated successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String CHANGE_MPIN_EMAIL = "Dear Customer,\nYour MPIN has been changed successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String CHANGE_FRMU = "Dear FRMU,\nMultiple registration having different CNIC found against same device id.\nDevice Id: %s\nKindly check it on priority to minmize fraudlent risk.\nThanks.";
		public static final String FPIN_GENERATION_EMAIL = "Dear Customer, your mobile banking financial transaction pin has been generated successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String FORGOT_PASS_EMAIL = "Dear Customer, \\nYou have successfully changed your password. Please note your first part of one time password %s against userid %s. For further assistance, please call NBP Helpline 021-111-627-627.\\n\\n";
		public static final String FORGOT_MPIN_EMAIL = "Dear Customer,\nYour MPIN has been reset successfully. For further assistance, please call NBP HelpLine +9221-111-627-627.";
		public static final String REGISTER_PASS_EMAIL = "Dear Customer, \\nYou have successfully registered on NBP Digital. Please note your One Time Password's first part is %s against userid %s. For further assistance, please call NBP HelpLine 021-111-627-627.\\n\\n";

		public static final String SELF_REGISTER_EMAIL = "Dear Customer, \nCongratulations! You have successfully registered. Welcome to the world of NBP Digital.\n\nNBP Call Center representative will contact you shortly on your registered mobile number for transaction activation till then you can enjoy mobile banking with limited access anytime & anywhere across the globe. For further assistance, please call NBP HelpLine 021-111-627-627.\n\n";
		public static final String SELF_REGISTER_EMAIL_2 = "Dear Customer, \\nThanks for registration, for NBP Digital (Mobile App or Internet Banking) activation to perform financial transaction, please call at 021-111627627 or NBP Representative will contact you & ask CNIC, Mother’s Name, DOB & Email Address for verification.\\nNBP representative will NEVER ask for your ATM/Debit Card #, ATM/Debit PIN, MPIN, One-time Password (OTP), username and password. Please do not share such details with anyone. For further assistance, please call NBP Helpline 021-111-627-627.\\n For NBP Digital App details and quick help please visit our page https://nbp.com.pk/digital/index.aspx\\n\\n";

		public static final String FT_SENDER_EMAIL = "Dear %s, \nYou have successfully transferred %s. %s from Account# %s to %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String PURCHASE_SENDER_EMAIL = "Dear %s, You have successfully made a retail transaction of %s %s from %s against your account %s on %s at %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String FT_RCVR_EMAIL = "Dear %s, \nYou have successfully received %s. %s from Account# %s to %s. For further assistance, please call NBP HelpLine 021-111-627-627.";
		public static final String IBFT_SENDER_EMAIL = "Dear %s, \nYou have successfully transferred %s. %s from Account# %s to %s. For further assistance, please call NBP HelpLine: 021-111-627-627.";
		public static final String IBFT_RCVR_EMAIL = "Dear %s, \nYou have successfully received %s. %s from Account# %s to %s.";
		public static final String UBPS_EMAIL = "Dear Customer, \nbill payment of amount PKR. %s for Company Name %s Consumer# %s successfully made on %s from Account# %s. For further assistance, please call helpline 021-111-627-627.";
		public static final String KPPSC_EMAIL = "Dear Customer, \nbill payment of amount PKR. %s for %s tranId# %s successfully made on %s from Account# %s. For further assistance, please call helpline 021-111-627-627.";
		// public static final String PAYTOCNIC_EMAIL = "Dear Customer, <br /><br />You
		// have successfully transferred remmittance of PKR. %s from Account %s to CNIC
		// %s at %s. <br /><br />For further assistance, please call helpline
		// 021-111-627-627.";
		public static final String PAYTOCNIC_EMAIL = "Dear Customer, \nYour request for sending remmittance of PKR. %s from Account %s to CNIC %s at %s. \nFor further assistance, please call helpline 021-111-627-627.";

		public static final String PAYTOCNIC_RCVR_EMAIL = "Dear Customer, \nYou have successfully received remmittance of PKR. %s from Account %s to CNIC %s at %s. \nFor further assistance, please call helpline 021-111-627-627.";
		public static final String BENEF_OTP_EMAIL = "Dear Customer, \nPlease do not share your OTP with anyone. \nYour first part of OTP for Beneficiary Addition of transaction %s is %s. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_PROV_EMAIL = "Dear Customer, \nYou have successfully provisioned your virtual card. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_DELETE_EMAIL = "Dear Customer, \nYou have successfully deleted your virtual card. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_PIN_CHANGE_EMAIL = "Dear Customer, \nYou have successfully changed your virtual card PIN. For further assistance, call NBP Helpline: 021-111-627-627.";
		public static final String CARD_PIN_FORGOT_EMAIL = "Dear Customer, \nYou have successfully reset your virtual card PIN. For further assistance, call NBP Helpline: 021-111-627-627.";

		///cas
		public static final String PAYBYIBAN_SENDER_EMAIL = "Dear %s, \nYou have successfully transferred %s. %s from Account# %s to %s. For further assistance, please call NBP HelpLine: 021-111-627-627.";
		public static final String PAYBYIBAN_RCVR_EMAIL = "Dear %s, \nYou have successfully received %s. %s from Account# %s to %s.";
		
		public static final String CREATE_BENEFI_EMAIL = getCreateBeneficiaryEmailMessage();

		public static String getIBFTEmailMessage() {
			String StrBody;
			StrBody = "     <style type=text/css> ";
			StrBody = StrBody + " p { ";
			StrBody = StrBody + " font-family: Tahoma; ";
			StrBody = StrBody + " } ";
			StrBody = StrBody + " p { ";
			StrBody = StrBody + " font-size: 12px; ";
			StrBody = StrBody + " } ";
			StrBody = StrBody + " </style> ";
			// StrBody = StrBody + " <p><strong>&nbsp;</strong></p> ";
			StrBody = StrBody + " <p><strong>Dear %s," + "</strong> ";// totitle
			StrBody = StrBody + "   <br /> ";
			StrBody = StrBody + "   <br /> ";
			StrBody = StrBody + "You have received a transfer credit of PKR %s ."
					+ "Following are the details of the transaction:";// amount
			StrBody = StrBody + "<br/>";
			StrBody = StrBody + "<br></br>";

			StrBody = StrBody + "<table border=1 align=left>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Sender: %s </td>";// fromtitle
			StrBody = StrBody + "    <td>Transaction Type: IBFT </td>   ";
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Amount: %s </td>";// amount
			StrBody = StrBody + "    <td>To Bank: %s </td>    ";// bankname
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Reference No: %s </td>";// rrn
			StrBody = StrBody + "    <td>Beneficiary Name: %s </td>";// totile
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + " <tr>";
			StrBody = StrBody + "    <td>Date: " + new java.util.Date() + "</td>";
			StrBody = StrBody + "    <td>Beneficiary Account: %s </td>       ";// toaccount
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Comments: %s </td>";// comments
			StrBody = StrBody + "    <td>Transaction status: Successful</td>        ";
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "</table>";
			StrBody = StrBody + " <br /> ";
			StrBody = StrBody + " <br /> ";
			StrBody = StrBody + " <br></br> ";
			StrBody = StrBody + " <br></br> ";
			StrBody = StrBody + " <br></br> ";
			StrBody = StrBody + " Regards, <br /> ";
			StrBody = StrBody + " National Bank of Pakistan</p>";
			StrBody = StrBody + "<br></br>";
			StrBody = StrBody
					+ "<i><font face=times new roman color=green size=4>Please do not print this e-mail unless it is absolutely necessary.</font></i>";
			StrBody = StrBody
					+ " <p>This message (including any attachments) is confidential and may be privileged. If you have received it by mistake please notify the sender by return email and delete this message from your system. Any unauthorized use or dissemination of this message in whole or in part is strictly prohibited. Please note that emails are susceptible to change. Bank Alfalah Limited shall not be liable for the improper or incomplete transmission of the information contained in this communication nor for any delay in its receipt or damage to your system. Bank Alfalah Limited neither guarantee that the integrity of this communication has been maintained nor that this communication is free of viruses, interceptions or interference.<br />";
			return StrBody = StrBody
					+ " <br />  <em><u>Please do not reply to this message via e-mail. This address is  automated, unattended, and cannot help with questions or requests. </u></em></p>";

		}

		public static String getThreePFTEmailMessage() {
			String StrBody;
			StrBody = "     <style type=text/css> ";
			StrBody = StrBody + " p { ";
			StrBody = StrBody + " font-family: Tahoma; ";
			StrBody = StrBody + " } ";
			StrBody = StrBody + " p { ";
			StrBody = StrBody + " font-size: 12px; ";
			StrBody = StrBody + " } ";
			StrBody = StrBody + " </style> ";
			// StrBody = StrBody + " <p><strong>&nbsp;</strong></p> ";
			StrBody = StrBody + " <p><strong>Dear %s ," + "</strong> ";// totile
			StrBody = StrBody + "   <br /> ";
			StrBody = StrBody + "   <br /> ";
			StrBody = StrBody + "You have received a transfer credit of PKR %s ."
					+ "Following are the details of the transaction:";// amount
			StrBody = StrBody + "<br/>";
			StrBody = StrBody + "<br></br>";

			StrBody = StrBody + "<table border=1 align=left>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Sender: %s </td>";// fromtitle
			StrBody = StrBody + "    <td>Transaction Type: FT </td> ";
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Amount: %s </td>";// amount
			StrBody = StrBody + "    <td>To Bank: National Bank of Pakistan </td>    ";
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Reference No: %s </td>";// rrn
			StrBody = StrBody + "    <td>Beneficiary Name: %s </td>";// totitle
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + " <tr>";
			StrBody = StrBody + "    <td>Date: " + new java.util.Date() + "</td>";
			StrBody = StrBody + "    <td>Beneficiary Account: %s </td>       ";// toaccount
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "  <tr>";
			StrBody = StrBody + "    <td>Comments: %s </td>";// comments
			StrBody = StrBody + "    <td>Transaction status: Successful</td>        ";
			StrBody = StrBody + "  </tr>";
			StrBody = StrBody + "</table>";
			StrBody = StrBody + " <br /> ";
			StrBody = StrBody + " <br /> ";
			StrBody = StrBody + "<br></br>";
			StrBody = StrBody + "<br></br>";
			StrBody = StrBody + "<br></br>";
			StrBody = StrBody + " Regards, <br /> ";
			StrBody = StrBody + " National Bank of Pakistan</p>";
			StrBody = StrBody + "<br></br>";
			StrBody = StrBody
					+ "<i><font face=times new roman color=green size=4>Please do not print this e-mail unless it is absolutely necessary.</font></i>";
			return StrBody = StrBody
					+ " <br />  <em><u>Please do not reply to this message via e-mail. This address is  automated, unattended, and cannot help with questions or requests. </u></em></p>";

		}

		public static String getCreateBeneficiaryEmailMessage() {
			String StrBody;
			StrBody = "     <style type=text/css> ";
			StrBody = StrBody + " p { ";
			StrBody = StrBody + " font-family: Tahoma; ";
			StrBody = StrBody + " } ";
			StrBody = StrBody + " p { ";
			StrBody = StrBody + " font-size: 12px; ";
			StrBody = StrBody + " } ";
			StrBody = StrBody + " </style> ";

			StrBody = StrBody + " <p><strong>Dear NBP User, </strong><br /> ";
			StrBody = StrBody + "   <br /> ";
			StrBody = StrBody
					+ " The first part of your authentication code is %s . The second part is sent to your registered mobile number.<br /> ";
			StrBody = StrBody + " Please enter the codes in the relevant fields to complete the transaction.<br /> ";
			StrBody = StrBody + " <br /> ";
			StrBody = StrBody + " <br /> ";
			StrBody = StrBody + " Regards, <br /> ";
			StrBody = StrBody + " National Bank of Pakistan</p> ";
			StrBody = StrBody
					+ " <p>This email is confidential. If you are not  the addressee you may not copy, forward, disclose or use any part of it. If you  have received this email in error, please delete all copies from your system. <br /> ";
			StrBody = StrBody
					+ " Internet  communications cannot be guaranteed to be timely, secure, error or virus-free.  We do not accept liability for any errors or omissions.<br /> ";
			StrBody = StrBody + " <br /> ";
			return StrBody = StrBody
					+ " <em><u>Please do not reply to this message via e-mail. This address is  automated, unattended, and cannot help with questions or requests. </u></em></p> ";

		}
	}

	public static final String SAMPLE_PDF_STRING = "";
	
	
	public static class Onboarding {
		public static final String ONBOARDING_STEP_1 = "Customer-onboarding-1";
		public static final String ONBOARDING_STEP_2 = "Customer-onboarding-2";
		public static final String ONBOARDING_STEP_3 = "Customer-onboarding-3";
		public static final String ONBOARDING_STEP_4 = "Customer-onboarding-4";
		public static final String REG_MISMATCH_EMAIL="Incorrect Email Provided";
		
	}
	
	public static class MPAY_REQUEST_METHODS {

		public static final String FUNDS_TRANSFER = "fundsTransfer";
		public static final String IBFT = "ibftDebit";

		public static final String REGISTER_PIN = "RegisterPin";
		public static final String IS_PIN_ENABLED = "IsPinEnabled";

		public static final String GET_ACCOUNT_DETAIL_BY_CNIC = "getAccountDetailByCnic";
		public static final String GET_CARDS_BY_CNIC = "getDetailsByAccountNumber";
		
		public static final String UBPS_INQUIRY = "ubpsInquiry";
        public static final String UBPS_FUND_TRANSFER = "ubpsFundTransfer"; // OneLink Call

	}

}
