package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWidthExample {
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
		int width1=size1.getWidth();
		int width2=size2.getWidth();
		System.out.println(width1);
		System.out.println(width2);
		if(width1==width2)
		{
			System.out.println("pass");
			System.out.println("width1"+" "+width1+"width2"+" "+width2);
		}
		else
		{
			System.out.println("fail");
			
		}
		//close the browser        
        driver.close();
	 
	}

}
