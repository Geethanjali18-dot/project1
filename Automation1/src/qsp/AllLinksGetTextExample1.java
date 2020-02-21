package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksGetTextExample1{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args)   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url");
		String url=sc.nextLine();
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to enter the url
		driver.get(url);
		//to  find all the links present in webpage
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		//get the count of all the links and print it
		int count=allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{//get the one element out side
			WebElement link1=allLinks.get(i);
			//get the text of the element and print it
			String text=link1.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
