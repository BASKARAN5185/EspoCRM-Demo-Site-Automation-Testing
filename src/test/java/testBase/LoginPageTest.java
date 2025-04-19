package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage login = new LoginPage(driver);

	@Test
	void loginTheEspoCRM() {

		login.clickTheLogin();
		Assert.assertEquals("https://demo.us.espocrm.com/?l=en_US", getPageURl());
	}
	

}
