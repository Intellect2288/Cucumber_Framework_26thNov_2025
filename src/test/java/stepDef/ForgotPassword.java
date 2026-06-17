package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassword {
	
	@Given("User is on Forgot Password Page")
	public void user_is_on_forgot_password_page() {
	    System.out.println("User is on Forgot Password Page");
	}
	
	@When("User enters email {string}")
	public void user_enters_email(String string) {
		System.out.println("User enters email "+string);
	}
	
	@When("User clicks on Send Reset Link button")
	public void user_clicks_on_send_reset_link_button() {
		System.out.println("User clicks on Send Reset Link button");
	}
	
	@Then("Password reset link should be sent")
	public void password_reset_link_should_be_sent() {
		System.out.println("Password reset link should be sent");
	}
	
	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
		System.out.println("Error message should be displayed");
	}







}
