package com.site.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.site.tools.PolicyPageObjects;

public class PolicyPage extends PageBase implements PolicyPageObjects {
	
	public PolicyPage(WebDriver driver) {
		super(driver);
	}
	
	
	

	public void CreatePolicy(
			Integer CustomerNumberName, String PolicyHolderType, String ApplicationDate, String PolicyType, 
			String EffectiveDate,String PolicyGroup, Integer InsuranceCompany, Integer Product, String PaymentMethod, Integer SalesEntity, 
			String SalesLocation) throws Exception {
		

		String text = generateRandomString(6);
		
		
		if (CustomerNumberName!=null) {
			
			ClickLinkid(CustomerSearchButton);
			Thread.sleep(8000);			
			ClickButton(Customer_Search_Button);
			Thread.sleep(5000);	
			SelectFromTable(Customer_Number_Table,CustomerNumberName);
			waitForLoad(driver);
		}
		
		if (PolicyHolderType!=null) {
			
			selectfromDropDownList(PolicyHolderInput, null,PolicyHolderType); 
			
		}
			
		
		Thread.sleep(4000);
		WebElement FirstNameElement = driver.findElement(By.id(FirstNameInput));
		FirstNameElement.sendKeys(text);
		
		Thread.sleep(4000);
		WebElement LastNameElement = driver.findElement(By.id(LastNameInput));
		LastNameElement.sendKeys(text);
		
		
		if (ApplicationDate!=null) {
			
			driver.findElement(By.id(ApplicationDateInput)).sendKeys(ApplicationDate);
			 Thread.sleep(4000);
		}
		
		if (PolicyType!=null) {
			
			selectfromDropDownList(PolicyTypeSelection, null,PolicyType); 
			 Thread.sleep(4000);
			 
		}
		
		
		if (EffectiveDate!=null) {
			
			driver.findElement(By.id(EffectiveDateInput)).sendKeys(EffectiveDate);
			 Thread.sleep(6000);
	
		}
		
		
		
		
		if (PolicyGroup!=null) {
			Thread.sleep(4000);
			Select mySelect2 =new Select( driver.findElement(By.id(PolicyGroupSelection)));
			Thread.sleep(4000);
			mySelect2.selectByIndex(1);
			
		}
		
			
		if (InsuranceCompany!=null) {
		Thread.sleep(4000);
		Select mySelect3 =new Select( driver.findElement(By.id(InsuranceSelection)));
		Thread.sleep(4000);
		mySelect3.selectByIndex(1);
		}
	
			
	    if (Product!=null) {
		Thread.sleep(4000);
		Select mySelect4 =new Select( driver.findElement(By.id(ProductSelection)));
		Thread.sleep(4000);
		mySelect4.selectByIndex(1);
	    }
	
	
		if (PaymentMethod!=null) {
			
			Thread.sleep(4000);
			
			selectfromDropDownList(PaymentSelection, null,PaymentMethod);
		}
		
			
		Thread.sleep(4000);
		Select mySelect6 =new Select( driver.findElement(By.id(BusinessSelection)));
		Thread.sleep(3000);
		mySelect6.selectByIndex(1);
		
		if (SalesEntity!=null) {
			waitForLoad(driver);
			Thread.sleep(8000);
			ClickLinkid(Search_Sales_Entity);
			Thread.sleep(7000);
			ClickButton(Sales_Search_Button);
			Thread.sleep(6000);
			SelectFromTable(Sales_Entity_Table,SalesEntity);
			Thread.sleep(3000);
			waitForLoad(driver);
			
		}
		
		if (SalesLocation!=null) {
			
			selectfromDropDownListbyName(SalesLocationSelection, null,SalesLocation);
			
		}
		
		
		Thread.sleep(3000);
		WebElement ApplyButton = driver.findElement(By.id(Apply_Button));
		ApplyButton.click();
		waitForLoad(driver);
		Thread.sleep(5000);
		
		}
	
	
	
	public void CreateCustomer(String SpecificInsuredMember,String FirstName,String LastName,
			String EnrolmentDate,String Sex,String DateofBirth,String Principal,String Relation,String PackageNumber,
			String MemberClass,String ExternalReference) {
		
		
	}
	
	
	public void ComputeAndValidate() throws Exception {
		
		//NA THN FTIAKSW!!!
		
		ClickLink("Close_Link");
		Thread.sleep(6000);
		ClickLink("Compute_Link");
		Thread.sleep(6000);
		ClickLink("Apply_Dialog_Link");
		Thread.sleep(6000);
		ClickLink("Close_Link");
	   ClickButton("Validate_Button");
		
	

		
	}

	
	public void SelectFromTable(String TableIdentifier,int row) throws Exception {
		
	WebElement FirstCustomer = driver.findElement(By.xpath(TableIdentifier + String.format("/tbody/tr[%d]", row)));
	Actions action = new Actions(driver);
	// Mouse over
	action.moveToElement(FirstCustomer);
	action.perform();
	// Double click
	action.doubleClick(FirstCustomer);
	action.perform();
	
	}
	
	

    public  MembersPage clickonMembers() {
    ClickButton(MembersButton);	
    return new MembersPage(driver);
    }
    
    
    
    public void GetLatestPolicyIDinDB() throws InstantiationException,
	IllegalAccessException, ClassNotFoundException, SQLException, Exception {
    String url1 = "jdbc:oracle:thin:xxxxxxxxxxxxxxxxx";
    String dbClass = "oracle.jdbc.driver.OracleDriver";
    Class.forName(dbClass).newInstance();
    Connection con = DriverManager.getConnection(url1, "xxxxx",
		"xxxxxxx");
    Statement stmt = (Statement) con.createStatement();
    ResultSet result = (ResultSet) stmt
		.executeQuery("select * from  xxx where xxx in (select max(xxxx) from xxxx)");
    while (result.next()) {
	String Id = result.getString("xxxxx");
	System.out
			.println("Policy Id that can be retreived from xxxx table is:"
					+ Id);
    }
    result.close();
    con.close();
    }
	
	
	
	
}
