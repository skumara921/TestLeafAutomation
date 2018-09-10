package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods {

	public CreateLeads() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
//	@And("Click Create tab")
	public CreateLeads clickLeads() {
	click(eleCreateLead);
	return this;
	}
	@FindBy(name="submitButton")
	WebElement eleCreateLeadButton;
	@When("Click create Lead")
	public ViewLead clickCreateLeadsButton() {
	click(eleCreateLeadButton);
	return new ViewLead();
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	@And("Enter Create Lead First Name as (.*)")
	public CreateLeads typeFirstName(String firstName) {
	type(eleFirstName, firstName);
	return this;
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	@And("Enter Company Name as (.*)")
	public CreateLeads typeCName(String cName) {
	type(eleCompanyName, cName);
	return this;
	}
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	@And("Enter Last Name as (.*)")
	public CreateLeads typeLastName(String lastName) {
	type(eleLastName, lastName);
	return this;
	}
	
	
	
}







