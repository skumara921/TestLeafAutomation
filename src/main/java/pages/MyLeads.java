package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	public MyLeads() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	@And("Click Create Lead")
	public CreateLeads clickCreateLead() {
	click(eleCreateLead);
	return new CreateLeads();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	@And("Click Find Lead")
	public FindLeadsPage clickFindLeads() {
	click(eleFindLead);
	return new FindLeadsPage();
	}
	
	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLead;
	public MergeLeadPage clickMergeLead() {
	click(eleMergeLead);
	return new MergeLeadPage();
	}
	

}







