package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadResume {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@href='https://login.naukri.com/nLogin/Login.php' and @id='login_Layer']")).click();
		driver.findElement(By.name("email")).sendKeys("rggeethanjali@gmail.com");
		driver.findElement(By.name("PASSWORD")).sendKeys("geethu89");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'UPDATE')]")).click();
		Thread.sleep(3000);
	  // driver.findElement(By.className("//a[@class='secondary-content']")).click();
	   driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\Pradeep\\Documents\\Geethanjali\\Resumes\\testing\\Geethanjali_Resume_2.doc");
	   Thread.sleep(3000);
	   Actions action = new Actions(driver);
       WebElement btn = driver.findElement(By.xpath("//div[.='My Naukri']"));
       action.moveToElement(btn).perform(); 
       driver.findElement(By.xpath("//a[.='Logout']")).click();
	   
		//driver.quit();
		
		
	}
}
