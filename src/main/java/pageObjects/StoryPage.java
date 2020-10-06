package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoryPage {
	public WebDriver driver;

	By storynav = By.xpath("//*[@id=\"navbarToggle\"]/div[2]/a[3]/i");
	By post = By.xpath("//*[@id=\"submit\"]");
	By shared = By.xpath("/html/body/main/div/div[1]/div[1]");
	By choosefile = By.xpath("//label[contains(.,'Choose file')]");
    By writestory = By.xpath("//*[@id=\"caption\"]");
	public StoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getStory() {
		return driver.findElement(storynav);
	}
	public WebElement postStory() {
		return driver.findElement(post);
	}
	public WebElement confirmStory() {
		return driver.findElement(shared);
	}
	public WebElement chooseFile() {
		return driver.findElement(choosefile);
	}
	public WebElement writeStory() {
		return driver.findElement(writestory);
	}
}