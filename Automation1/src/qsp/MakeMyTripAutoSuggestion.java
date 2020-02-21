package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).sendKeys("Ban");
		Thread.sleep(2000);
		 List<WebElement> allAutoSugg = driver.findElements(By.xpath("//p[contains(.,'Ban') and contains(@class,'font14')]"));
		//List<WebElement> allAutoSugg = driver.findElements(By.className("//p[contains(.,'Ban')]"));
//		List<WebElement> allAutoSugg = driver.findElements(By.className("calc60"));
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
