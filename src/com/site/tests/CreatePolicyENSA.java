package com.site.tests;

import java.io.FileReader;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.site.pages.CasePage;
import com.site.pages.LoginPage;
import com.site.pages.MenuPage;
import com.site.pages.PageBase;
import com.site.pages.PolicyPage;
import com.site.pages.MembersPage;
import com.site.tools.PolicyPageObjects;

import com.site.tools.ScreenShotOnFailure;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreatePolicyENSA  implements PolicyPageObjects {
	
	static WebDriver driver;
    static LoginPage LoginPage;
	
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
		LoginPage = new LoginPage(driver);
		Thread.sleep(15000);
		
	}

	@Rule
	public ScreenShotOnFailure failure = new ScreenShotOnFailure(driver);
	
		

	
	@Test
	public void TEST1_PolicyCreation() throws Exception {
		MenuPage MenuPage = LoginPage.LogintoApplication();
		MenuPage.PolicySelection();
		PolicyPage PolicyPage=MenuPage.PolicySelection();
		PolicyPage.handleMultipleWindows("Policy");
		PolicyPage.CreatePolicy(1, "0", "8/12/2015", "1", "8/12/2015", null, null, null, "0", 1, "0");
		PolicyPage.CheckMessageByIdContains("added", Message);
		Thread.sleep(20000);
		MembersPage MembersPage = PolicyPage.clickonMembers();
		Thread.sleep(8000);
		MembersPage.CreateMember("17/02/1981", 1);

	}

}
