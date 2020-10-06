package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegisterPage {
 public WebDriver driver;
  By email = By.id("username");
  By password = By.id("password");
  By confirmpw = By.id("confirm_password");
  By buttonregister = By.id("submit");
  By success=By.xpath("/html/body/main/div/div/div[1]");
  public RegisterPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public WebElement getEmail()
  {
	  return driver.findElement(email);
  }
  public WebElement getPassword() {
	  return driver.findElement(password);
  }
  public WebElement confirmPassword() {
	  return driver.findElement(confirmpw);
  }
  public WebElement submitRegister() {
	  return driver.findElement(buttonregister);
  }
  public WebElement confirmRegister() {

	  return driver.findElement(success);
		
  }

}
