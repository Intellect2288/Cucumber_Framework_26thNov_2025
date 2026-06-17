package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.DriverFactory;
import utils.ReusableMethods;

public class AdminPage {
	Properties prop; //null
	WebDriver driver; //null
	
	public AdminPage() throws IOException
	{
		String filePath = "C:\\Users\\laxmi\\Downloads\\PROJECT_1\\src\\main\\resources\\locators\\admin.properties";
		prop = ReusableMethods.getDetailsFromPropertiesFile(filePath);
		driver = DriverFactory.getDriver();
		
	}
	
	public void clickOnAdminTab() {
		driver.findElement(By.xpath(prop.getProperty("adminTab"))).click();
	}
	
	public void clickOnAddButton() {
		//click on add button
		driver.findElement(By.xpath(prop.getProperty("addButton"))).click();
	}
	
	public void addDetailsForNewUsers(String userRole, String employeeName,String status, String username, String password, String confirmPassword) throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("userRoleDropdown"))).click();
		Thread.sleep(2000);
		System.out.println("Clicked on user role dropdown");
//		System.out.println(driver.getPageSource());
		
		if(userRole.equalsIgnoreCase("Admin"))
		{
			System.out.println("Clicked on user Admin option");
			driver.findElement(By.xpath(prop.getProperty("userRoleAdminOption"))).click();
			
		}
		else if(userRole.equalsIgnoreCase("ESS"))
		{
			System.out.println("Clicked on user ESS option");
			driver.findElement(By.xpath(prop.getProperty("userRoleESSOption"))).click();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("statusDropdown"))).click();
		System.out.println(driver.getPageSource());
		//Select user status from dropdown
		
		if(userRole.equalsIgnoreCase("Enabled"))
		{
			driver.findElement(By.xpath(prop.getProperty("enabledOption"))).click();
		}
		else if(userRole.equalsIgnoreCase("Disabled"))
		{
			driver.findElement(By.xpath(prop.getProperty("disabledOption"))).click();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("usernameField"))).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("passwordField"))).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("confirmPasswordField"))).sendKeys(confirmPassword);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("employeeNameInput"))).sendKeys(employeeName);
		driver.findElement(By.xpath(prop.getProperty("selectEmployeeFromDropdown"))).sendKeys(employeeName);
		System.out.println(driver.getPageSource());
		//select employee name from auto-suggest dropdown
		Thread.sleep(2000);		
//		driver.findElement(By.xpath(prop.getProperty("saveButton"))).click();
		
	}
	
	
	public boolean successfullyAddedUserToasterMessage() {
		return driver.findElement(By.xpath(prop.getProperty("successToasterMessageForSavedUser"))).isDisplayed(); //true or false
	}
	
	public void searchForUser(String username, String userRole, String employeeName, String status) {
		//enter username
		//select user role from dropdown
		//enter employee name
		//select status from dropdown
		//click on search button	
	}
	
	
	
	public void clickOnDeleteButton(String username) {
		//click on delete button
	}
	
	public void clickOnEditButton(String username) {
		//click on edit button
	}

}
