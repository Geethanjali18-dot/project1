package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicenseExample {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("menu_icon")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Licenses']")).click();
	driver.findElement(By.id("serviceAgreementRef")).click();
	Set<String> allwh=driver.getWindowHandles();
	
	for(String wh:allwh)
	{
	driver.switchTo().window(wh);
	
	}
	List<WebElement> heading = driver.findElements(By.xpath("//h2"));
	int count= heading.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		System.out.println(heading.get(i).getText());
	}
	
	
	driver.close();
	for(String wh:allwh)
	{
	driver.switchTo().window(wh);
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
	}
	
	}
}
