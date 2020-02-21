package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetValidate {
	@Test
public void testGoogle()
{
	String eTitle="Google123";
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String aTitle=driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(aTitle, eTitle);
	driver.close();
	s.assertAll();
}
}
