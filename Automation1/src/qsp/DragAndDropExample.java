package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException, AWTException   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	Actions a=new Actions(driver);
	WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
	WebElement target = driver.findElement(By.xpath("//h1[.='Block 4']"));
	a.dragAndDrop(source, target).perform();
	driver.close();
	}
}
