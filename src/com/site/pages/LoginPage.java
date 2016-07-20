package com.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	

	public MenuPage LogintoApplication() throws InterruptedException {
		
		WebElement userName_editbox = driver.findElement(By.id("it1::content"));
		WebElement password_editbox = driver.findElement(By.id("it2::content"));
		WebElement submit_button = driver.findElement(By.id("cb1"));
		System.out.println("Enter credentials");
		userName_editbox.sendKeys("mni1");
		password_editbox.sendKeys("Pwd12345");
		submit_button.click();
		Thread.sleep(10000);
		return new MenuPage(driver);
		
		
	}
	


    
 
	

}
