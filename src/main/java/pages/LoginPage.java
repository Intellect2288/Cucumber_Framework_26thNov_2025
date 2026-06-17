package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.DriverFactory;
import utils.ReusableMethods;

public class LoginPage {
	Properties prop; //null
	WebDriver driver; //null
	
	public LoginPage() throws IOException
	{
		String filePath = "C:\\Users\\laxmi\\Downloads\\PROJECT_1\\src\\main\\resources\\locators\\login.properties";
	    prop = ReusableMethods.getDetailsFromPropertiesFile(filePath);
//	    driver=drv;
	    driver=DriverFactory.getDriver();	
	}
	
	public void loginToOrangeHRM(String username, String password) {
		driver.findElement(By.xpath(prop.getProperty("usernameField"))).sendKeys(username);
		driver.findElement(By.xpath(prop.getProperty("passwordField"))).sendKeys(password);
		driver.findElement(By.xpath(prop.getProperty("loginButton"))).click();
	}
	
	public void clickOnForgotPassword() {
		driver.findElement(By.xpath(prop.getProperty("forgotPasswordLink"))).click();
	}
	
	public void clickOnLinkedInIcon() {
		//click on LinkedIn icon
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(By.xpath(prop.getProperty("usernameField"))).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(By.xpath(prop.getProperty("passwordField"))).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(By.xpath(prop.getProperty("loginButton"))).click();
	}
	
	public String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean logoutButtonIsDisplayed()
	{
		//Click on Profile Icon 
		//Then check if logout button is displayed or not
		
		driver.findElement(By.xpath(prop.getProperty("profileIcon"))).click();
		return driver.findElement(By.xpath(prop.getProperty("logoutButton"))).isDisplayed();
	}

	
}
