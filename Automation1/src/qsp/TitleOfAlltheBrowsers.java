package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfAlltheBrowsers {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//get the session id or window handles of all the browsers
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh) {
			//transfer the driver control to all the browsers one by one
			driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
		//to close all browsers one by one without using quit by using window handles
		driver.close();
		}
		//driver.quit();
		
	
	}

}
