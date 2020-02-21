package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select s=new Select(monthListBox);
		s.selectByIndex(9);
		Thread.sleep(2000);
		s.selectByValue("12");
		Thread.sleep(2000);
		s.selectByVisibleText("May");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	

}
