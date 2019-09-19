/**
 * 
 */
package com.firstautomation.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.firstautomation.flows.Example_Flow_OpenDriverBrowser;



/**
 * @author LilianaF
 *
 */
public class ExampleTest_SelenumPage {
	public static WebDriver webdriver;
	
	@Before 
	public void start()
	{
		
	}
	
	@Test
	public void flow_example (){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lilianaf\\Documents\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOptions("useAutomationExtension", false);
		options.addArguments("--disable-popup-blocking");
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		
		
		//link
		
		driver.get("https://www.seleniumhq.org/download/");
		
		Example_Flow_OpenDriverBrowser example_Flow_OpenDriverBrowser = new Example_Flow_OpenDriverBrowser(driver);
		example_Flow_OpenDriverBrowser.seleniumPage();
		
	}
	
	

}
