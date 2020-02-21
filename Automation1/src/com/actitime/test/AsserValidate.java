package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AsserValidate {
	@Test
public void testGoogle()
{
	String eTitle="Google123";
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String aTitle=driver.getTitle();
	/*if(aTitle.equals(eTitle))
	{
		Reporter.log("pass",true);
	}
	else
	{
		Reporter.log("fail",true);
	} */
	Assert.assertEquals(aTitle, eTitle);
	driver.close();
}
}
