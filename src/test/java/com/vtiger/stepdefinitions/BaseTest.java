package com.vtiger.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.common.GenericMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	//public ExtentHtmlReporter htmlReporter;
	//public ExtentReports extent;
	//public ExtentTest logger;
	public void openUrl()
	{
		//System.setProperty("webdriver.chrome.driver", "E:/Selenium/Selenium_Software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
	}
	
	
}
