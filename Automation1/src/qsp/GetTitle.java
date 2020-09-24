package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://selenium.dev");
		//or driver.navigate().to("")
     	String title=driver.getTitle();
		System.out.println(title);
		driver.close(); //or driver.quit();
	}

}
