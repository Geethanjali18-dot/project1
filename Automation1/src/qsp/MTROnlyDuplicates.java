package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTROnlyDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Pradeep/Desktop/Automation/mtr_duplicate.html");
	WebElement mtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListBox);
	TreeSet t=new TreeSet();
	List<WebElement> options = s.getOptions();
	
	for( WebElement dup:options)
	{ 
		String text=dup.getText();
		if(t.add(text)==false)
				{
			System.out.println(text);
				}
	}
	driver.close();
	
	
}

}
