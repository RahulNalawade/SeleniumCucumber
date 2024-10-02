package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.common.BasePage;
import com.cucumber.pageobjects.RegistrationPageLocator;

import com.cucumber.utils.PageUtils;

public class HomePage extends BasePage{
	
	WebDriver webDriver;
	
	
	public HomePage(WebDriver driver) {
		this.webDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= RegistrationPageLocator.SIGN_UP_BUTTON)
	public WebElement signUpLink;
	
	@FindBy(css= RegistrationPageLocator.HOME_SCREEN_VISIBLE)
	public WebElement homescreen;
	
	@FindBy(css= RegistrationPageLocator.NEW_USER_SIGNUP_LABEL)
	public WebElement newUserSignUplabel;
	
	/**This method is used to click on singUp option
	 * @author nalawade_r
	 * @return [boolean] : True after selecting the singUp, false otherwise
	 */
	public boolean clickOnSignUp() {
		boolean flag = false;
		try {
			PageUtils.clickOnElement(signUpLink);
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**This method is used to launch the given site URL
	 * @author nalawade_r
	 * @return [boolean] : True after launch the site, false otherwise
	 */
	public boolean launchSite(String url) {
		boolean flag = false;
		try {
			PageUtils.getUrl(webDriver, url);
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**This method is used to verify home page is visible successfully
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean verifyHomePageVisible() {
		boolean flag = false;
		try {
			homescreen.isDisplayed();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	/**This method is used to verify home page is visible successfully
	 * @author nalawade_r
	 * @return [boolean] : True after verified, false otherwise
	 */
	public boolean verifyNewUserSignUpVisible() {
		boolean flag = false;
		try {
			homescreen.isDisplayed();
			return true;
		} catch (Exception e) {
			return flag;
		}
	}
	
	
	
	
}
