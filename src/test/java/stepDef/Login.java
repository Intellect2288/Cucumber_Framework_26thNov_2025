package stepDef;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ReusableMethods;

public class Login {
	LoginPage lp ;

	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException
	{
		//Browser launch & hit the URL
		ReusableMethods.launchApplication("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp = new LoginPage();
	}
	
	
	@When("user enters username as {string}")
	public void user_enters_username_as(String username) throws IOException {
		//enter username	
		lp.enterUsername(username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) throws IOException {
		//enter password
		LoginPage lp = new LoginPage();
		lp.enterPassword(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws IOException {
		//Click on login button
		lp.clickOnLoginButton();;
	}

	@Then("user should be navigated to dashboard page")
	public void user_should_be_navigated_to_dashboard_page() throws IOException {
		//Assertion
		String actualURL = lp.getURL();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actualURL, expectedURL," URL of dashboard");
	}

	@Then("user should see logout button")
	public void user_should_see_logout_button() throws IOException {
		//Assertion
		Assert.assertTrue(lp.logoutButtonIsDisplayed());
	}
	
	@Then("user should see error message {string}")
	public void user_should_see_error_message(String string) {
		
		
	}

	@Then("user should not be navigated to dashboard page")
	public void user_should_not_be_navigated_to_dashboard_page() {
	   
	}
	
	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
	    lp.loginToOrangeHRM(string, string2);
	}

	

}
