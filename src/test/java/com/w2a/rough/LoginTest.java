package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.pages.HomePage;


public class LoginTest {  
	
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipak\\eclipse-workspace\\PageObjectModelBasics\\src\\test\\resources\\com\\w2a\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage home = new HomePage(driver);
		home.goToLogin();
		
	}

}
