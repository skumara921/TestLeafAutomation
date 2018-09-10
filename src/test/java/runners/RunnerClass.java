package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//cucumber with POM - Create Lead
//@CucumberOptions(features="src/test/java/features/CreateLead.feature", glue= {"pages", "steps"}, monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
//cucumber with POM - Edit Lead
//@CucumberOptions(features="src/test/java/features/EditLead.feature", glue= {"pages", "steps"}, monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
//cucumber with POM - Duplicate Lead
//@CucumberOptions(features="src/test/java/features/DuplicateLead.feature", glue= {"pages", "steps"}, monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
//cucumber with POM - Delete Lead
@CucumberOptions(features="src/test/java/features/DeleteLead.feature", glue= {"pages", "steps"}, monochrome=false,
plugin = {"pretty", "html:CucumberReports"},
dryRun = false, snippets = SnippetType.CAMELCASE)
//Create Lead Cucumber
//@CucumberOptions(features="src/test/java/features/CreateLead.feature", glue= "steps", monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
//Edit Lead Cucumber
//@CucumberOptions(features="src/test/java/features/EditLead.feature", glue= "steps", monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
//Delete Lead Cucumber
//@CucumberOptions(features="src/test/java/features/DeleteLead.feature", glue= "steps", monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
//Duplicate Lead cucumber
//@CucumberOptions(features="src/test/java/features/DuplicateLead.feature", glue= "steps", monochrome=false,
//plugin = {"pretty", "html:CucumberReports"},
//dryRun = false, snippets = SnippetType.CAMELCASE)
public class RunnerClass {

}
