package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {

	@BeforeTest(groups="common")
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription ="Create a lead";
		category = "Smoke";
		authors= "Kumaran";
		testNodes = "Leads";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String uName, String pWord, String cName, String fName, String lName)
	{
		new LoginPage()
		.typeUsername(uName)
		.typePassword(pWord)
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLead()
		.typeCName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadsButton()
		.verifyFirstName(fName);
	}


}
