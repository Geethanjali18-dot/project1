package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Pradeep/Desktop/Automation/page1.html");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("manager");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("admin");
	Thread.sleep(2000);
	driver.close();
	
}
}
