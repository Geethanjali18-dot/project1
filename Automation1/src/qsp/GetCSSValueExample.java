package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueExample {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Create a Page"));
		
				System.out.println(link.getCssValue("color"));
					System.out.println(link.getCssValue("font-family"));
		
		//close the browser
		driver.close();
		
		
	}

}
