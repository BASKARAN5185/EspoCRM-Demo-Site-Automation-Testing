package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.AccountPageLocators;
import utility.TestDataProviderClass;

public class AccountPageFlowTesting extends BaseClass {

	AccountPageLocators accountPage = new AccountPageLocators(driver);

	@Test(enabled = true, groups = {
			"FullAccountTest" }, dataProvider = "accountDataProvider", dataProviderClass = TestDataProviderClass.class)
	public void fullAccountCreationAndVerificationFlow(String name, String website, String email, String phone,
			String billingStreet, String billingCity, String billingState, String billingPostalCode,
			String billingCountry, String shippingStreet, String shippingCity, String shippingState,
			String shippingPostalCode, String shippingCountry, String assignedUser, String team, String description,
			String typeDropdown, String industryDropdown) {

		try {
			assertThat(accountPage.clickAccountsTab(), "Click Accounts tab");
			accountPage.confirmLeaveFormIfVisible(driver);
			assertThat(getPageURl().contains("#Account"), "Verify Accounts URL");

			assertThat(accountPage.clickCreateAccountButton(), "Click Create Account");

			// Basic Info
			assertThat(accountPage.enterName(name), "Enter account name");
			assertThat(accountPage.enterWebsite(website), "Enter website");
			assertThat(accountPage.enterEmail(email), "Enter email");
			assertThat(accountPage.enterPhone(phone), "Enter phone");

			// Billing Address
			assertThat(accountPage.enterBillingStreet(billingStreet), "Enter billing street");
			assertThat(accountPage.enterBillingCity(billingCity), "Enter billing city");
			assertThat(accountPage.enterBillingState(billingState), "Enter billing state");
			assertThat(accountPage.enterBillingPostalCode(billingPostalCode), "Enter billing postal code");
			assertThat(accountPage.enterBillingCountry(billingCountry), "Enter billing country");

			// Shipping Address
			assertThat(accountPage.enterShippingStreet(shippingStreet), "Enter shipping street");
			assertThat(accountPage.enterShippingCity(shippingCity), "Enter shipping city");
			assertThat(accountPage.enterShippingState(shippingState), "Enter shipping state");
			assertThat(accountPage.enterShippingPostalCode(shippingPostalCode), "Enter shipping postal code");
			assertThat(accountPage.enterShippingCountry(shippingCountry), "Enter shipping country");

			// Description
			assertThat(accountPage.enterDescription(description), "Enter description");

			// Assigned User
			assertThat(accountPage.enterAssignedUser(assignedUser), "Enter assigned user");
			assertThat(accountPage.clickAssignedUserSelect(), "Click assigned user select");

			// Team
			assertThat(accountPage.enterTeam(team), "Enter team");
			assertThat(accountPage.clickTeamSelectButton(), "Click team select");

			// Save and Cancel
			// assertThat(accountPage.clickSaveButton(), "Click Save button");
			// accountPage.confirmLeaveFormIfVisible(driver);

			// assertThat(accountPage.clickCancelButton(), "Click Cancel button");

			/*
			 * // Save and Continue accountPage.clickActionToggleButton();
			 * assertThat(accountPage.clickSaveAndContinueButton(),
			 * "Click Save and Continue"); accountPage.confirmLeaveFormIfVisible(driver);
			 */

			// Save and New
			accountPage.clickActionToggleButton();
			assertThat(accountPage.clickSaveAndNewButton(), "Click Save and New");
			accountPage.confirmLeaveFormIfVisible(driver);

			// UI Validations
			assertThat(accountPage.isHeaderTitleVisible(), "Header title is visible");
			assertThat(accountPage.isBreadcrumbsVisible(), "Breadcrumbs are visible");

		} catch (Exception e) {
			Assert.fail("❗ Exception during full account flow: " + e.getMessage());
		}
	}

	private void assertThat(boolean clickAccountsTab, String string) {
		// TODO Auto-generated method stub

	}
}
