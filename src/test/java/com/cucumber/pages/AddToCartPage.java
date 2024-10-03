package com.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.common.BasePage;
import com.cucumber.common.GloabalVariable;
import com.cucumber.pageobjects.AddToCartPageLocator;

public class AddToCartPage extends BasePage{
	
	
	@SuppressWarnings("static-access")
	public AddToCartPage(WebDriver driver) {
		this.webDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= AddToCartPageLocator.FIRST_PRODUCT)
	public WebElement firstProductForHover;
	
	@FindBy(xpath= AddToCartPageLocator.SECOND_PRODUCT)
	public WebElement secondProductForHover;
	
	@FindBy(xpath= AddToCartPageLocator.FIRST_ADD_TO_CART)
	public WebElement firstAddToProduct;
	
	@FindBy(xpath= AddToCartPageLocator.SECOND_ADD_TO_CART)
	public WebElement secondAddToProduct;
	
	@FindBy(xpath= AddToCartPageLocator.VIEW_CART)
	public WebElement viewCart;
	
	@FindBy(css= AddToCartPageLocator.FIRST_PRODUCT_PRICE)
	public WebElement firstProductPrice;
	
	@FindBy(css= AddToCartPageLocator.SECOND_PRODUCT_PRICE)
	public WebElement secondProductPrice;
	
	@FindBy(css= AddToCartPageLocator.FIRST_PRODUCT_QUANTITY)
	public WebElement firstProductQuantity;
	
	@FindBy(css= AddToCartPageLocator.SECOND_PRODUCT_QUANTITY)
	public WebElement secondProductQuantity;
	
	@FindBy(css= AddToCartPageLocator.FIRST_PRODUCT_TOTAL)
	public WebElement firstProductTotal;
	
	@FindBy(css= AddToCartPageLocator.SECOND_PRODUCT_TOTAL)
	public WebElement secondProductTotal;
	
	@FindBy(css= AddToCartPageLocator.FIRST_PRODUCT_NAME_CART)
	public WebElement firstProductNameCart;
	
	@FindBy(css= AddToCartPageLocator.SECOND_PRODUCT_NAME_CART)
	public WebElement secondProductNameCart;
	
	@FindBy(xpath= AddToCartPageLocator.SECOND_PRODUCT_NAME)
	public WebElement secondProductName;
	
	@FindBy(xpath= AddToCartPageLocator.FIRST_PRODUCT_NAME)
	public WebElement firstProductName;
	
	@FindBy(xpath= AddToCartPageLocator.PRODUCT_LINK)
	public WebElement productLink;
	
	@FindBy(xpath= AddToCartPageLocator.PROCEED_TO_CHECKOUT)
	public WebElement proceedToCheckout;
	
	/**
	 * This method is used to hover over on first product
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean hoverOnFirstProduct() {
		boolean flag = false;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			js.executeScript("window.scrollBy(0,415)");
			Actions action = new Actions(webDriver);
			action.moveToElement(firstProductForHover).build().perform();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**
	 * This method is used to hover over on second product
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean hoverOnSecondProduct() {
		boolean flag = false;
		try {
			Actions action = new Actions(webDriver);
			action.moveToElement(secondProductForHover).build().perform();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**
	 * This method is used to add to cart first product
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean clickOnFirstProductAddToCart() {
		boolean flag = false;
		try {
			firstAddToProduct.click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**
	 * This method is used to add to cart second product
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean clickOnSecondProductAddToCart() {
		boolean flag = false;
		try {
			secondAddToProduct.click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**
	 * This method is used to verify both product on cart
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean verifyBothProductDetailsOnCart() {
		boolean flag = false;
		try {
			String first= firstProductNameCart.getText();
			String second= secondProductNameCart.getText();
			String firstPrice= firstProductPrice.getText();
			String secondPrice=secondProductPrice.getText();
			String firstProductQty= firstProductQuantity.getText();
			String secondProductQty= secondProductQuantity.getText();
			String firstProductTot= firstProductTotal.getText();
			String secondProductTot= secondProductTotal.getText();
			if(first.equals(GloabalVariable.strFirstProductName) && second.equals(GloabalVariable.strSecondProductName) && !firstPrice.equals(null) && !secondPrice.equals(null) && !firstProductQty.equals(null) && !secondProductQty.equals(null) && !firstProductTot.equals(null) && !secondProductTot.equals(null))
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
	 * This method is used to click on Product link button
	 * 
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean clickOnProductLink() {
		boolean flag = false;
		try {
			productLink.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	public boolean clickOnCheckout() {
		boolean flag = false;
		try {
			proceedToCheckout.click();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	
	
	
	
	
	
	
}
