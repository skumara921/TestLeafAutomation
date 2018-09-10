package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {
	PageFactory.initElements(driver, this);
	}
	public static String firstLeadName, firstLeadId;
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleFirstName;
	@And("Enter Find Lead First Name as (.*)")
	public FindLeadsPage typeFirstNameFL(String fName) {
	type(eleFirstName, fName);
	return this;
	}
	public FindLeadsPage typeLeadIDFL(String leadID) {
	type(eleLeadId, leadID);
	return this;
	}
	@FindBy(xpath="//input[@name='id']")
	WebElement eleLeadId;
	@And("Enter First Lead Id")
	public FindLeadsPage typeLeadID() 
	{
		type(eleLeadId, firstLeadId);
		return this;
	}
	
	@FindBy(xpath="(//input[@name='companyName'])[2]/following::button[1]")
	WebElement eleFindLeadButton;
	@And("Click Find Lead button")
	public FindLeadsPage clickFindLeadButton() {
	click(eleFindLeadButton);
	return new FindLeadsPage();
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")
	WebElement eleFirstLeadNameGrid;
	@And("Capture First Lead Name")
	public String getFirstLeadName() throws InterruptedException
	{
		Thread.sleep(3000);
		String firstLeadName = getText(eleFirstLeadNameGrid);
//	firstLeadName = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]").getText();
		return firstLeadName;
	}
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleFirstLeadId;	
	@And("Capture First Lead Id")
	public String  getFirstLeadId() throws InterruptedException {
		Thread.sleep(3000);
		firstLeadId = getText(eleFirstLeadId);
	return firstLeadId;
	}
	@And("Click First Lead Id")
	public ViewLead clickFirstLeadId() throws InterruptedException {
	Thread.sleep(3000);
	click(eleFirstLeadId);
	return new ViewLead();
	}
	
	@FindBy(xpath="(//a[@class='linktext'])[6]")
	WebElement eleSecondLeadId;	
	public MergeLeadPage clickSecondLeadId() throws InterruptedException {
		Thread.sleep(3000);
		click(eleSecondLeadId);
		return new MergeLeadPage();
		}
	
	public MergeLeadPage clickFirstLeadIdML() throws InterruptedException {
		Thread.sleep(3000);
		click(eleFirstLeadId);
		return new MergeLeadPage();
		}
	
	@FindBy(linkText="Edit")
	WebElement eleEditButton;	
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();
	} ////div[text()='No records to display']
	
	@FindBy(xpath="//div[text()='No records to display']")
	WebElement eleExpectedMsg;	
	@Then("Verify the expected message as (.*)")
	public FindLeadsPage verifyErrorMsg(String expectedMsg) {
		verifyExactText(eleExpectedMsg, expectedMsg);
		return this;
	} 
	
	public  FindLeadsPage switchtoWindow(int index)
	{
	switchToWindow(index);
	return this;
	}
	
//	@FindBy(xpath="//div[text()='No records to display']")
//	WebElement expectedMsg;
//	@Then("Verify the expected message as (.*)")
//	public void verifyExpectedMsg(String expectedMsg)
//	{
//		String getActualMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
//		if(getActualMsg.equals(expectedMsg))
//		{
//			System.out.println("Expected message has come correctly: "+getActualMsg);
//		}else
//		{
//			System.out.println("Expected message has not come correctly: "+getActualMsg);
//		}
//	}
	
}







