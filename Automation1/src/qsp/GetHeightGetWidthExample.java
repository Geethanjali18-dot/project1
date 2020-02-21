package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightGetWidthExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		Dimension size=driver.findElement(By.id("username")).getSize();
		int height1=size.getHeight();
		int width1=size.getWidth();
		System.out.println(height1);
		System.out.println(width1);
		//close the browser        
        driver.close();
	 
	}

}
