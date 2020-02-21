package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("ban");
		List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='list']"));
		int count=allSugg.size();
		for(int i=0;i<count;i++)
		{
			String text=allSugg.get(i).getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//a[contains(text(),'Bangalore,')]")).click();
		
		driver.close();
			
		
		
		
	}
}
