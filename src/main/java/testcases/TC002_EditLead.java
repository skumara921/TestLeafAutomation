package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_EditLead";
		testDescription ="Edit a lead";
		category = "Smoke";
		authors= "Kumaran";
		testNodes = "Leads";
		dataSheetName="TC002";
		
	}
	@Test(dataProvider="fetchData")
	public  void editLead(String uName, String pWord, String fName, String cName)  throws InterruptedException {
		new LoginPage()
		.typeUsername(uName)
		.typePassword(pWord)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.typeFirstNameFL(fName)
		.clickFindLeadButton()
		.clickFirstLeadId()
		.clickEditButton()
		.updateCName(cName)
		.clickUpdateButton()
		.verifyCName(cName);		
	}

}
