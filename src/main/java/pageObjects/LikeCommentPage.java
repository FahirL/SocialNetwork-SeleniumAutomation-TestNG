package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LikeCommentPage {
	public WebDriver driver;

	By comment = By.id("comment-on-87");
	By postcomment = By.id("c-87");
	By likecounter = By.id("like-87");
	By likebutton = By.id("l-87");
	

	public LikeCommentPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getComment() {
		return driver.findElement(comment);
	}
	public WebElement postComment() {
		return driver.findElement(postcomment);
	}
	public WebElement getLike() {
		return driver.findElement(likebutton);
	}
	public WebElement checkCounter() {
		return driver.findElement(likecounter);
	}

}