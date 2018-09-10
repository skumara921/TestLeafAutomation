package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {

	public ViewLead() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleGetCName;	
	public ViewLead getCName() {
	getText(eleGetCName);
	return this;
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleGetFirstName;
	@Then("Verify First Name as (.*)")
	public ViewLead verifyFirstName(String expectedText) {
	verifyExactText(eleGetFirstName, expectedText);
	return this;
	}
	
	@Then("Verify the company name as (.*)")
	public ViewLead verifyCName(String expectedText) {
		verifyPartialText(eleGetCName, expectedText);
		return this;
		}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	public FindLeadsPage clickFindLeads() {
	click(eleFindLead);
	return new FindLeadsPage();
	}
	
	@FindBy(linkText="Edit")
	WebElement eleEditButton;	
	@When("Click Edit")
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	@FindBy(linkText="Delete")
	WebElement eleDeleteButton;
	@And("Click Delete")
	public MyLeads clickDeleteButton() {
		click(eleDeleteButton);
		return new MyLeads();
	}
	@FindBy(linkText="Duplicate Lead")
	WebElement eleDuplicateButton;
	@And("Click Duplicate Lead Button")
	public DuplicateLeadPage clickDuplicateLeadButton()
	{
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
//		driver.findElementByLinkText("Duplicate Lead").click();
	}
	
	@When("Verify the page title")
	public void verifyPageTitle()
	{
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Lead is created: "+title);
		}else
		{
			System.out.println("Lead is not created: "+title);
		}
	}
}







