package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.Pages.HeaderPage;
import com.vtiger.Pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends BaseTest {
	
	
	
	@Given("^User should b on login page$")
	public void user_should_b_on_login_page() throws Throwable {
		openUrl();
		
	    
	}

	@When("^User enters valid userid and password$")
	public void user_enters_valid_userid_and_password() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.login();
	}

	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
	    System.out.println("Check home page");
	}

	@Then("^Logout link  should be visible$")
	public void logout_link_should_be_visible() throws Throwable {
		HeaderPage hp = new HeaderPage(driver);
		hp.clickLogout();
	}
	
	@Then("^close application$")
	public void close_application() throws Throwable {
	   driver.quit();
	}

	@When("^User enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_and(String userid, String pwd) throws Throwable {
		LoginPage lp = new LoginPage(driver);
	    lp.InValidLogin(userid, pwd);
	}

	@Then("^user should be on login page with error msg$")
	public void user_should_be_on_login_page_with_error_msg() throws Throwable {
		LoginPage lp = new LoginPage(driver);
	    lp.verifyErrorMsg();
	   
	}

	@Then("^message should be \"([^\"]*)\"$")
	public void message_should_be(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
	    lp.verifyErrorMsg();
	}

	@Then("^title should be matched$")
	public void title_should_be_matched() throws Throwable {
	    LoginPage lp = new LoginPage(driver);
	    lp.verifyTitle();
	}

	@Then("^logo should be displayed$")
	public void logo_should_be_displayed() throws Throwable {
		LoginPage lp = new LoginPage(driver);
	    lp.verifyLogo();
	}
	
	


}
