package swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	protected WebDriver driver;	
	@BeforeClass
	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/sucsenap/eclipse-workspace/swaglabs/src/main/resources/drivers/chromedriver");
		driver = new ChromeDriver();	
		
	}
	@AfterClass
	public void closeWindow() {
		driver.close();
	}

}
