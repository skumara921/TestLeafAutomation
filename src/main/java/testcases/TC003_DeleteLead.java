package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeTest(groups="common")
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testDescription ="Delete a lead";
		category = "Sanity";
		authors= "Kumaran";
		testNodes = "Leads";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public  void deleteLead(String uName, String pWord, String fName, String expectedMsg) throws InterruptedException   {
		String firstLeadId = new LoginPage()
		.typeUsername(uName)
		.typePassword(pWord)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.typeFirstNameFL(fName)
		.clickFindLeadButton()
		.getFirstLeadId();
		new FindLeadsPage()
		.clickFirstLeadId()
		.clickDeleteButton()
		.clickFindLeads()
		.typeLeadIDFL(firstLeadId)
		.clickFindLeadButton()
		.verifyErrorMsg(expectedMsg);	
	}

}
