package com.cucumber.pageobjects;

public class RegistrationPageLocator {
	
	public static final String SIGN_UP_BUTTON = "a[href='/login']";
	public static final String HOME_SCREEN_VISIBLE = "img[alt='Website for automation practice']";
	public static final String NEW_USER_SIGNUP_LABEL = "//h2[normalize-space()='New User Signup!']";
	public static final String USER_NAME = "input[placeholder='Name']";
	public static final String EMAIL_ADDRESS = "input[data-qa='signup-email']";
	public static final String SIGNUP_BUTTON = "button[data-qa='signup-button']";
	public static final String ENTER_ACCOUNT_INFORMATION = "//b[normalize-space()='Enter Account Information']";
	public static final String TITLE_MR = "label[for='id_gender1']";
	public static final String PASSWORD = "#password";
	public static final String DAY="//select[@id='days']";
	public static final String MONTH="//select[@id='months']";
	public static final String YEAR="//select[@id='years']";
	public static final String NEWSLETTER_CHECKBOX="//input[@id='newsletter']";
	public static final String RECEIVE_OFFER_CHECKBOX="//input[@id='optin']";
	public static final String FIRST_NAME="//input[@id='first_name']";
	public static final String LAST_NAME="//input[@id='last_name']";
	public static final String COMPANY="//input[@id='company']";
	public static final String STREET_ADDRESS="//input[@id='address1']";
	public static final String COUNTRY="//select[@id='country']";
	public static final String STATE="//input[@id='state']";
	public static final String CITY="//input[@id='city']";
	public static final String ZIPCODE="//input[@id='zipcode']";
	public static final String MOBILE_NUMBER="//input[@id='mobile_number']";
	public static final String CREATE_ACCOUNT_BUTTON="//button[normalize-space()='Create Account']";
	public static final String ACCOUNT_CREATED="//b[normalize-space()='Account Created!']";
	public static final String CONTINUE_BUTTON="//a[@class='btn btn-primary']";
	public static final String LOGGED_IN_AS_USER="//*[contains(text(),'Logged in as')]";
	public static final String DELETE_ACCOUNT="//*[text()=' Delete Account']";
	public static final String ACCOUNT_DELETED_LABEL="	//b[normalize-space()='Account Deleted!']";
	public static final String TEXT="(//*[normalize-space()='TEXT'])[1]";
	
}
