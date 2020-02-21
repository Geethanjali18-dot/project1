package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratorExample {
	
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
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 10x"+Keys.ENTER);
		driver.findElement(By.xpath("//div[.='Apple iPhone X (Space Gray, 256 GB)']")).click();
		Set<String> allwh = driver.getWindowHandles();
		java.util.Iterator<String> itr=allwh.iterator();
		String parentwh = itr.next();
		String childwh = itr.next();
		String childwh1 = itr.next();
		driver.switchTo().window(childwh1);
driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.findElement(By.xpath("//button[.='BUY NOW']")).click();
		driver.close();
		driver.switchTo().window(parentwh);
		driver.close();
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		