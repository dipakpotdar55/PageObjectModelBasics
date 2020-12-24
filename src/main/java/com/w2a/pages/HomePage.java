package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver= driver;
		
	}
	

	public void goToSignUp() {

	}

	public void goToSupport() {

	}

	public void goToLearnMore() {

	}
	
	public void validateFooterLinks() {

}

	public void goToLogin() {

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/a[4]")).click();
	}
}
