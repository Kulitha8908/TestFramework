package saucedemo.utility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver startBrowser(WebDriver driver,String browserName,String appUrl) 
	{
	 if (browserName.equals("Chrome"))
	 {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		driver=new ChromeDriver();
		
	 }
		 else 
		 {
			System.out.println("We do not support this browser");
		 }
	 
	 	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
