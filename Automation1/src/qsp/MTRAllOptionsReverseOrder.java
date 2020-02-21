package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRAllOptionsReverseOrder {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/mtr.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> options = s.getOptions();
		int count=options.size();
		System.out.println("Reverse Order");
		for(int i=count-1;i>=0;i--)
		{
			String text=options.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
