package selenium;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.base;
import pageObjects.LandingPage;
import pageObjects.LikeCommentPage;
import pageObjects.LoginPage;

public class CommentTest extends base{
	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();

	}
	@Test
    public void baseCommentTest() throws IOException, InterruptedException
    {   		
		driver= initializeDriver();
	    driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("testttest@live.com");
		lp.getPassword().sendKeys("test123456");
		lp.submitLogin().click();
		
		String s[] = {"comment11", "comment22", "comment33"};{
		}
	        for(int i =0; i< s.length; i++){
	        	LikeCommentPage co = new LikeCommentPage(driver);
	            co.getComment().sendKeys(s[i]);
	            co.postComment().click();
	            Thread.sleep(200);
	            assertTrue(isTextPresent(s[i]));
	        }
	        
	        }
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	
		
	}
	private boolean isTextPresent(String text) {
        try{
            boolean b = driver.getPageSource().contains(text);
            return b;
        }
        catch(Exception e){
            return false;
		
	}

}
}