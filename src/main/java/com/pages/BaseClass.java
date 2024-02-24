package com.pages;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {
	public static ExtentReports extent = new ExtentReports();
	public static ExtentSparkReporter spark = new ExtentSparkReporter("TestResult.html");
	public static ExtentTest test;
	Playwright playwright;
	BrowserType chrome;
	Browser browser;
	BrowserContext browserContext;
	protected Page page;
	@BeforeMethod
	public void startReport() {
		extent.attachReporter(spark);
	}
	@AfterMethod
	public void afterTest() {
		extent.flush();
	}
	@BeforeTest
	public void initializeBrowser() {
		     playwright = Playwright.create();
			 chrome =playwright.chromium();
		     browser = chrome.launch(new
		     BrowserType.LaunchOptions().setHeadless(false));
			 page =    browser.newPage();
			 page.navigate("https://www.saucedemo.com/");
		     System.out.println(page.title()); 		    
		
	}
	@AfterTest
	public void TearDown() {
		page.close();
	}

}
