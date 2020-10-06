package selenium;


import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.StoryPage;


public class StoryTest extends base {
	@BeforeTest
	
	public void initialize() throws IOException {

		driver = initializeDriver();
 
	}
	

	@Test
    public void baseStoryTest() throws IOException, InterruptedException
    {   		
		
		driver= initializeDriver();
	    driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("ajbzbbmb@live.com");
		lp.getPassword().sendKeys("sasasa5");
		lp.submitLogin().click();
    	StoryPage s=new StoryPage(driver);
    	s.getStory().click();
    	s.chooseFile().click();
    	Thread.sleep(5000);
    	
    	String filePath = "C:\\Users\\FahirL\\Documents\\Work files\\images\\fileupload.exe";

    	Runtime.getRuntime().exec(filePath);
    	Thread.sleep(2000);
    	s.writeStory().sendKeys("This is my first story....");
    	s.postStory().click();
    	
    	Assert.assertTrue(s.confirmStory().isDisplayed());

  
        }
/*	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.close();*/
	
		
	 }
    