package com.site.pages;

import org.openqa.selenium.WebDriver;

import com.site.tools.CasePageObjects;

public class CasePage extends PageBase implements CasePageObjects {
	
	public CasePage(WebDriver driver) {
		super(driver);
	}
	
	
	public void CaseCreation() throws Exception{
		
	Thread.sleep(5000);	
	ClickButton(SearchMemberButton);
	Thread.sleep(5000);
	SelectFromTable(MembersTable,1);
	ClickButton(ApplyButton);
	Thread.sleep(5000);
	CheckMessageByIdContains("Operation Apply executed Successfully", Message);
	
		
	}
	

}
