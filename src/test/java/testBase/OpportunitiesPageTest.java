package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.LandingPageLocators;
import pageObjectClass.OpportunitiesPageLocators;

public class OpportunitiesPageTest extends BaseClass{

	// Class-level initialization of oppPage
	OpportunitiesPageLocators oppPage = new OpportunitiesPageLocators(driver);
	LandingPageLocators landPage=new LandingPageLocators(driver);

	

	@Test(priority = 1, groups = { "OpportunitiesCreate", "Sanity" })
	public void testGetHeaderTitleText() {
		landPage.clickOpportunitiesTab();
		String headerText = oppPage.getHeaderTitleText();
		Assert.assertNotNull(headerText, "Header title text is null.");
	}

	@Test(priority = 2, groups = { "OpportunitiesCreate", "Sanity" })
	public void testGetBreadcrumbItemText() {
		String breadcrumbText = oppPage.getBreadcrumbItemText();
		Assert.assertNotNull(breadcrumbText, "Breadcrumb item text is null.");
	}

	@Test(priority = 3, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickCreateOpportunityButton() {
		boolean result = oppPage.clickCreateOpportunityButton();
		Assert.assertTrue(result, "Clicking on 'Create Opportunity' button failed.");
	}

	@Test(priority = 4, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickBreadcrumbOpportunities() {
		boolean result = oppPage.clickBreadcrumbOpportunities();
		Assert.assertTrue(result, "Clicking on 'Opportunities' breadcrumb link failed.");
	}

	@Test(priority = 5, groups = { "OpportunitiesCreate", "Sanity" })
	public void testIsBreadcrumbCreateDisplayed() {
		boolean isDisplayed = oppPage.isBreadcrumbCreateDisplayed();
		Assert.assertTrue(isDisplayed, "'Create' breadcrumb is not displayed.");
	}

	@Test(priority = 6, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterOpportunityName() {
		String opportunityName = "Test Opportunity";
		String enteredName = oppPage.enterOpportunityName(opportunityName);
		Assert.assertEquals(enteredName, opportunityName, "Opportunity name not entered correctly.");
	}

	@Test(priority = 7, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterAccountName() {
		String accountName = "Test Account";
		String enteredAccount = oppPage.enterAccountName(accountName);
		Assert.assertEquals(enteredAccount, accountName, "Account name not entered correctly.");
	}

	@Test(priority = 8, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickAccountSelectButton() {
		boolean result = oppPage.clickAccountSelectButton();
		Assert.assertTrue(result, "Clicking on 'Select' button for Account failed.");
	}

	@Test(priority = 9, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickAccountClearButton() {
		boolean result = oppPage.clickAccountClearButton();
		Assert.assertTrue(result, "Clicking on 'Clear' button for Account failed.");
	}

	@Test(priority = 10, groups = { "OpportunitiesCreate", "Sanity" })
	public void testSelectStage() {
		String stage = "Qualification";
		String selectedStage = oppPage.selectStage(stage);
		Assert.assertEquals(selectedStage, stage, "Stage selection failed.");
	}

	@Test(priority = 11, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterAmount() {
		String amount = "10000";
		String enteredAmount = oppPage.enterAmount(amount);
		Assert.assertEquals(enteredAmount, amount, "Amount not entered correctly.");
	}

	@Test(priority = 12, groups = { "OpportunitiesCreate", "Sanity" })
	public void testSelectAmountCurrency() {
		String currency = "USD";
		String selectedCurrency = oppPage.selectAmountCurrency(currency);
		Assert.assertEquals(selectedCurrency, currency, "Amount currency not selected correctly.");
	}

	@Test(priority = 13, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterProbability() {
		String probability = "75";
		String enteredProbability = oppPage.enterProbability(probability);
		Assert.assertEquals(enteredProbability, probability, "Probability not entered correctly.");
	}

	@Test(priority = 14, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterCloseDate() {
		String closeDate = "12/12/2025";
		String enteredCloseDate = oppPage.enterCloseDate(closeDate);
		Assert.assertEquals(enteredCloseDate, closeDate, "Close date not entered correctly.");
	}

	@Test(priority = 15, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickCloseDatePicker() {
		boolean result = oppPage.clickCloseDatePicker();
		Assert.assertTrue(result, "Clicking on 'Close Date Picker' icon failed.");
	}

	@Test(priority = 16, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterContacts() {
		String contact = "John Doe";
		String enteredContact = oppPage.enterContacts(contact);
		Assert.assertEquals(enteredContact, contact, "Contact not entered correctly.");
	}

	@Test(priority = 17, groups = { "OpportunitiesCreate", "Sanity" })
	public void testSelectLeadSource() {
		String leadSource = "Web";
		String selectedLeadSource = oppPage.selectLeadSource(leadSource);
		Assert.assertEquals(selectedLeadSource, leadSource, "Lead source not selected correctly.");
	}

	@Test(priority = 18, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterDescription() {
		String description = "Test Opportunity Description";
		String enteredDescription = oppPage.enterDescription(description);
		Assert.assertEquals(enteredDescription, description, "Description not entered correctly.");
	}

	@Test(priority = 19, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickAddItemButton() {
		boolean result = oppPage.clickAddItemButton();
		Assert.assertTrue(result, "Clicking on 'Add Item' button failed.");
	}

	@Test(priority = 20, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickAddProductsMenuItem() {
		boolean result = oppPage.clickAddProductsMenuItem();
		Assert.assertTrue(result, "Clicking on 'Add Products' menu item failed.");
	}

	@Test(priority = 21, groups = { "OpportunitiesCreate", "Sanity" })
	public void testSelectItemsCurrency() {
		String currency = "USD";
		String selectedCurrency = oppPage.selectItemsCurrency(currency);
		Assert.assertEquals(selectedCurrency, currency, "Items currency not selected correctly.");
	}

	@Test(priority = 22, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterAssignedUserName() {
		String userName = "Test User";
		String enteredUserName = oppPage.enterAssignedUserName(userName);
		Assert.assertEquals(enteredUserName, userName, "Assigned user name not entered correctly.");
	}

	@Test(priority = 23, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickAssignedUserSelectButton() {
		boolean result = oppPage.clickAssignedUserSelectButton();
		Assert.assertTrue(result, "Clicking on 'Assigned User Select' button failed.");
	}

	@Test(priority = 24, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickAssignedUserClearButton() {
		boolean result = oppPage.clickAssignedUserClearButton();
		Assert.assertTrue(result, "Clicking on 'Assigned User Clear' button failed.");
	}

	@Test(priority = 25, groups = { "OpportunitiesCreate", "Sanity" })
	public void testEnterTeamName() {
		String teamName = "Test Team";
		String enteredTeamName = oppPage.enterTeamName(teamName);
		Assert.assertEquals(enteredTeamName, teamName, "Team name not entered correctly.");
	}

	@Test(priority = 26, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickTeamsSelectButton() {
		boolean result = oppPage.clickTeamsSelectButton();
		Assert.assertTrue(result, "Clicking on 'Teams Select' button failed.");
	}

	@Test(priority = 27, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickSaveButton() {
		boolean result = oppPage.clickSaveButton();
		Assert.assertTrue(result, "Clicking on 'Save' button failed.");
	}

	@Test(priority = 28, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickCancelButton() {
		boolean result = oppPage.clickCancelButton();
		Assert.assertTrue(result, "Clicking on 'Cancel' button failed.");
	}

	@Test(priority = 29, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickSaveAndContinueEditing() {
		boolean result = oppPage.clickSaveAndContinueEditing();
		Assert.assertTrue(result, "Clicking on 'Save & Continue Editing' button failed.");
	}

	@Test(priority = 30, groups = { "OpportunitiesCreate", "Sanity" })
	public void testClickSaveAndNew() {
		boolean result = oppPage.clickSaveAndNew();
		Assert.assertTrue(result, "Clicking on 'Save & New' button failed.");
	}
}
