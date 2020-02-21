package qsp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class MTRSearchForSpecifiedOption {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item");
		String expItem = sc.nextLine();
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
		driver.get("file:///C:/Users/Pradeep/Desktop/Automation/mtr_duplicate.html");
		WebElement mtrListBox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		 java.util.List<WebElement> allOptions = s.getOptions();
		 int found=0;
		 for(WebElement options:allOptions)
		 {
			 String actualItem=options.getText();
			 if(expItem.equals(actualItem))
			found++;
		 }
		 if(found==0) {
			 System.out.println(expItem+" "+"is not present in the menu");
		 }
		 else if(found==1)
		 {
			 System.out.println(expItem+" "+"is present in the menu");
		 }else
		 {
			 System.out.println(expItem+" "+"is  present in the menu and is having duplicate");
		 }
		
		
		driver.close();
	}
}
