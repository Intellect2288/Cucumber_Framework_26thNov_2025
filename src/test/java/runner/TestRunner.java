package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = {"src\\test\\resources\\FeatureFiles\\Login.feature"},
    glue = {"stepDef", "hooks"},
//    tags = "@Smoke",
    dryRun = false,
    monochrome = true,
    plugin =
    {	"pretty",
        "html:target\\ALLHTMLReports\\MyHtmlreport.html",
        "junit:target\\ALLJUNITReports\\MyJunitreport.xml",
        "json:target\\ALLJSONReports\\MyJsonreport.json",
        "rerun:target\\failedRun.txt",

        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)

public class TestRunner extends AbstractTestNGCucumberTests
{
	@DataProvider(parallel=true)
	public Object[][] scenarios() 
	{
	    return super.scenarios();
	}
	
}