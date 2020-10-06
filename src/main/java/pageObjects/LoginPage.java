package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
 public WebDriver driver;
  By email = By.id("username");
  By password = By.id("password");
  By buttonlogin = By.id("submit");
  By success = By.xpath("/html/body/main/div/div[1]/div");
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public WebElement getEmail()
  {
	  return driver.findElement(email);
  }
  public WebElement getPassword() {
	  return driver.findElement(password);
  }

  public WebElement submitLogin() {
	  return driver.findElement(buttonlogin);
  }
  public WebElement confirmLogin() {
	  return driver.findElement(success);
  }
}