package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import main.base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class LoginTest extends base {
	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
	}		

	
	@Test
	public void basePageLogin() throws IOException
	
	{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("testttest@live.com");
		lp.getPassword().sendKeys("test123456");
		lp.submitLogin().click();
		Assert.assertTrue(lp.confirmLogin().isDisplayed());
		
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	
		
	}


}
