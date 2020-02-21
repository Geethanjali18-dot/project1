package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetXExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		int x1value=driver.findElement(By.id("username")).getLocation().getX();
		int x2value=driver.findElement(By.name("pwd")).getLocation().getX();
		if(x1value==x2value)
		{
			System.out.println("pass");
			System.out.println(x1value);
		}
		else
		{
			System.out.println("fail");
			System.out.println(x2value);
		}
		//close the browser        
        driver.close();
	 
	}

}
