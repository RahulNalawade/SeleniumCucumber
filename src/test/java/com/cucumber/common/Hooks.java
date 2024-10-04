package com.cucumber.common;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumber.pages.RegistrationPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BasePage {

	@Before //Cucumber Before Hook
	public static void setupDriver() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-infobars");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
		webDriver = new ChromeDriver(options);
		webDriver.manage().window().maximize();
		
		
	}
	
	@Before
    public void beforeScenario(Scenario scenario) {
        ExtentManager.createTest(scenario.getName());
        GloabalVariable.scenario=scenario.getName();
    }

	@After // Cucumber After hook
	public static void quitDriver() throws Exception {
		webDriver.quit();
	}
	
	
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws Exception {
		{
			if(scenario.isFailed())
			{
				String fileName  = getScreenShot(webDriver, "FAILED_");
				byte[] fileContent = FileUtils.readFileToByteArray(new File(fileName));
				scenario.attach(fileContent, "image/png", "image");
			}
		}
	}
	
	@After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            ExtentManager.getTest().fail("Test failed: " + scenario.getName());
        } else {
            ExtentManager.getTest().pass("Test passed: " + scenario.getName());
        }
        ExtentManager.endReport();
    }

}
