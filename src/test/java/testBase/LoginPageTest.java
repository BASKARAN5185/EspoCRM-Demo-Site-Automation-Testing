package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.LoginPage;

public class LoginPageTest extends BaseClass {

	 LoginPage loginPage = new LoginPage(driver);;
	
	

	/*
	 * // Before each test, initialize the driver and page objects
	 * 
	 * @BeforeMethod public void setUp() { // Initialize the driver (Assuming driver
	 * setup is done in BaseClass) // WebDriver driver = getDriver(); // Replace
	 * with actual driver getter method loginPage = new LoginPage(driver); }
	 */

	@Test
	public void loginTheEspoCRM() {

		loginPage.clickTheLogin();
		Assert.assertEquals("https://demo.us.espocrm.com/?l=en_US", getPageURl());
	}

}
