package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//disable the notifications pop up in the settings
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//open the browser in modified settings
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://cleartrip.com");
	}
}

