package hooks;

import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;

public class HooksSetup{

	WebDriver driver = null;
	@Before(order=1)
	public void setupData()
	{
		System.out.println("Before Hook - setupData - order 1");
		
	}

	@Before(order=2)
	public void setBrowser()
	{
		System.out.println("Before Hook - setBrowser - order 2");
	}

	@After(order=2)
	public void takeSceenshot(Scenario scn)
	{
		driver = DriverFactory.getDriver();
		
		if(scn.isFailed())
		{
			//takesceenshot & attach to the report
			//Takescreenshot -- Interface 
			//getSceenShot() --- method
			//File, byte , base64
			//attach()
			
			byte[] ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			String scnName = scn.getName().replaceAll(" ", "_");
			scn.attach(ss, "image/png", scnName);
		}
		
	}
	
	@After(order=1)
	public void tearDown()
	{
		System.out.println("After Hook - tearDown - order 1");
	}



}
