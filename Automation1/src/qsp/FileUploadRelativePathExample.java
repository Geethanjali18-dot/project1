package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRelativePathExample {
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
		File f=new File("./data/Geethanjali_Resume.doc");
		 String path = f.getAbsolutePath(); 
		 driver.findElement(By.id("cv")).sendKeys(path);
		driver.close();
	}
}
