package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	
	private WebDriver driver;
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//###############page factory###################
	@FindBy(linkText="Logout")
	WebElement lnk_logout;
	@FindBy(linkText="New Lead")
	WebElement lnk_NewLead;
	@FindBy(linkText="My Account")
	WebElement lnk_MyAccount;
	
	
	
	public void clickLogout()
	{
		lnk_logout.click();
	}
	
	public void clickNewLead()
	{
		lnk_NewLead.click();
	}
	public void clickMyAccount()
	{
		lnk_MyAccount.click();
	}
	

}
