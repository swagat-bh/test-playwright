package com.testscripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.pages.BaseClass;
import com.pages.LogIn;

public class TestPlayScript extends BaseClass{
	
	@Test
	public void testcase() {
	test = extent.createTest("Verify that test is completed Successfully");
	test.pass("tests");
	LogIn login = new LogIn (page);
	login.enterUserName();
	

	}

}
