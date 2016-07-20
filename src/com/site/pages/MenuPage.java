package com.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.site.tools.MenuPageObjects;

public class MenuPage  extends PageBase implements MenuPageObjects {
	
	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	
	public PolicyPage PolicySelection() throws Exception {
		
		waitForLoad(driver);
		WebElement PolicyFolder = driver.findElement(By.id("t1:3::di"));
		PolicyFolder.click();
		Thread.sleep(3000);
		WebElement PolicyEnrolment=driver.findElement(By.id("t1:12::di"));
		PolicyEnrolment.click();
		Thread.sleep(3000);
		WebElement Policy = driver.findElement(By.linkText("Policy"));
		Policy.click();
		Thread.sleep(9000);
		return new PolicyPage(driver);
		
		}
		
	
	public void CaseSelection() throws Exception  {
		
		waitForLoad(driver);
		WebElement FolderCare = driver.findElement(By.id(CaseFolder));
		FolderCare.click();
		WebElement LinkCase = driver.findElement(By.xpath(CaseLink));
		LinkCase.click();
		Thread.sleep(4000);
		
	}
	
	
	
}

