package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {

	public DuplicateLeadPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="submitButton")
	WebElement eleCreateLeadButton;
	@And("Click Create Lead Button")
	public ViewLead clickCreateLeadsButton() {
	click(eleCreateLeadButton);
	return new ViewLead();
	}
	
}







