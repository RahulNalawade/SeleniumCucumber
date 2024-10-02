package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.common.BasePage;
import com.cucumber.common.GloabalVariable;
import com.cucumber.pageobjects.CheckoutPageLocator;

public class CheckoutPage extends BasePage{
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= CheckoutPageLocator.DELIVERY_ADDRESS)
	public WebElement deliveryAddress;
	
	@FindBy(css= CheckoutPageLocator.BILLING_ADDRESS)
	public WebElement billingAddress;
	
	

	/**
	 * This method is used to verify delivery address same as registration address
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean verifyDeliveryAddress() {
		boolean flag = false;
		try {
			String address=deliveryAddress.getText();
			
			if(address.contains(GloabalVariable.strAddress))
			{
				return true;
			}
			else
			{
				return flag;
			}
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**
	 * This method is used to verify billing address same as registration address
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean verifyBillingAddress() {
		boolean flag = false;
		try {
			String address=billingAddress.getText();
			
			if(address.contains(GloabalVariable.strAddress))
			{
				return true;
			}
			else
			{
				return flag;
			}
		} catch (Exception e) {
			return flag;
		}
	}
	
}
