package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
	driver.get("https://www.facebook.com/");
	WebElement dob_day = driver.findElement(By.id("day"));
	Select s=new Select(dob_day);
	s.selectByIndex(10);
	WebElement dob_month = driver.findElement(By.id("month"));
	Select s1=new Select(dob_month);
	s1.selectByValue("10");
	WebElement dob_year = driver.findElement(By.id("year"));
	Select s2=new Select(dob_year);
	s2.selectByVisibleText("1989");
	driver.close();
	
	
	
	
	}

}
