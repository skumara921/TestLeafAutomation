//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//
//public class CreateLead {
//	public static String firstLeadId, firstLeadName ;
//	public ChromeDriver driver;
//	@Given("Launch the browser")
//	public void launchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//	
//	@And("Maximize the browser")
//	public void maximize()
//	{
//		driver.manage().window().maximize();
//	}
//	
//	@And("Set timeout")
//	public void setTimeOut()
//	{
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	@And("Load URL")
//	public void loadUrl()
//	{
//		driver.navigate().to("http://leaftaps.com/opentaps");
//	}
//	@And("Enter User Name as (.*)")
//	public void typeUserName(String userName)
//	{
//		driver.findElementById("username").sendKeys(userName);
//	}
//	@And("Enter password as (.*)")
//	public void typePassword(String password)
//	{
//		driver.findElementById("password").sendKeys(password);
//	}
//	
//	@And("Click Login")
//	public void clickLogin()
//	{
//		driver.findElementByClassName("decorativeSubmit").click();
//	}
//	@And("Click crmsfa")
//	public void clickCrmsfa()
//	{
//		driver.findElementByLinkText("CRM/SFA").click();
//	}
//	@And("Click lead tab")
//	public void clickLead()
//	{
//		driver.findElementByLinkText("Leads").click();
//	}
//	@And("Click Create Lead")
//	public void clickCreateLead()
//	{
//		driver.findElementByLinkText("Create Lead").click();
//	}
//	
//	@And("Click Find Lead")
//	public void clickFindLead()
//	{
//		driver.findElementByLinkText("Find Leads").click();
//	}
//	
//	@And("Click Update")
//	public void clickUpdateButton()
//	{
//		driver.findElementByName("submitButton").click();
//	}
//	
//	@And("Click Delete")
//	public void clickDeleteButton()
//	{
//		driver.findElementByLinkText("Delete").click();
//	}
//	
//	@And("Click Duplicate Lead Button")
//	public void clickDuplicateLeadButton()
//	{
//		driver.findElementByLinkText("Duplicate Lead").click();
//	}
//	
//	@And("Capture First Lead Name")
//	public String getFirstLeadName() throws InterruptedException
//	{
//		Thread.sleep(3000);
//	firstLeadName = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]").getText();
//		return firstLeadName;
//	}
//	
//	@And("Capture First Lead Id")
//	public String getFirstLeadId() throws InterruptedException
//	{
//		Thread.sleep(3000);
//	firstLeadId = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
//		return firstLeadId;
//	}
//	
//	@And("Enter First Lead Id")
//	public void typeFirstLeadId()
//	{
//		driver.findElementByXPath("//input[@name='id']").sendKeys(firstLeadId);
//	}
//	
//	@And("Enter Company Name as (.*)")
//	public void typeCompanyName(String cName)
//	{
//		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
//	}
//	
//	@And("Update the company name as (.*)")
//	public void UpdateCompanyName(String cName)
//	{
//		driver.findElementById("updateLeadForm_companyName").clear();
//		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
//	}
//	@And("Enter Create Lead First Name as (.*)")
//	public void typeFirstName(String fName)
//	{
//		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
//	}
//	
//	@And("Enter Find Lead First Name as (.*)")
//	public void typeFirstNameFindLead(String fName)
//	{
//		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
//	}
//	
//	@And("Click Find Lead button")
//	public void clickFindLeadButton()
//	{
//		driver.findElementByXPath("(//input[@name='companyName'])[2]/following::button[1]").click();
//	}
//	
//	@And("Click First Lead Id")
//	public void clickFirstLead() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
//	}
//	
//	@And("Click Edit")
//	public void clickEditButton()
//	{
//		driver.findElementByLinkText("Edit").click();
//	}
//	
//	@And("Enter Last Name as (.*)")
//	public void typeLastName(String lName)
//	{
//		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
//	}
//	@When("Click create Lead")
//	public void clickCreateLeadButton()
//	{
//		driver.findElementByName("submitButton").click();
//	}
//	
//	@When("Verify the company name as (.*)")
//	public void verifyCompanyName(String cName)
//	{
//		String getCName = driver.findElementById("viewLead_companyName_sp").getText();
//		if(getCName.contains(cName))
//		{
//			System.out.println("User is able to edit the lead: "+getCName);
//		}else
//		{
//			System.out.println("User is not able to edit the lead "+getCName);
//		}
//	}
//	
//	@When("Verify First Name as (.*)")
//	public void verifyFirstName(String fName)
//	{
//		String getFName = driver.findElementById("viewLead_firstName_sp").getText();
//		if(getFName.contains(fName))
//		{
//			System.out.println("First Name coming as expected: "+getFName);
//		}else
//		{
//			System.out.println("First Name not coming as expected: "+getFName);
//		}
//	}
//	
//	
//	@When("Verify the expected message as (.*)")
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
//	
//	@When("Verify the page title")
//	public void verifyPageTitle()
//	{
//		String title = driver.getTitle();
//		if(title.equals("View Lead | opentaps CRM"))
//		{
//			System.out.println("Lead is created: "+title);
//		}else
//		{
//			System.out.println("Lead is not created: "+title);
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
