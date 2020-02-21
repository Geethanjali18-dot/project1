package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetYExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException  {
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url
	driver.get("https://www.facebook.com/");
	int y1value = driver.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
	int y2value = driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
	if(y1value==y2value)
	{
		System.out.println("pass");
		System.out.println(y1value);
	}
	else
	{
		System.out.println("fail");
		System.out.println(y2value);
	}
	//close the browser        
    driver.close();
	
	}

}
