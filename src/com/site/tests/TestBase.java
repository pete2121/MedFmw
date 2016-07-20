package com.site.tests;

import java.io.FileReader;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.site.pages.*;


import org.openqa.selenium.WebDriver;

public class TestBase {
	

    static WebDriver driver;
	static PolicyPage PolicyPage;
	static CasePage CasePage;
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
		baseUrl= properties.getProperty("ENSA_URL");
		
		
		driver.navigate().to(baseUrl);
		PolicyPage = new PolicyPage(driver);
		CasePage = new CasePage(driver);
		LoginPage =new LoginPage(driver);
		System.out.println("START");
		
		Thread.sleep(15000);
		
	}
	
	@AfterClass
	public static void TearDown() throws Exception {
		driver.quit();
		Thread.sleep(8000);

	}

	
	
}
