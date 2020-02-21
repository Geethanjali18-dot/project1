package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
		driver.get("https://www.flipkart.com/");
		//to  find all the links matching with a 
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
	}
}
