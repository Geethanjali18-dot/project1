package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyParentBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String expectedTitle = driver.getTitle();
		//get the session id or window handles of all the browsers
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh) {
			//transfer the driver control to all the browsers one by one
			driver.switchTo().window(wh);
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
		//to  not to close the parent browser if match is true 
		
		}
		
		else
		{//to  close all the child browsers except parent browser
		driver.close();
		}
	
	}


}
}
