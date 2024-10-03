package com.cucumber.common;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class BasePage {
	
	public static String fullClassName, className, methodName;
	public static int lineNumber;
	public static WebDriver webDriver;
	public static String Execution_REPORT_PATH, SCREENSHOT_PATH_FAIL, SCREENSHOT_PATH_PASS, Execution_REPORT_PATH_API;
	
	
	public void IsTrue(boolean condition, String passMessage, String failMessage) {
		try {
			Assert.assertTrue(condition,failMessage);
			logInfo(passMessage);
			ExtentManager.getTest().pass(passMessage);
		} catch (Throwable e) {
			logError(failMessage);
			ExtentManager.getTest().fail(failMessage);
			ExtentManager.getTest().addScreenCaptureFromPath(SCREENSHOT_PATH_FAIL);
			try {
				if(webDriver!=null)
				{
					getScreenShot(webDriver, "FAILED_");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			throw e;
		}
	}
	
	/**
	 * This method 'logInfo' is used to print a informational message to log file.
	 * 
	 * @param message [String] : A message you want to print in your log
	 */
	public static void logInfo(String message) {
		fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
		className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
		lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
		Logger logger = LogManager.getLogger(className);
		String print = lineNumber + " - " + message;
		logger.info(print);
	}

	/**
	 * This method 'logError' is used to print error message to log file.
	 * 
	 * @param message [String] : A message you want to print in your log
	 */
	public static void logError(String message) {
		fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
		className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
		lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
		Logger logger = LogManager.getLogger(className);
		String print = lineNumber + " - " + message;
		logger.error(print);
	}
	
	public static String getScreenShot(WebDriver driver, String screenshotName) throws Exception {
		try {
	    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = SCREENSHOT_PATH_FAIL + screenshotName+GloabalVariable.scenario.getName()+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(scrFile, finalDestination);
		return destination;
		} catch (Exception e) {
		logInfo("============ScreenShot Error=======================\n"+e.getLocalizedMessage());
		return null;
		}
	}
}
