

package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class Demo4 extends BaseClass {
	@Test
	public void modifyCustomer()
	{
		Reporter.log("ModifyCustomer",true);
	}
}
