package com.pages;

import com.microsoft.playwright.Page;

public class LogIn extends BaseClass {
	private Page page = null;
	public LogIn(Page page){
		this.page = page;
	}
	String username = "//input[@id='user-name']";
	String password= "//input[@id='password']";
	
	public void enterUserName() {
		page.locator(username).fill("standard_user");
		page.locator(password).fill("secret_sauce");
		test.pass("entered user name ");
	}

}
