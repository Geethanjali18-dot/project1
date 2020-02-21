package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//declaration
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lgbtn; 
	public LoginPage(WebDriver driver)
	{
		//initialization
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	//business logic method
	public void setuser(String username,String password) {
		//utilization
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgbtn.click();

	}



}
