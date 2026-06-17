package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions
(
	features = "@target\\failedRun.txt",
	glue = "stepDef",
	tags = "@Smoke",
	dryRun = false,
	monochrome = true,
	plugin =
	{
		//HTML >> JSON >> JUNIT
		"html:target\\ALLHTMLReports\\MyHtmlreport.html",
		"junit:target\\ALLJUNITReports\\MyJunitreport.junit",
		"json:target\\ALLJSONReports\\MyJsonreport.xml",
		"rerun:target\\failedRun.txt"
	}		
)

public class FailedRunner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel=true)
	public Object[][] scenarios() 
	{
	    return super.scenarios();
	}
}
