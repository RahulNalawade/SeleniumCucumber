package com.cucumber.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.common.BasePage;

public class PageUtils extends BasePage{


	
	public static void getUrl(WebDriver driver,String url)
	{
		driver.get(url);
	}
	
	public static void sendInput(WebDriver driver,WebElement ele,String input)
	{
		ele.clear();
		ele.sendKeys(input);
	}

	public static void clickOnElement(WebElement ele)
	{
		ele.click();
	}

	public static void selectCheckBox(WebElement ele)
	{
		if(!ele.isSelected())
		{
			ele.click();
		}
	}

	public static void dropDown(WebElement ele,String text)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(text);
	}

	public static String getText(WebElement ele)
	{
		String text=ele.getText();	
		return text;
	}

	public static void scrollToElement(WebDriver driver, WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public static void scrollToExactText(WebDriver driver,String element) {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		WebElement el = driver.findElement(By.xpath("//*[contains(text(),'"+element+"')]"));
		jse.executeScript("arguments[0].scrollIntoView();", el);
	}
	
	 public static void isElementTextExits(WebDriver driver,String value) {
		 
	    	String string="//*[contains(text(),'%s')]";
	        WebElement ele = driver.findElement(By.xpath(String.format(string, value)));
	        ele.isDisplayed();
	 }
	

	public static void scroll(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,000)", "");
	}

	  public static void clickOnText(WebDriver driver,String value) {
	    	String string="//*[text()='%s']";
	        WebElement ele = driver.findElement(By.xpath(String.format(string, value)));
	        ele.click();
	    }
}