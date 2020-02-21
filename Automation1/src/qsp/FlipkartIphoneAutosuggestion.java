package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphoneAutosuggestion {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	Thread.sleep(2000);
	List<WebElement> allAutoSugg = driver.findElements(By.xpath("//div[@class='_2kpuIQ']"));
	int count=allAutoSugg.size();
	for(int i=0;i<count;i++)
	{
		String text=allAutoSugg.get(i).getText();
		System.out.println(text);
	}
	driver.close();
}
}
