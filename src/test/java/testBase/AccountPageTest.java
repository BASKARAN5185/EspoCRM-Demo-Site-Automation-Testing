package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.AccountPageLocators;

public class AccountPageTest extends BaseClass {

	AccountPageLocators accountPage = new AccountPageLocators(driver);
	// LoginPageTest login = new LoginPageTest();

	/*
	 * // Before each test, initialize the driver and page objects
	 * 
	 * @BeforeMethod public void setUp() { // Initialize the driver (Assuming driver
	 * setup is done in BaseClass) // WebDriver driver = getDriver(); // Replace
	 * with actual driver getter method accountPage = new
	 * AccountPageLocators(driver); }
	 */

	@Test(priority = -1, groups = { "AccountPage", "Smoke", "Regression" })
	public void accountsMenuIsClickable() {

		Assert.assertTrue(accountPage.clickAccountsTab(), "Accounts tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Account"), "URL does not contain '#Account' after clicking Accounts");
	}

	// Filter Dropdown Tests
	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void filterDropdownIsClickable() {
		Assert.assertTrue(accountPage.clickFilterDropdown(), "Filter dropdown is not clickable.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void searchTextIsEnteredSuccessfully() {
		Assert.assertTrue(accountPage.enterSearchText("Test Search"), "Failed to enter search text.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void searchButtonIsClickable() {
		Assert.assertTrue(accountPage.clickSearchButton(), "Search button is not clickable.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void resetButtonIsClickable() {
		Assert.assertTrue(accountPage.clickResetButton(), "Reset button is not clickable.");
	}

	// Filter Option Tests
	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void filterOptionAllIsSelectable() {
		accountPage.clickFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterOptionAll(), "'All' filter option is not selectable.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void filterOptionStarredIsSelectable() {
		accountPage.clickFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterOptionStarred(), "'Starred' filter option is not selectable.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void filterOptionRecentlyCreatedIsSelectable() {
		accountPage.clickFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterOptionRecentlyCreated(),
				"'Recently Created' filter option is not selectable.");
	}

	// Checkbox Tests
	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void onlyMyCheckboxIsChecked() {
		accountPage.clickFilterDropdown();
		Assert.assertTrue(accountPage.checkOnlyMyCheckbox(), "'Only My' checkbox is not checked.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void followedCheckboxIsChecked() {
		accountPage.clickFilterDropdown();
		Assert.assertTrue(accountPage.checkFollowedCheckbox(), "'Followed' checkbox is not checked.");
	}

	// Add Filter Tests
	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void addFilterDropdownIsClickable() {
		Assert.assertTrue(accountPage.clickAddFilterDropdown(), "'Add Filter' dropdown is not clickable.");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void filterAssignedUserOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterAssignedUser(), "'Assigned User' filter option is not clickable.");
	}

	// Filter Option Tests (Teams, Created At, etc.)
	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void teamsFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterTeams(), "Teams filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void createdAtFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterCreatedAt(), "Created At filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void createdByFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterCreatedBy(), "Created By filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void modifiedAtFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterModifiedAt(), "Modified At filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void typeFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterType(), "Type filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void industryFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterIndustry(), "Industry filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void descriptionFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterDescription(), "Description filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void emailFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterEmail(), "Email filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void phoneFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterPhone(), "Phone filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void targetListsFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterTargetLists(), "Target Lists filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void countryFilterOptionIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterCountry(), "Country filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void billingAddressFilterIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterBillingAddress(), "Billing Address filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void shippingAddressFilterIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterShippingAddress(), "Shipping Address filter option is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void websiteFilterIsClickable() {
		accountPage.clickAddFilterDropdown();
		Assert.assertTrue(accountPage.selectFilterWebsite(), "Website filter option is not clickable");
	}

	@Test(groups = { "Smoke", "AccountPage", "Sanity", "Regression" }, dependsOnMethods = "websiteFilterIsClickable")
	public void createAccountButtonIsClickable() {
		Assert.assertTrue(accountPage.clickCreateAccountButton(), "Create Account button is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void actionsDropdownIsClickable() {
		Assert.assertTrue(accountPage.clickActionsDropdownButton(), "Actions dropdown button is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void removeActionIsClickable() {
		Assert.assertTrue(accountPage.clickActionRemove(), "Remove action is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void mergeActionIsClickable() {
		Assert.assertTrue(accountPage.clickActionMerge(), "Merge action is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void massUpdateActionIsClickable() {
		Assert.assertTrue(accountPage.clickActionMassUpdate(), "Mass Update action is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void exportActionIsClickable() {
		Assert.assertTrue(accountPage.clickActionExport(), "Export action is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void followActionIsClickable() {
		Assert.assertTrue(accountPage.clickActionFollow(), "Follow action is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void testUnfollowActionClick() {
		Assert.assertTrue(accountPage.clickActionUnfollow(), "Unfollow action button is not clickable");
	}

	@Test(enabled = false, groups = { "AccountPage", "Sanity", "Regression" })
	public void testRecalculateFormulaClick() {
		Assert.assertTrue(accountPage.clickActionRecalculateFormula(), "Recalculate Formula button is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testPaginationNextClick() {
		Assert.assertTrue(accountPage.clickPaginationNext(), "Next pagination button is not clickable");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testToggleIndustryColumn() {
		accountPage.clickSettingsDropdownToggle();
		Assert.assertTrue(accountPage.toggleIndustryColumn(), "Industry column toggle failed");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testToggleTypeColumn() {
		accountPage.clickSettingsDropdownToggle();
		Assert.assertTrue(accountPage.toggleTypeColumn(), "Type column toggle failed");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testToggleCountryColumn() {
		accountPage.clickSettingsDropdownToggle();
		Assert.assertTrue(accountPage.toggleCountryColumn(), "Country column toggle failed");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testToggleCityColumn() {
		accountPage.clickSettingsDropdownToggle();
		Assert.assertTrue(accountPage.toggleCityColumn(), "City column toggle failed");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testToggleColumnResize() {
		accountPage.clickSettingsDropdownToggle();
		Assert.assertTrue(accountPage.toggleColumnResize(), "Column Resize toggle failed");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testHeaderTitleVisibility() {
		Assert.assertTrue(accountPage.isHeaderTitleVisible(), "Header title is not visible");
	}

	@Test(groups = { "AccountPage", "Sanity", "Regression" })
	public void testBreadcrumbsVisibility() {
		Assert.assertTrue(accountPage.isBreadcrumbsVisible(), "Breadcrumbs are not visible");
	}

	// ======= ACTION BUTTON TESTS =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" }, dependsOnMethods = "createAccountButtonIsClickable")
	public void testClickSaveButton() {
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.clickSaveButton(), "Save button is not clickable");
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" }, dependsOnMethods = "testClickSaveButton")
	public void testClickCancelButton() {
		Assert.assertTrue(accountPage.clickCancelButton(), "Cancel button is not clickable");
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testClickSaveAndContinueButton() {
		accountPage.clickCreateAccountButton();
		accountPage.clickActionToggleButton();
		Assert.assertTrue(accountPage.clickSaveAndContinueButton(), "Save and Continue button is not clickable");
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testClickSaveAndNewButton() {
		accountPage.clickCreateAccountButton();
		accountPage.clickActionToggleButton();
		Assert.assertTrue(accountPage.clickSaveAndNewButton(), "Save and New button is not clickable");
	}
	// ======= BASIC INFO INPUT TESTS =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterName() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account"), "Failed to enter account name");
		accountPage.clickActionToggleButton();
		accountPage.clickSaveAndNewButton();
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterWebsite() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 1"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterWebsite("https://example.com"), "Failed to enter website");
		accountPage.clickActionToggleButton();
		accountPage.clickSaveAndNewButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterEmail() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 2"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterEmail("test@example.com"), "Failed to enter email");
		accountPage.clickActionToggleButton();
		accountPage.clickSaveAndNewButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterPhone() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 3"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterPhone("1234567890"), "Failed to enter phone number");
		accountPage.clickActionToggleButton();
		accountPage.clickSaveAndNewButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testPhoneTypeDropdownVisibility() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		// Assert.assertTrue(accountPage.enterName("Test Account 908"), "Failed to enter
		// account name");
		Assert.assertTrue(accountPage.isPhoneTypeDropdownVisible(), "Phone type dropdown is not visible");

	}

	// ======= BILLING ADDRESS INPUT TEST =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterBillingStreet() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 4"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterBillingStreet("123 Main St"), "Failed to enter billing street");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	// ======= BILLING ADDRESS INPUT TESTS =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterBillingCity() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 5"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterBillingCity("New York"), "Failed to enter billing city");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterBillingState() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 86"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterBillingState("NY"), "Failed to enter billing state");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterBillingPostalCode() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 76"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterBillingPostalCode("10001"), "Failed to enter billing postal code");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterBillingCountry() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 66"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterBillingCountry("USA"), "Failed to enter billing country");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	// ======= SHIPPING ADDRESS INPUT TESTS =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterShippingStreet() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 46"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterShippingStreet("456 Elm St"), "Failed to enter shipping street");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterShippingCity() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 06"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterShippingCity("Los Angeles"), "Failed to enter shipping city");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);

	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterShippingState() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 226"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterShippingState("CA"), "Failed to enter shipping state");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterShippingPostalCode() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 007"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterShippingPostalCode("90001"), "Failed to enter shipping postal code");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterShippingCountry() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 08"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterShippingCountry("USA"), "Failed to enter shipping country");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testClickCopyBillingButton() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 9"), "Failed to enter account name");
		Assert.assertTrue(accountPage.clickCopyBillingButton(), "Copy billing button is not clickable");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	// ======= DESCRIPTION TEST =======

	// ======= DESCRIPTION INPUT TEST =======
	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterDescription() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 16"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterDescription("Test Description for Account"), "Failed to enter description");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	// ======= ASSIGNED USER ACTIONS TESTS =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterAssignedUser() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 11"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterAssignedUser("John Doe"), "Failed to enter assigned user");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testClickAssignedUserSelect() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 12"), "Failed to enter account name");
		Assert.assertTrue(accountPage.clickAssignedUserSelect(), "Assigned user select button is not clickable");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testClickAssignedUserClear() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 13"), "Failed to enter account name");
		Assert.assertTrue(accountPage.clickAssignedUserClear(), "Assigned user clear button is not clickable");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	// ======= TEAMS ACTIONS TESTS =======

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testEnterTeam() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 14"), "Failed to enter account name");
		Assert.assertTrue(accountPage.enterTeam("Sales Team"), "Failed to enter team");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

	@Test(groups = { "AccountCreate", "Sanity", "Regression" })
	public void testClickTeamSelectButton() {
		accountPage.clickAccountsTab();
		accountPage.clickCreateAccountButton();
		Assert.assertTrue(accountPage.enterName("Test Account 15"), "Failed to enter account name");
		Assert.assertTrue(accountPage.clickTeamSelectButton(), "Team select button is not clickable");
		accountPage.clickSaveButton();
		accountPage.confirmLeaveFormIfVisible(driver);
	}

}
