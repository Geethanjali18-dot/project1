package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//declaring the element for username textbox
	@FindBy(id="username")
	private WebElement untbx;
	//declaring the element for password textbox
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn; 
	public void LoginPage(WebDriver driver)
	{
		//initializing the element during the runtime by using initElements method
		PageFactory.initElements(driver, this);
	}
	//business logic method
	public void setuser(String username,String password) {
		//utilization
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgbtn.click();

	}



}
