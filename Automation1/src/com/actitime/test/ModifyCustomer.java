package com.actitime.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass1;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class ModifyCustomer extends BaseClass1 {
@Test
public void modifyCustomer()
{
	Reporter.log("modifyCustomer",true);
	Assert.fail();
}
@Test
public void createCustomer()
{
	Reporter.log("createCustomer",true);
}
}
