package saucedemo.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Local;
import saucedemo.pages.BaseClass;
import saucedemo.pages.LoginPage;
import saucedemo.utility.Browser;
import saucedemo.utility.ExcelDataProvider;

public class LoginSaucedemo extends BaseClass {
	
	
	
	@Test
	public void login()
	{
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.loginToSaucedemo(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
	}

}
 