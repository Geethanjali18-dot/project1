package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBox {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/test4.html");
		List<WebElement> allSugg = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=allSugg.size();
		for(int i=0;i<count;i++)
		{
			allSugg.get(i).click();
		}
		Thread.sleep(4000);
		driver.close();
	}
}
