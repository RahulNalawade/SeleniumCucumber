package com.cucumber.stepdefinitions;

import com.cucumber.common.BasePage;
import com.cucumber.common.GloabalVariable;
import com.cucumber.pages.AddToCartPage;
import com.cucumber.pages.CheckoutPage;
import com.cucumber.pages.HomePage;
import com.cucumber.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCart extends BasePage {

	HomePage homePage = null;
	CheckoutPage checkOutPage = null;
	AddToCartPage addToCartPage = null;
	RegistrationPage registrationPage = null;
	BasePage base = null;

	public AddToCart() {
		this.base = new BasePage();
		try {
			this.homePage = new HomePage(webDriver);
			this.checkOutPage = new CheckoutPage(webDriver);
			this.addToCartPage = new AddToCartPage(webDriver);
			this.registrationPage = new RegistrationPage(webDriver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Given("User Hover over first product and click on Add to cart")
	public void user_hover_over_first_product() throws InterruptedException {
		Boolean flag = addToCartPage.hoverOnFirstProduct();
		Thread.sleep(2000);
		GloabalVariable.strFirstProductName = addToCartPage.firstProductName.getText();
		flag = addToCartPage.clickOnFirstProductAddToCart();
		Thread.sleep(5000);
		IsTrue(flag, "User able to hover over first product and able to click on Add to cart",
				"User unable to hover over first product and unable to click on Add to cart");

	}

	@Given("User Hover over second product and click on Add to cart")
	public void user_hover_over_second_product() throws InterruptedException {
		Boolean flag = addToCartPage.hoverOnSecondProduct();
		GloabalVariable.strSecondProductName = addToCartPage.secondProductName.getText();
		flag = addToCartPage.clickOnSecondProductAddToCart();
		Thread.sleep(5000);
		IsTrue(flag, "User able to hover over second product and able to click on Add to cart",
				"User unable to hover over second product and unable to click on Add to cart");

	}

	@Then("User verify added product in cart with name, price, quantity and total")
	public void user_verify_added_product() {
		Boolean flag = addToCartPage.verifyBothProductDetailsOnCart();
		IsTrue(flag, "User able to verify added product details like name, price, quantity and total",
				"User unable to verify added product details like name, price, quantity and total");

	}

	@Given("User click on {string} link button")
	public void user_click_on_link_button(String string) throws InterruptedException {
		Boolean flag = addToCartPage.clickOnProductLink();
		IsTrue(flag, "User able to click on " + string + "link button",
				"User unable to click on " + string + " link button");

	}

	@Then("User verify delivery address is same address filled at the time registration of account")
	public void user_verify_delivery_address_is_same_address() throws InterruptedException {
		Boolean flag = checkOutPage.verifyDeliveryAddress();
		IsTrue(flag, "User able to verify delivery address is same address filled at the time registration of account",
				"User unable to verify delivery address is same address filled at the time registration of account");

	}

	@Then("User billing address is same address filled at the time registration of account")
	public void user_verify_billing_address_is_same_address() throws InterruptedException {
		Boolean flag = checkOutPage.verifyBillingAddress();
		IsTrue(flag, "User able to verify billing address is same address filled at the time registration of account",
				"User unable to verify billing address is same address filled at the time registration of account");

	}

	@Given("User click on Proceed To Checkout button on cart screen")
	public void user_click_on_Proceed_To_Checkout() throws InterruptedException {
		Boolean flag = addToCartPage.clickOnCheckout();
		IsTrue(flag, "User able to click on Proceed To Checkout button on cart screen",
				"User unable to click on Proceed To Checkout button on cart screen");

	}

}
