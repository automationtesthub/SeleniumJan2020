package com.vtiger.runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
	
	
	@Before
	public void before()
	{
		System.out.println("This is before Hooks");
	}
	
	@After
	public void after()
	{
		System.out.println("This is after Hooks");
	}

}
