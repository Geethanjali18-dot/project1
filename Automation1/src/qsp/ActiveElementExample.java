package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		//find the active element on the website
		WebElement e=driver.switchTo().activeElement();
		//type java on the text box
		e.sendKeys("Java");
		Thread.sleep(2000);
		//close all the browsers including child browsers 
		driver.quit();
	
	}

}
