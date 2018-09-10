package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {

	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement eleUname;
	@And("Enter User Name as (.*)")
	public LoginPage typeUsername(String data) {
	//WebElement eleUname = locateElement("id", "username");
	type(eleUname, data);
	return this;    
	}
	
	@FindBy(id="password")
	WebElement elePassword;
	@And("Enter password as (.*)")
	public LoginPage typePassword(String data) {
	//WebElement elePassword = locateElement("id", "password");
	type(elePassword, data);
	return this;
	}
	@FindBy(className="decorativeSubmit")
	WebElement eleLogin;
	@Given("Click Login")
	public HomePage clickLogin() {
	//WebElement eleLogin = locateElement("class", "decorativeSubmit");
	click(eleLogin);
	return new HomePage();		
	}
	public HomePage verifyLogin() {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
		verifyExactAttribute(eleLogin, "name", "");
		HomePage hm = new HomePage();
		return hm;
				
		}
}







