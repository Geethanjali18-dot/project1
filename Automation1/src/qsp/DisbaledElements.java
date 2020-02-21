package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisbaledElements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/Page3.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		//typecast the driver to java script executor
		JavascriptExecutor j=(JavascriptExecutor) driver;
		String c="document.getElementById('t2').value='manager'";
		j.executeScript(c);
		String s="document.getElementById('t3').click()";
		j.executeScript(s);
		driver.close();
		
	}

}
