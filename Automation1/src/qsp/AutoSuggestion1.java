package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		List<WebElement> allSugg=driver.findElements(By.xpath("//span[.='iphone']"));
	
		int count=allSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		int j=count--;		
			String lastSugg=allSugg.get(j).getText();
			System.out.println(lastSugg);
			allSugg.get(j).click();
			driver.close();
		
		
	}

}
