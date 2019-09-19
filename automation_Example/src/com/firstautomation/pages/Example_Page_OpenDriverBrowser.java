package com.firstautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example_Page_OpenDriverBrowser {
	WebDriver webdriver = null;
	public static final By CHROMELINK = By.xpath("//a[contains(text(),'Google Chrome Driver')]");
	public Example_Page_OpenDriverBrowser(WebDriver webdriver) {
		this.webdriver = webdriver;
	
	}
	public void clickOnChromeLink()
	{
		webdriver.findElement(CHROMELINK).click();
		System.out.println("clicked on link");
	}
	

}
