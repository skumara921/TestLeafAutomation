package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleCName;
	public EditLeadPage verifyFirstName() {
	getText(eleCName);
	return this;
	}

	@And("Update the company name as (.*)")
	public EditLeadPage updateCName(String cName) {
	type(eleCName, cName);
	return this;
	}
	
	@FindBy(name="submitButton")
	WebElement eleUpdateButton;
	@And("Click Update")
	public ViewLead clickUpdateButton() {
		click(eleUpdateButton);
		return new ViewLead();
		}
}







