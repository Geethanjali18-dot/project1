package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectbox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/test5.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select mtrSelect=new Select(mtrListBox);
		mtrSelect.selectByIndex(0);
		mtrSelect.selectByValue("d");
		mtrSelect.selectByVisibleText("Poori");
		if(mtrSelect.isMultiple())
		{
			mtrSelect.deselectByIndex(0);
			mtrSelect.deselectByValue("d");
			mtrSelect.deselectByVisibleText("Poori");
		}
		else
		{
			System.out.println("list is not multi select");
		}
		driver.close();
		
	}
	
	

}
