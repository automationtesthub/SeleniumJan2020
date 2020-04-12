package com.vtiger.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	private String expectedTitle = "vtiger CRM - Commercial Open Source CRM123";
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//By tb_username = By.name("user_name");
	//By tb_password = By.name("user_password");
	//By btn_login = By.name("Login");
	
	//###############page factory###################
	@FindBy(name="user_name")
	WebElement tb_username;
	@FindBy(how = How.NAME, using = "user_password") 
	WebElement tb_password;
	@FindBy(name="Login")
	WebElement btn_login;
	@FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
	WebElement img_logo;
	@FindBy(xpath="//*[contains(text(),'You must specify a valid username and password.')]")
	WebElement err_msg;
	
	
	
	public void login()
	{	
		tb_username.clear();
		tb_username.sendKeys("admin");
		tb_password.clear();
		tb_password.sendKeys("admin");
		btn_login.click();
	}
	
	public void InValidLogin(String userid, String pwd)
	{	
		tb_username.clear();
		tb_username.sendKeys(userid);
		tb_password.clear();
		tb_password.sendKeys(pwd);
		btn_login.click();		
	}
	
	public boolean verifyTitle()
	{
		if(expectedTitle.equals(driver.getTitle().trim()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyLogo()
	{
		if(img_logo.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyErrorMsg()
	{
		if(err_msg.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
