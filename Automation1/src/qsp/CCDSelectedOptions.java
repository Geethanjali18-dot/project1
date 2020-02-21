package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CCDSelectedOptions {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Pradeep/Desktop/Automation/ccd.html");
	WebElement ccdListBox = driver.findElement(By.id("ccd"));
	Select s=new Select(ccdListBox);
	List<WebElement> selectedOptions = s.getAllSelectedOptions();
	int count=selectedOptions.size();
	for(int i=0;i<count;i++)
	{
		String text=selectedOptions.get(i).getText();
		System.out.println(text);
	}
	
	driver.close();
	
}
}
