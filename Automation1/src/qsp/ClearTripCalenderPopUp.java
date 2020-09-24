package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTripCalenderPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");	
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.cleartrip.com/");
			
		Thread.sleep(3000);
		driver.findElement(By.id("FromTag")).sendKeys("nba");
		driver.findElement(By.xpath("//a[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		driver.findElement(By.id("ToTag")).sendKeys("Switzerland");
		driver.findElement(By.xpath("//a[.='Zurich, CH - Zurich (ZRH)']")).click();
		driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
		WebElement nextMonth = driver.findElement(By.xpath("//a[@class='nextMonth ']"));
		nextMonth.click();
		nextMonth.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("18")).click();
		//driver.close();
	}

}
