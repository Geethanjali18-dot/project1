package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTripAutoSuggestion {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("Ban");
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//li[@class='list']"));
		int count=allAutoSugg.size();
		for(int i=0;i<count;i++)
		{
			String text=allAutoSugg.get(i).getText();
			System.out.println(text);
		}
		
		System.out.println(allAutoSugg.get(count-1).getText());
		driver.close();
		
	}

}
