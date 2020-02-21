package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteFromToTextBox {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/test2.html");
		//Copy the text present in first text box
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"ac");
		//clear the text in second textbox and paste the text
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text' and @value='B']"));
		textbox2.clear();
		textbox2.sendKeys(Keys.CONTROL+"v");
		
		//close the browser
		driver.close();
		
		
	}

}
