package swaglabs.sampletest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import swaglabs.BaseClass;
import swaglabs.Login;

 class TestClass {
	 Login login;
	 
	 @BeforeMethod
	 public void testClass() throws IOException{
		 login = new Login();
		 
	 }
	 
	 @Test
	 public void filterByPrice() {
		 System.out.println("Added comment before login step");
		 login.loginSwagLab();
		 System.out.println("Added comment after login step");
	 }
	
}
