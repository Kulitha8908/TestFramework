package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath = "//input[@id='user-name']") WebElement uname;
	@FindBy(xpath = "//input[@id='password']") WebElement pword;
	@FindBy(xpath = "//input[@id='login-button']") WebElement loginButton;
	
	public void loginToSaucedemo(String unameApp,String pwordApp)
	{
		uname.sendKeys(unameApp);
		pword.sendKeys(pwordApp);
		loginButton.click();
	}
	
	
	

}
