package com.firstautomation.flows;

import org.openqa.selenium.WebDriver;

import com.firstautomation.pages.Example_Page_OpenDriverBrowser;

public class Example_Flow_OpenDriverBrowser {
WebDriver webdriver = null;

	public Example_Flow_OpenDriverBrowser(WebDriver webdriver) {
	this.webdriver = webdriver;
	}
	
	public void seleniumPage()
	{
		Example_Page_OpenDriverBrowser example_Page_OpenDriverBrowser = new Example_Page_OpenDriverBrowser(webdriver);
		example_Page_OpenDriverBrowser.clickOnChromeLink();
		
	}

}
