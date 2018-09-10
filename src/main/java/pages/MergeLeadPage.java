package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {

	public MergeLeadPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	public CreateLeads clickCreateLead() {
	click(eleCreateLead);
	return new CreateLeads();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	public FindLeadsPage clickFindLeads() {
	click(eleFindLead);
	return new FindLeadsPage();
	}
	
	@FindBy(linkText="Merge Leads")
	WebElement eleLeads;
	public MergeLeadPage clickLeads() {
	click(eleLeads);
	return new MergeLeadPage();
	}
	public  MergeLeadPage switchtoWindow(int index)
	{
	switchToWindow(index);
	return this;
	}
	
	@FindBy(xpath="//table[@id='widget_ComboBox_partyIdFrom']/following::a[1]")
	WebElement eleFromLead;
	public FindLeadsPage clickFromLead() {
	click(eleFromLead);
	return new FindLeadsPage();
	}
	
	@FindBy(xpath="//table[@id='widget_ComboBox_partyIdTo']/following::a[1]")
	WebElement eleToLead;
	public FindLeadsPage clickToLead() {
	click(eleToLead);
	return new FindLeadsPage();
	}
	
	@FindBy(linkText="Merge")
	WebElement eleMergeButton;
	public MergeLeadPage clickMergeButton() {
	click(eleMergeButton);
	return new MergeLeadPage();
	}
	
	public ViewLead switchToAlert()
	{
		acceptAlert();
		return new ViewLead();
	}
	
	
	
	
	
	
}







