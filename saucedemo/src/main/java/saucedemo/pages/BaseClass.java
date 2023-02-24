package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import saucedemo.utility.Browser;
import saucedemo.utility.ConfigDataProvider;
import saucedemo.utility.ExcelDataProvider;

public class BaseClass {
	
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUp() 
	{
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	@BeforeClass
	public void setup()
	{
		driver=Browser.startBrowser(driver, config.getBrowser(), config.getStringURL());
		System.out.println(driver.getTitle());
	}

}
