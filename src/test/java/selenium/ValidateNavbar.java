package selenium;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.base;
import pageObjects.LandingPage;

public class ValidateNavbar extends base {
	 

	public WebDriver driver;
	@BeforeTest

	public void initialize() throws IOException
	{
		
		driver =initializeDriver();
			
		driver.get(prop.getProperty("url"));
	}

	
	@Test
	public void validateNavBar() 
	{
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getNavbar().isDisplayed());
		

		
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	
		
	}
}
