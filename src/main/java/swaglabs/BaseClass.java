package swaglabs;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	protected WebDriver driver;	
	FileReader fr;
	Properties prop;
	
	
	public BaseClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/sucsenap/eclipse-workspace/swaglabs/src/main/resources/drivers/chromedriver");
		driver = new ChromeDriver();	
		fr = new FileReader("/Users/sucsenap/eclipse-workspace/swaglabs/src/main/resources/credentials.properties");
		prop = new Properties(); 
		prop.load(fr);
		
		
	}

//	@AfterClass
//	public void closeWindow() {
//		driver.close();
//	}

}
