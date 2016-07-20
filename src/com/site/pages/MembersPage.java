package com.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.site.tools.MembersPageObjects;

public class MembersPage extends PageBase implements MembersPageObjects{

	
	public MembersPage (WebDriver driver) {
		super(driver);
	}
	
	
	public void CreateMember(String DateofBirth, Integer PackageNumber) throws Exception 
	{
		
		String text = generateRandomString(6);
		
	
			WebElement FirstNameElement = driver.findElement(By.id(FirstName));
			FirstNameElement.sendKeys(text);
		
			WebElement LastNameElement = driver.findElement(By.id(LastName));
			LastNameElement.sendKeys(text);
			
			Select mySelect1 =new Select( driver.findElement(By.id(SexList)));
			Thread.sleep(4000);
			mySelect1.selectByIndex(1);
			
			TypebyText(DateofBirthInput,DateofBirth);
			SetDetailAsCheckBox(PrincipalCheckBox,true);
			
			Select mySelect2 =new Select( driver.findElement(By.id(RelationList)));
			Thread.sleep(4000);
			mySelect2.selectByIndex(1);
			Thread.sleep(4000);
	
			ClickButton(SearchPackageNumber);
			Thread.sleep(4000);
			SelectFromTable(PackageNumberTable,PackageNumber);
			
			Select mySelect3 =new Select( driver.findElement(By.id(ClassList)));
			Thread.sleep(4000);
			mySelect3.selectByIndex(1);
			
			ClickButton(ApplyButton);
		
			
}


	
}