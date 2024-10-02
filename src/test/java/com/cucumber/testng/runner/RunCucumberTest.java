package com.cucumber.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		tags = "@CheckoutProduct or @Registration or @AddToCart",

		features = "classpath:features", glue = { "com.cucumber.common", "com.cucumber.stepdefinitions",
				"com.cucumber.testng.runner" },

		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-reports/cucumberreport.html", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		monochrome = true)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
