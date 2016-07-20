package com.site.tools;



public interface PolicyPageObjects {
	
	String CustomerSearchButton = "t:customerNbrId::lovIconId";
	String Customer_Search_Button="t:customerNbrId::_afrLovInternalQueryId::search";
	String Customer_Number_Table  =".//*[@id='t:customerNbrId_afrLovInternalTableId::db']/table";
	String PolicyHolderInput ="t:policyHolderTypeId::content";
	String FirstNameInput="t:FirstName::content";
	String LastNameInput="t:LastName::content";
	String ApplicationDateInput="t:id4::content";
	String PolicyTypeSelection="t:policyTypeIdId::content";
	String EffectiveDateInput="t:policyEffectiveDate::content";
	String PolicyGroupSelection="t:policyGroupNbrId::content";
	String InsuranceSelection="t:insuranceCoNbrId::content";
	String ProductSelection="t:productNbrId::content";
	String PaymentSelection="t:paymentMethodIdId::content";
	String BusinessSelection="t:businessTypeIdId::content";
	String Search_Sales_Entity= "t:salesEntityNbrId::lovIconId";
	String Sales_Search_Button = "t:salesEntityNbrId::_afrLovInternalQueryId::search";
	String SalesLocationSelection="t:soc11";  //By Name
	String Sales_Entity_Table=".//*[@id='t:salesEntityNbrId_afrLovInternalTableId::db']/table";
	String Apply_Button="t:event_Apply";
	String Message="t:messagesPanelGroupLayout";
	String MembersButton="t:members_button_member";
	

}