package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	
public static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException
	{
		FileLib f=new FileLib();
		driver.get(f.getPropertyData("url"));
		
	}
	@AfterMethod
	public void logout()
	{
		//driver.findElement(By.id("logoutLink")).click();
	}

}
