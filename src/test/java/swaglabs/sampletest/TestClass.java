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
<<<<<<< HEAD
		System.out.print("Test PR for delete comment");
=======
		System.out.print("modify comment for PR conflict");	
		
>>>>>>> 9835fe1 (PR conflicts)
		}
}
