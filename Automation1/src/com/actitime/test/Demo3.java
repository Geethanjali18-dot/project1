package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test
	public void registerCustomer()
	{
		Reporter.log("registerCustomer",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}
	@Test(priority=2,invocationCount=2)
	public void editeCustomer()
	{
		Reporter.log("editeCustomer",true);
	}

}
