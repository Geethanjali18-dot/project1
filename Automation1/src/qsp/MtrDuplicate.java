package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrDuplicate {
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/test5.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select mtrSelect=new Select(mtrListBox);
		mtrSelect.getOptions();
		int count=mtrSelect.getOptions().size();
		for (int i = 0; i < count; i++) 
		 {
	            for (int j = i + 1; j < count; j++) 
	            { 
	                if (mtrSelect.getOptions().get(i).getText().contentEquals(mtrSelect.getOptions().get(j).getText()))
	                	              		 
	                {
	                    System.out.println(mtrSelect.getOptions().get(i).getText());
	                }
	            }
	        }
		
	
	}

}
