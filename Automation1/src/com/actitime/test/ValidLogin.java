package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class ValidLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setuser("admin","manager");
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.logoutClick();
		driver.close();
	}
}
