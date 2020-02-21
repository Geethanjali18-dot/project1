package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethodExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com/");
		//close all the browsers including child browsers 
		driver.quit();
	
	}

}
