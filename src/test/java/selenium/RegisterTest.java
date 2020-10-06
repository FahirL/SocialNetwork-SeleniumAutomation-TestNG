package selenium;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import main.RandomData;
import main.base;
import pageObjects.LandingPage;
import pageObjects.RegisterPage;

public class RegisterTest extends base{
	
	@BeforeTest

	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
			

	}
	
	@Test
	public void basePageRegister() throws IOException 
	{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getRegister().click();
		RegisterPage r = new RegisterPage(driver);
		
		String firstName = RandomData.getSaltString();
	    
		r.getEmail().sendKeys(firstName +"@gmail.com");
		r.getPassword().sendKeys("testpassword");
		r.confirmPassword().sendKeys("testpassword");
		r.submitRegister().click();
		r.confirmRegister();
		
	}
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	
		
	}

	}


