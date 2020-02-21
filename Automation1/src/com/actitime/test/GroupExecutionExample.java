package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupExecutionExample {
	
	@Test(groups= {"regression","smoke"})
	public void createCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test(groups= {"regression"})
	public void deleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}
	@Test(groups= {"regression"})
	public void editCustomer()
	{
		Reporter.log("editCustomer",true);
	}
}

/* testNg .xml
 * <groups>
 * 	<run>
 * 		<include name="smoke"/>
 * 	</run>
 * </groups>
 */
