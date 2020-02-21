package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Pradeep/Desktop/test1.html");
		WebElement e=driver.findElement(By.tagName("a"));
        e.click();
	//optimised code: WebElement e=driver.findElement(By.tagName("a")).click(); 
	}

}
