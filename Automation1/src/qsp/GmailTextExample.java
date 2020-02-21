package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTextExample {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement we = driver.findElement(By.linkText("Gmail"));
				String text = we.getText();
		//or WebElement text = driver.findElement(By.className("gb_g")).getText();
		System.out.println(text);
		
		//close the browser
		driver.close();
		
		
	}

}
