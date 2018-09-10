package testcases;

import org.testng.annotations.BeforeTest;

//import org.junit.Test;

import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {
	
	@BeforeTest(groups="common")
	public void setData() {
		testCaseName = "TC005_MergeLead";
		testDescription ="Merge two leads";
		category = "Sanity";
		authors= "Babu";
		testNodes = "Leads";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public  void mergeLead(String uName, String pWord, String fName, String sName, String expectedMsg) throws InterruptedException   {
		String firstLeadId = new LoginPage()
		.typeUsername(uName)
		.typePassword(pWord)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.switchtoWindow(1)
		.typeFirstNameFL(fName)
		.clickFindLeadButton()
		.getFirstLeadId();
		new FindLeadsPage()
		.clickFirstLeadIdML()
		.switchtoWindow(0)
		.clickToLead()
		.switchtoWindow(1)
		.typeFirstNameFL(sName)
		.clickFindLeadButton()
		.clickSecondLeadId()
		.clickMergeButton()
		.switchToAlert()
		.clickFindLeads()
		.typeLeadIDFL(firstLeadId)
		.clickFindLeadButton()
		.verifyErrorMsg(expectedMsg);	
		
	}

}
