package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTitleExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//find the active element on the website
		driver.findElement(By.name("username")).sendKeys("admin");
		//type java on the text box
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		//type java on the text box
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Enter";
		if(actualTitle.contains(expectedTitle))
			System.out.println("pass");
		else
			System.out.println("fail");
			
		Thread.sleep(2000);
		//close all the browsers including child browsers 
		driver.quit();
	
	
	
	}

}
