package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.common.BasePage;
import com.cucumber.common.GloabalVariable;
import com.cucumber.pageobjects.RegistrationPageLocator;

public class RegistrationPage extends BasePage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = RegistrationPageLocator.USER_NAME)
	public WebElement userName;

	@FindBy(css = RegistrationPageLocator.EMAIL_ADDRESS)
	public WebElement emailAddress;

	@FindBy(css = RegistrationPageLocator.SIGNUP_BUTTON)
	public WebElement signUpButton;

	@FindBy(xpath = RegistrationPageLocator.ENTER_ACCOUNT_INFORMATION)
	public WebElement enterAccountInformationLabel;

	@FindBy(css = RegistrationPageLocator.TITLE_MR)
	public WebElement titleMr;

	@FindBy(css = RegistrationPageLocator.PASSWORD)
	public WebElement password;

	@FindBy(xpath = RegistrationPageLocator.DAY)
	public WebElement day;

	@FindBy(xpath = RegistrationPageLocator.MONTH)
	public WebElement month;

	@FindBy(xpath = RegistrationPageLocator.YEAR)
	public WebElement year;

	@FindBy(xpath = RegistrationPageLocator.NEWSLETTER_CHECKBOX)
	public WebElement newsLetterCheckbox;

	@FindBy(xpath = RegistrationPageLocator.RECEIVE_OFFER_CHECKBOX)
	public WebElement receiveOfferCheckbox;

	@FindBy(xpath = RegistrationPageLocator.FIRST_NAME)
	public WebElement firstName;

	@FindBy(xpath = RegistrationPageLocator.LAST_NAME)
	public WebElement lastName;

	@FindBy(xpath = RegistrationPageLocator.COMPANY)
	public WebElement company;

	@FindBy(xpath = RegistrationPageLocator.STREET_ADDRESS)
	public WebElement streetAddress;

	@FindBy(xpath = RegistrationPageLocator.COUNTRY)
	public WebElement country;

	@FindBy(xpath = RegistrationPageLocator.STATE)
	public WebElement state;

	@FindBy(xpath = RegistrationPageLocator.CITY)
	public WebElement city;

	@FindBy(xpath = RegistrationPageLocator.ZIPCODE)
	public WebElement zipCode;

	@FindBy(xpath = RegistrationPageLocator.MOBILE_NUMBER)
	public WebElement mobileNumber;

	@FindBy(xpath = RegistrationPageLocator.CREATE_ACCOUNT_BUTTON)
	public WebElement createAccountButton;

	@FindBy(xpath = RegistrationPageLocator.ACCOUNT_CREATED)
	public WebElement accountCreatedLabel;

	@FindBy(xpath = RegistrationPageLocator.CONTINUE_BUTTON)
	public WebElement continueButton;

	@FindBy(xpath = RegistrationPageLocator.LOGGED_IN_AS_USER)
	public WebElement loggedInAsUser;

	@FindBy(xpath = RegistrationPageLocator.DELETE_ACCOUNT)
	public WebElement deleteAccountButton;

	@FindBy(xpath = RegistrationPageLocator.ACCOUNT_DELETED_LABEL)
	public WebElement accountDeletedLabel;

	public boolean clickOnSignUp() {
		boolean flag = false;
		try {
			signUpButton.click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is used to verify home page is visible successfully
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean userVerifyVisibility(String label) {
		boolean flag = false;
		try {
			String xpathString = RegistrationPageLocator.TEXT.replaceAll("TEXT", label);
			driver.findElement(By.xpath(xpathString)).isDisplayed();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is used to verify home page is visible successfully
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean userClickOnText(String label) {
		boolean flag = false;
		try {
			String xpathString = RegistrationPageLocator.TEXT.replaceAll("TEXT", label);
			driver.findElement(By.xpath(xpathString)).click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is user enter the name
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean userEnterName(String name) {
		boolean flag = false;
		try {
			userName.sendKeys(name);
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is user enter the name
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean userEnterEmail(String email) {
		boolean flag = false;
		try {
			emailAddress.sendKeys(email);
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is user select the title
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after select, false otherwise
	 */
	public boolean userSelectTitle() {
		boolean flag = false;
		try {
			titleMr.click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is user select the newsLetter checkbox
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after select, false otherwise
	 */
	public boolean userSelectNewsletterCheckbox() {
		boolean flag = false;
		try {
			newsLetterCheckbox.click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is user select the newsLetter checkbox
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after select, false otherwise
	 */
	public boolean userEnterPassword(String pass) {
		boolean flag = false;
		try {
			password.sendKeys(pass);
			;
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	/**
	 * This method is user select the Date of birth
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after set successfully, false otherwise
	 */
	public boolean selectDOB(String dob) {
		boolean flag = false;
		String days = dob.split("/")[0];
		String months = dob.split("/")[1];
		String years = dob.split("/")[2];
		try {
			Select selDay = new Select(driver.findElement(By.id("days")));
			selDay.selectByValue(days);
			Select selMonth = new Select(driver.findElement(By.id("months")));
			selMonth.selectByValue(months);
			Select selYear = new Select(driver.findElement(By.id("years")));
			selYear.selectByValue(years);
			return true;
		} catch (Exception e) {
			return flag;
		}
	}

	public boolean selectCheckBoxes() {
		boolean flag = false;
		try {
			newsLetterCheckbox.click();
			receiveOfferCheckbox.click();
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setUserFirstName(String first) {
		boolean flag = false;
		try {
			firstName.sendKeys(first);
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setUserLastName(String last) {
		boolean flag = false;
		try {
			lastName.sendKeys(last);
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setCompanyName(String comp) {
		boolean flag = false;
		try {
			company.sendKeys(comp);
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setAddress(String add) {
		boolean flag = false;
		try {
			streetAddress.sendKeys(add);
			GloabalVariable.strAddress=add;
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setCountry(String cont) {
		boolean flag = false;
		try {
			country.sendKeys(cont);
			GloabalVariable.strCountry=cont;
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setState(String stat) {
		boolean flag = false;
		try {
			state.sendKeys(stat);
			GloabalVariable.strState=stat;
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setCity(String cty) {
		boolean flag = false;
		try {
			city.sendKeys(cty);
			GloabalVariable.strCity=cty;
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setMobileNumber(String mob) {
		boolean flag = false;
		try {
			mobileNumber.sendKeys(mob);
			return true;
		} catch (Exception e) {
			return flag;
		}

	}

	public boolean setZipCode(String zip) {
		boolean flag = false;
		try {
			zipCode.sendKeys(zip);
			GloabalVariable.strPincode=zip;
			return true;
		} catch (Exception e) {
			return flag;
		}

	}
	
	/**This method is used to verify home page is visible successfully
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean userVerifyLoggedUser(String user) {
		boolean flag = false;
		try {
			if (loggedInAsUser.getText().equals(user)) {
				return true;
			} else {
				return flag;
			}
		} catch (Exception e) {
			return flag;
		}
	}

}
