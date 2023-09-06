package swaglabs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BaseClass{

	public Login() throws IOException {
		super();		
	}

	public WebElement getTxtFieldUsername() {
		WebElement txtField_username = driver.findElement(By.xpath("//input[@id='user-name']"));		
		return txtField_username;		
	}
	
	public WebElement getTxtFieldPassword() {
		WebElement txtField_password = driver.findElement(By.xpath("//input[@id='password']"));		
		return txtField_password;		
	}
	public WebElement getBtnLogin() {
		WebElement btn_Login = driver.findElement(By.xpath("//input[@id='login-button']"));		
		return btn_Login;		
	}
	
	public void loginSwagLab() {
		driver.get("https://www.saucedemo.com");
		getTxtFieldUsername().sendKeys(prop.getProperty("username_standard"));
		getTxtFieldPassword().sendKeys(prop.getProperty("password_standard"));
		getBtnLogin().click();
		
	}

}
