package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("https://opensourcebilling.org/wp-login.php/");
		//find the element and clear the text present in textbox
		driver.findElement(By.id("email")).clear();
		//close the browser        
        driver.close();
	//optimised code: WebElement e=driver.findElement(By.linktext("Google")).click(); 
	}

}
