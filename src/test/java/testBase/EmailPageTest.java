package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.EmailPageLocators;
import pageObjectClass.LandingPageLocators;

public class EmailPageTest extends BaseClass {

	LandingPageLocators landingPage=new LandingPageLocators(driver);
	EmailPageLocators emailPage = new EmailPageLocators(driver);

	@Test(priority = 1, groups = { "EmailPage", "Sanity" })
	public void testClickHeaderTitle() {
		landingPage.clickEmailsTab();
		Assert.assertTrue(emailPage.clickHeaderTitle(), "Failed to click on Header Title");
	}

	@Test(priority = 2, groups = { "EmailPage", "Sanity" })
	public void testClickComposeEmailButton() {
		Assert.assertTrue(emailPage.clickComposeEmailButton(), "Failed to click on Compose Email Button");
	}

	@Test(priority = 3, groups = { "EmailPage", "Sanity" })
	public void testClickDropdownButton() {
		Assert.assertTrue(emailPage.clickDropdownButton(), "Failed to click on Dropdown Button");
	}

	@Test(priority = 4, groups = { "EmailPage", "Sanity" })
	public void testClickArchiveEmailOption() {
		Assert.assertTrue(emailPage.clickArchiveEmailOption(), "Failed to click on Archive Email Option");
	}

	@Test(priority = 5, groups = { "EmailPage", "Sanity" })
	public void testClickEmailTemplatesOption() {
		Assert.assertTrue(emailPage.clickEmailTemplatesOption(), "Failed to click on Email Templates Option");
	}

	@Test(priority = 6, groups = { "EmailPage", "Sanity" })
	public void testClickFoldersOption() {
		Assert.assertTrue(emailPage.clickFoldersOption(), "Failed to click on Folders Option");
	}

	@Test(priority = 7, groups = { "EmailPage", "Sanity" })
	public void testClickGroupEmailFolderOption() {
		Assert.assertTrue(emailPage.clickGroupEmailFolderOption(), "Failed to click on Group Email Folder Option");
	}

	@Test(priority = 8, groups = { "EmailPage", "Sanity" })
	public void testClickFiltersOption() {
		Assert.assertTrue(emailPage.clickFiltersOption(), "Failed to click on Filters Option");
	}

	@Test(priority = 9, groups = { "EmailPage", "Sanity" })
	public void testClickPersonalEmailAccountsOption() {
		Assert.assertTrue(emailPage.clickPersonalEmailAccountsOption(),
				"Failed to click on Personal Email Accounts Option");
	}

	@Test(priority = 10, groups = { "EmailPage", "Sanity" })
	public void testClickGroupEmailAccountsOption() {
		Assert.assertTrue(emailPage.clickGroupEmailAccountsOption(), "Failed to click on Group Email Accounts Option");
	}

	// Search section methods

	@Test(priority = 11, groups = { "EmailPage", "Sanity" })
	public void testEnterSearchText() {
		String searchText = "Test email";
		Assert.assertTrue(emailPage.enterSearchText(searchText), "Failed to enter text in Search Input");
	}

	@Test(priority = 12, groups = { "EmailPage", "Sanity" })
	public void testClickSearchButton() {
		Assert.assertTrue(emailPage.clickSearchButton(), "Failed to click Search Button");
	}

	@Test(priority = 13, groups = { "EmailPage", "Sanity" })
	public void testClickFilterDropdownButton() {
		Assert.assertTrue(emailPage.clickFilterDropdownButton(), "Failed to click Filter Dropdown Button");
	}

	@Test(priority = 14, groups = { "EmailPage", "Sanity" })
	public void testSelectAccountFilterOption() {
		Assert.assertTrue(emailPage.selectAccountFilterOption(), "Failed to select Account Filter Option");
	}

	@Test(priority = 15, groups = { "EmailPage", "Sanity" })
	public void testSelectDateSentFilterOption() {
		Assert.assertTrue(emailPage.selectDateSentFilterOption(), "Failed to select Date Sent Filter Option");
	}

	@Test(priority = 16, groups = { "EmailPage", "Sanity" })
	public void testSelectEmailAddressFilterOption() {
		Assert.assertTrue(emailPage.selectEmailAddressFilterOption(), "Failed to select Email Address Filter Option");
	}

	@Test(priority = 17, groups = { "EmailPage", "Sanity" })
	public void testSelectFromFilterOption() {
		Assert.assertTrue(emailPage.selectFromFilterOption(), "Failed to select From Filter Option");
	}

	@Test(priority = 18, groups = { "EmailPage", "Sanity" })
	public void testSelectToFilterOption() {
		Assert.assertTrue(emailPage.selectToFilterOption(), "Failed to select To Filter Option");
	}

	@Test(priority = 19, groups = { "EmailPage", "Sanity" })
	public void testSelectIsNotReadFilterOption() {
		Assert.assertTrue(emailPage.selectIsNotReadFilterOption(), "Failed to select Is Not Read Filter Option");
	}

	@Test(priority = 20, groups = { "EmailPage", "Sanity" })
	public void testSelectIsNotRepliedFilterOption() {
		Assert.assertTrue(emailPage.selectAccountFilterOption(), "Failed to select Is Not Replied Filter Option");
	}

	@Test(priority = 21, groups = { "EmailPage", "Sanity" })
	public void testSelectStatusFilterOption() {
		Assert.assertTrue(emailPage.selectStatusFilterOption(), "Failed to select Status Filter Option");
	}

	
}
