package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheSpecificBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name");
		String expectedTitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//get the session id or window handles of all the browsers
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh) {
			//transfer the driver control to all the browsers one by one
			driver.switchTo().window(wh);
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
		//to close the browser input given by user 
		driver.close();
		}
		
		else
		{//to not to close the browser input given by user
		//driver.close();
		}
	
	}


}
}
