package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRGetwarappedElementExample {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/mtr.html");
		WebElement mtrListbox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		WebElement allOptions = s.getWrappedElement();
		String text=allOptions.getText();
		System.out.println(text);
		driver.close();
		
	}
}
