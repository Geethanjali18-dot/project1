package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(priority=2)
	public void testCreateCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test(priority=1,dependsOnMethods="testCreateCustomer")
	public void deleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}

}