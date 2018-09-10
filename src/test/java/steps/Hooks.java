package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{

	@Before
	public void beforeMethod(Scenario sc)
	{
		System.out.println("TestName: "+sc.getName());
		System.out.println("Id is: "+sc.getName());
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Kumaran");
		startApp("chrome", "http://leaftaps.com/opentaps");
	}
	@After
	public void afterMethod()
	{
		closeAllBrowsers();
		endResult();
	}
}
