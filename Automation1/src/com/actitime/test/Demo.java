package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
//@Test(enabled=false)
	//@Test(invocationcount=2)
	//@Test(priority=1,invocationCount=2)
	@Test
	public void testDemo()
	{
		//System.out.println("hi");
		Reporter.log("bye",true);
	}
	//@Test (priority=2)
	@Test
	public void testCreateCustomer()
	{
		
		Reporter.log("CreateCustomer",true);
	}
	//@Test (priority=3)
	@Test
	public void testDeleteCustomer()
	{
		
		Reporter.log("DeleteCustomer",true);
	}
}
