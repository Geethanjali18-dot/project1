package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.name("flight_origin")).sendKeys("Ban");
		 List<WebElement> allAutoSugg = driver.findElements(By.xpath("//p[contains(.,'Ban')]"));
		int count=allAutoSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=allAutoSugg.get(i).getText();
			System.out.println(text);
		}
		
		System.out.println(allAutoSugg.get(count-1).getText());
		driver.close();
	}

}
