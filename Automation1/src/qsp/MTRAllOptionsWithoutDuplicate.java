package qsp;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRAllOptionsWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
	driver.get("file:///C:/Users/Pradeep/Desktop/Automation/mtr_duplicate.html");
	WebElement mtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListBox);
	TreeSet t=new TreeSet();
	List<WebElement> options = s.getOptions();
	for(WebElement allOptions:options)
	{
		String text = allOptions.getText();
		t.add(text);
	}

System.out.println(t);
	driver.close();
		
	}
}
