package selenium;



import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.base;
import pageObjects.LandingPage;
import pageObjects.LikeCommentPage;
import pageObjects.LoginPage;

public class LikeTest extends base{
	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();

	}
	@Test
    public void baseLikeTest() throws IOException, InterruptedException
    {   		
		driver= initializeDriver();
	    driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("testttest@live.com");
		lp.getPassword().sendKeys("test123456");
		lp.submitLogin().click();
        LikeCommentPage li =new LikeCommentPage(driver);
        String initialCounter = li.checkCounter().getText();
        int countervalBefore = Integer.parseInt(initialCounter);
        System.out.println("value of the counter before click/refresh is : " + countervalBefore);
        li.getLike().click();
        driver.navigate().refresh();
        String afterCounter = li.checkCounter().getText();
        int countervalAfter = Integer.parseInt(afterCounter);
        System.out.println("value of the counter after click/refresh is : " + countervalAfter);

        // now verifying the previous counter value with current counter value
        if(countervalAfter > countervalBefore){
            System.out.println("Like worked i.e incremented");
        }else{
            System.out.println("Like not working");
        }
    }
    	
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	
		
	}
    	
    		
    	
        
  
}