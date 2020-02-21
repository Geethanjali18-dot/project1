package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsLogoDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		 boolean display = driver.findElement(By.className("atLogoImg")).isDisplayed();
		 //if( driver.findElement(By.className("atLogoImg")).isDisplayed()==true);
		if(display==true)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}
		//close the browser        
        driver.close();
	 
	}

}
