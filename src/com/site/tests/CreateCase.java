package com.site.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.site.pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreateCase extends TestBase {
	static MenuPage MenuPage;
	
	
	@Test
	public void TEST1_NavigateToCase() throws Exception {
		MenuPage MenuPage = LoginPage.LogintoApplication();
		MenuPage.CaseSelection();
	}
	
	
	@Test
	public void TEST2_CreateCase() throws Exception {
	   CasePage.handleMultipleWindows("Case");	
	   CasePage.CaseCreation();
		
		
	}
	
}
