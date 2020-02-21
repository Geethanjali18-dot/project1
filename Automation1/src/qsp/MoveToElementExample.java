package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Actions a=new Actions(driver);
WebElement ResourcesDD = driver.findElement(By.xpath("//a[contains(.,'Resources')]"));
Thread.sleep(2000);
a.moveToElement(ResourcesDD).perform();
		//a.moveToElement(ResourcesDD).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[contains(.,'Contact')]")).click();
		String text=driver.findElement(By.xpath("//p[.='India (Bangalore)']/../../../div[2]/span/p")).getText();
		System.out.println(text);
		driver.close();
		
	}

}
