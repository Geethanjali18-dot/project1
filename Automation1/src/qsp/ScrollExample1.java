package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.bbc.com/news");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	Point p = driver.findElement(By.xpath("(//span[.='China coronavirus: A visual guide'])[1]")).getLocation();
	int y=p.getY();
	String c="window.scrollTo(0,"+y+")";
	j.executeScript(c);
	driver.close();
	}

}
