package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookiesExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//maximise the window
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//close the browser without using close method
		driver.quit();
	}

}
