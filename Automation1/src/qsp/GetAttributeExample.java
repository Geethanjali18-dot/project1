package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeExample {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//get the attribute of href attribute of the gmail link
		String LinkUrl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		
		System.out.println(LinkUrl);
		
		//close the browser
		driver.close();
		
		
	}

}
