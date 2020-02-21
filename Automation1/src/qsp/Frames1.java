package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Pradeep/Desktop/Automation/page1.html");
	//switch to frame by using index
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("J");
	Thread.sleep(2000);
	//switch to parent frame
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("Q");
	Thread.sleep(2000);
	//switch to frame by using string id
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("s");
	Thread.sleep(2000);
	//switch to parent frame
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("s");
	//Thread.sleep(2000);
	WebElement frameWE = driver.findElement(By.xpath("//iframe"));
	//switch to frame by using  webelement
	driver.switchTo().frame(frameWE);
	driver.findElement(By.id("t2")).sendKeys("p");
	Thread.sleep(2000);
	//switch to parent frame
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("p");
	Thread.sleep(2000);
	driver.close();
}
}
