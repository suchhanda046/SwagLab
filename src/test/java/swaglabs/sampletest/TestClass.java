package swaglabs.sampletest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import swaglabs.BaseClass;

 class TestClass extends BaseClass{
	@Test
	public void testMethod() {	
		driver.get("https://wwww.facebook.com");
		System.out.print("Test PR");	
		}
	@Test
	public void testMethodPR() {	
		System.out.print("Test PR....");	
		System.out.print("Checkout to branch - Test PR done");
		System.out.print("After PR merge test...");
		
		}
}
