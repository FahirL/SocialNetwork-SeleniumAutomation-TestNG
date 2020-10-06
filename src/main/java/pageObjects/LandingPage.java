package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
 public WebDriver driver;
  By signup = By.cssSelector("a[href='/register']");
  By navbar = By.xpath("/html/body/header/nav/div/a");
  By login = By.cssSelector("a[href='/login']");
  public LandingPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public WebElement getRegister()
  {
	  return driver.findElement(signup);
  }
  public WebElement getNavbar()
  {
	  return driver.findElement(navbar);
  }
  public WebElement getLogin()
  {
	  return driver.findElement(login);
  }
}
