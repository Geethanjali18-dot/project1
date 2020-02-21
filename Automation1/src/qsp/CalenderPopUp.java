package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(month);
		s.selectByValue("9");
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1989");
		Thread.sleep(2000);
		driver.findElement(By.linkText("10")).click();
		driver.findElement(By.name("alternative_number")).sendKeys("1234567891");
		//ChromeOptions o=new ChromeOptions();
		//o.addArguments("--disable-notifications");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit-login']")).click();
		//driver.close();

	}
}
