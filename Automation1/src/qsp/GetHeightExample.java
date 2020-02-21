package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		Dimension size1=driver.findElement(By.id("username")).getSize();
		Dimension size2=driver.findElement(By.name("pwd")).getSize();
		int height1=size1.getHeight();
		int height2=size2.getHeight();
		System.out.println(height1);
		System.out.println(height2);
		if(height1==height2)
		{
			System.out.println("pass");
			System.out.println("height1"+" "+height1+"height2"+" "+height2);
			
		}
		else
		{
			System.out.println("fail");
			
		}
		//close the browser        
        driver.close();
	 
	}

}
