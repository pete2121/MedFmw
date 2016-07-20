package com.site.tests;

import java.io.FileReader;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
//import java.util.List;
//import java.util.Set;
//import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.site.pages.*;
import com.site.tools.PolicyPageObjects;
import com.site.tools.ScreenShotOnFailure;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreatePolicyDAMAN  implements PolicyPageObjects {
	
	static WebDriver driver;
	static PolicyPage PolicyPage;
    static LoginPage LoginPage;

	@Rule
	public ScreenShotOnFailure failure = new ScreenShotOnFailure(driver);

    
	@BeforeClass
	public static void setUp() throws Exception {

		driver = new FirefoxDriver();
		//driver = new HtmlUnitDriver(); //Hide the Browser
		Thread.sleep(10000);
		driver.manage().window().maximize();
		String baseUrl;
		Properties properties = new Properties();
		properties.load(new FileReader("src/conf.properties"));
		baseUrl= properties.getProperty("DAMAN_URL");
		driver.navigate().to(baseUrl);
		PolicyPage = new PolicyPage(driver);
		LoginPage = new LoginPage(driver);
		Thread.sleep(15000);
		
	}

	@Test
	public void TEST1_NavigateToPolicy() throws Exception {
		MenuPage MenuPage = LoginPage.LogintoApplication();
		MenuPage.PolicySelection();
	}

	@Test
	public void TEST2_PolicyCreation() throws Exception {

		PolicyPage.handleMultipleWindows("Policy");
		PolicyPage.CreatePolicy(null, "0", "8/12/2015", "1", "8/12/2015", "1", 1, 1, "0", null, null);
		PolicyPage.CheckMessageByIdContains("Operation Apply executed Successfully", Message);

	}

	@Ignore
	public void TEST3_CustomerCreation() {

		// PolicyPage.CreateCustomer();
		PolicyPage.CheckMessageByIdContains("Operation Apply executed Successfully", Message);
		// GetMemberNumber

	}

	@Ignore
	public void TEST4_ComputeAndValidate() throws Exception {

		PolicyPage.ComputeAndValidate();
	}

}
