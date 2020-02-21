package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/FileUploadPopUp.html");
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\Pradeep\\Documents\\Geethanjali\\Resumes\\Geethanjali_Resume.doc");
		driver.close();
	}
}
