package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.LandingPageLocators;
import pageObjectClass.MailFormLocators;

public class ComposeMailTest extends BaseClass {

	LandingPageLocators lp = new LandingPageLocators(driver);
	MailFormLocators composemail = new MailFormLocators(driver);

	@Test(priority = 1)
	void mailMenuClick() {
		Assert.assertTrue(lp.clickEmailsTab());
	}

	@Test(priority = 2)
	void composeMailButtonClick() {
		Assert.assertTrue(composemail.mailComposeButtonClick());
	}

	@Test(priority = 3)
	void fillTheForm() {
		Assert.assertTrue(composemail.composeMailFillandsend("guna@gmail.com", "New Lead", "Lead quote", "Ap",
				"iphone19", "Case", "new oreder", "Downloads\\Java_Problems_QA_Tester.pdf"));
	}

}
