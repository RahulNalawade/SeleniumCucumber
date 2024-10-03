
package com.cucumber.stepdefinitions;

import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;
import com.cucumber.common.BasePage;
import com.cucumber.common.ExtentManager;
import com.cucumber.pages.AddToCartPage;
import com.cucumber.pages.CheckoutPage;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Registration extends BasePage {

	HomePage homePage = null;
	CheckoutPage checkOutPage = null;
	AddToCartPage addToCartPage = null;
	RegistrationPage registrationPage = null;
	JavascriptExecutor js = (JavascriptExecutor) webDriver;

	public Registration() {
		try {
			this.homePage = new HomePage(webDriver);
			this.checkOutPage = new CheckoutPage(webDriver);
			this.addToCartPage = new AddToCartPage(webDriver);
			this.registrationPage = new RegistrationPage(webDriver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Given("User launch website {string}")
	public void user_launch_website(String site) {
		Boolean flag = homePage.launchSite(site);
		IsTrue(flag, "User able to launch site " + site, "User failed to lauch site " + site);

	}

	@Given("User verify that home page is visible successfully")
	public void user_verify_that_home_page_is_visible_successfully() {
		Boolean flag = homePage.verifyHomePageVisible();
		IsTrue(flag, "User able to verify home pase is visible", "User unable to verify home pase is visible");

	}

	@Given("User click on {string} button")
	public void user_click_on_button(String string) throws InterruptedException {
		Boolean flag = registrationPage.userClickOnText(string);
		IsTrue(flag, "User able to click on " + string, "User unable to click on " + string);

	}

	@Given("User click on {string} button on home screen")
	public void user_click_on_button_on_home_screen(String string) throws InterruptedException {
		Boolean flag = registrationPage.clickOnSignUp();
		IsTrue(flag, "User click on " + string + "button on home screen",
				"User unable click on " + string + "button on home screen");
	}

	@Given("User click on {string} link")
	public void user_click_on_link(String string) throws InterruptedException {
		Boolean flag = homePage.clickOnSignUp();
		IsTrue(flag, "User able to click on " + string + " link", "User unable to click on " + string + " link");

	}

	@Given("User verify {string} is visible")
	public void user_verify_is_visible(String string) {
		Boolean flag = registrationPage.userVerifyVisibility(string);
		IsTrue(flag, "User able to verify " + string + " is visible",
				"User unable to verify " + string + " is visible");

	}

	@Then("User enter following name and email address")
	public void user_enter_name_email(Map<String, String> userDetails) {
		for (Map.Entry<String, String> entry : userDetails.entrySet()) {
			Boolean name = registrationPage.userEnterName(entry.getKey());
			int randomNum = 1 + (int) (Math.random() * 100);
			String emailId = entry.getValue().concat(Integer.toString(randomNum));
			Boolean email = registrationPage.userEnterEmail(emailId);
			IsTrue(name, "User able to enter name as a " + entry.getKey(),
					"User unable to enter name as a " + entry.getKey());
			IsTrue(email, "User able to enter email as a " + emailId, "User unable to enter email as a" + emailId);
		}
	}

	@Then("User fill all the following details to create account")
	public void user_fill_all_following_details_to_create_account(Map<String, String> userDetails) {
		for (Map.Entry<String, String> entry : userDetails.entrySet()) {
			Boolean flag = false;
			if (entry.getKey().contains("Title")) {
				flag = registrationPage.userClickOnText(entry.getValue());
				IsTrue(flag, "User able to select option as a " + entry.getValue(),
						"User unable to select option as a " + entry.getValue());
			} else if (entry.getKey().contains("Password")) {
				flag = registrationPage.userEnterPassword(entry.getValue());
				IsTrue(flag, "User able to set password " + entry.getValue(),
						"User unable to set password " + entry.getValue());
			} else if (entry.getKey().contains("DOB")) {
				js.executeScript("window.scrollBy(0,250)");
				flag = registrationPage.selectDOB(entry.getValue());
				IsTrue(flag, "User able to set DOB " + entry.getValue(), "User unable to set DOB " + entry.getValue());
				flag = registrationPage.selectCheckBoxes();
				IsTrue(flag, "User able to select checkbox", "User unable to select checkbox");
			} else if (entry.getKey().contains("FirstName")) {
				js.executeScript("window.scrollBy(0,250)");
				flag = registrationPage.setUserFirstName(entry.getValue());
				IsTrue(flag, "User able to enter first name " + entry.getValue(),
						"User unable to enter first name " + entry.getValue());
			} else if (entry.getKey().contains("LastName")) {
				flag = registrationPage.setUserLastName(entry.getValue());
				IsTrue(flag, "User able to enter last name " + entry.getValue(),
						"User unable to enter last name " + entry.getValue());
			} else if (entry.getKey().contains("Company")) {
				js.executeScript("window.scrollBy(0,250)");
				flag = registrationPage.setCompanyName(entry.getValue());
				IsTrue(flag, "User able to enter company name " + entry.getValue(),
						"User unable to enter company name " + entry.getValue());
			} else if (entry.getKey().contains("Address")) {
				flag = registrationPage.setAddress(entry.getValue());
				IsTrue(flag, "User able to enter address " + entry.getValue(),
						"User unable to enter address " + entry.getValue());
			} else if (entry.getKey().contains("Country")) {
				flag = registrationPage.setCountry(entry.getValue());
				IsTrue(flag, "User able to enter country name " + entry.getValue(),
						"User unable to enter country name " + entry.getValue());
			} else if (entry.getKey().contains("State")) {
				flag = registrationPage.setState(entry.getValue());
				IsTrue(flag, "User able to enter state name " + entry.getValue(),
						"User unable to enter state name " + entry.getValue());
				js.executeScript("window.scrollBy(0,250)");
			} else if (entry.getKey().contains("City")) {
				flag = registrationPage.setCity(entry.getValue());
				IsTrue(flag, "User able to enter city name " + entry.getValue(),
						"User unable to enter city name " + entry.getValue());
			} else if (entry.getKey().contains("Zipcode")) {
				flag = registrationPage.setZipCode(entry.getValue());
				IsTrue(flag, "User able to enter zipcode " + entry.getValue(),
						"User unable to enter city name " + entry.getValue());
				js.executeScript("window.scrollBy(0,250)");
			} else if (entry.getKey().contains("MobileNo")) {
				flag = registrationPage.setMobileNumber(entry.getValue());
				IsTrue(flag, "User able to enter mobile number " + entry.getValue(),
						"User unable to enter mobile number " + entry.getValue());
			}
		}
	}

	@Then("User verify {string} is visible on home screen")
	public void user_verify_is_visible_on_home(String string) {
		Boolean flag = registrationPage.userVerifyLoggedUser(string);
		IsTrue(flag, "User able to verify " + string + " is visible on home screen",
				"User unable to verify " + string + " is visible on home screen");

	}
	
	@Then("User close the browser")
	public void user_close_browser() {
		webDriver.quit();
	}
	

}
