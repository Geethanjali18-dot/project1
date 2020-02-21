package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		Set<String> wh1=driver.getWindowHandles();
		int count=wh1.size();
		for(String s:wh1)
		{
			System.out.println(wh1);
		}
		driver.quit();
		
		
	
	}

}
