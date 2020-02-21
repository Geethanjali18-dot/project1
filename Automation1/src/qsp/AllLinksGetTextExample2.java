package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksGetTextExample2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/test3.html");
		//to  find all the links present in webpage
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		//get the count of all the links and print it
		int count=allLinks.size();
		System.out.println(count);
		
		//get the one element out side
			WebElement link1=allLinks.get(0);
			//get the text of the element and print it
			String text=link1.getText();
			System.out.println(text);
		
		driver.close();
	}
}
