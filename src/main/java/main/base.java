package main;



import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
	public static WebDriver driver;
	public  Properties prop;
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\FahirL\\eclipse-workspace\\test2\\SocialNetworkAutomation\\src\\main\\java\\main\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
		
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\FahirL\\Documents\\Work files\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	
}
	

/*lista funkcionalnosti koje MORAS automatizirati:
1. Register
2. Login
3. Add a new story
4. Like story
5. Comment story
6. Delete comment
7. Delete story */
