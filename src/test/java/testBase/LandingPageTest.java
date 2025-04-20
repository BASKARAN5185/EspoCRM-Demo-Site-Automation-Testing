package testBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.LandingPageLocators;

public class LandingPageTest extends BaseClass {

	private LandingPageLocators homePage;

    // Before each test, initialize the driver and page objects
    @BeforeMethod
    public void setUp() {
        // Initialize the driver (Assuming driver setup is done in BaseClass)
    //    WebDriver driver = getDriver();  // Replace with actual driver getter method
        homePage = new LandingPageLocators(driver);
    }

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void homeMenuIsClickable() {
		Assert.assertTrue(homePage.clickHomeTab(), "Home tab is not clickable");
		Assert.assertTrue(
				getPageURl().contains("#Home") || getPageURl().equals("https://demo.us.espocrm.com/?l=en_GB#"),
				"URL does not contain '#Home' or expected Home URL");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void accountsMenuIsClickable() {
		Assert.assertTrue(homePage.clickAccountsTab(), "Accounts tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Account"), "URL does not contain '#Account' after clicking Accounts");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void contactsMenuIsClickable() {
		Assert.assertTrue(homePage.clickContactsTab(), "Contacts tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Contact"), "URL does not contain '#Contact' after clicking Contacts");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void leadsMenuIsClickable() {
		Assert.assertTrue(homePage.clickLeadsTab(), "Leads tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Lead"), "URL does not contain '#Lead' after clicking Leads");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void opportunitiesMenuIsClickable() {
		Assert.assertTrue(homePage.clickOpportunitiesTab(), "Opportunities tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Opportunity"),
				"URL does not contain '#Opportunity' after clicking Opportunities");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void emailsTabIsClickable() {
		Assert.assertTrue(homePage.clickEmailsTab(), "Emails tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Email"), "URL does not contain '#Email' after clicking Emails");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void calendarTabIsClickable() {
		Assert.assertTrue(homePage.clickCalendarTab(), "Calendar tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Calendar"),
				"URL does not contain '#Calendar' after clicking Calendar");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void callsTabIsClickable() {
		Assert.assertTrue(homePage.clickCallsTab(), "Calls tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Call"), "URL does not contain '#Call' after clicking Calls");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void tasksTabIsClickable() {
		Assert.assertTrue(homePage.clickTasksTab(), "Tasks tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Task"), "URL does not contain '#Task' after clicking Tasks");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void meetingsTabIsClickable() {
		Assert.assertTrue(homePage.clickMeetingsTab(), "Meetings tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Meeting"), "URL does not contain '#Meeting' after clicking Meetings");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void casesTabIsClickable() {
		Assert.assertTrue(homePage.clickCasesTab(), "Cases tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Case"), "URL does not contain '#Case' after clicking Cases");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void knowledgeBaseTabIsClickable() {
		Assert.assertTrue(homePage.clickKnowledgeBaseTab(), "Knowledge Base tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#KnowledgeBaseArticle"),
				"URL does not contain '#KnowledgeBaseArticle' after clicking Knowledge Base");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void moreDropdownIsClickable() {
		Assert.assertTrue(homePage.clickMoreDropdown(), "More dropdown is not clickable");
		// Skipping URL check, as dropdowns often don't trigger navigation
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void campaignsTabIsClickable() {
		homePage.moreMenuClickable();
		Assert.assertTrue(homePage.clickCampaignsTab(), "Campaigns tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Campaign"),
				"URL does not contain '#Campaign' after clicking Campaigns");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void targetListsTabIsClickable() {
		homePage.moreMenuClickable();
		Assert.assertTrue(homePage.clickTargetListsTab(), "Target Lists tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#TargetList"),
				"URL does not contain '#TargetList' after clicking Target Lists");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void documentsTabIsClickable() {
		homePage.moreMenuClickable();
		Assert.assertTrue(homePage.clickDocumentsTab(), "Documents tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Document"),
				"URL does not contain '#Document' after clicking Documents");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void usersTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickOrganizationTab();
		Assert.assertTrue(homePage.clickUsersTab(), "Users tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#User"), "URL does not contain '#User' after clicking Users");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void teamsTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickOrganizationTab();
		Assert.assertTrue(homePage.clickTeamsTab(), "Teams tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Team"), "URL does not contain '#Team' after clicking Teams");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void streamTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickOrganizationTab();
		Assert.assertTrue(homePage.clickStreamTab(), "Stream tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Stream"), "URL does not contain '#Stream' after clicking Stream");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void globalStreamTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickOrganizationTab();
		Assert.assertTrue(homePage.clickGlobalStreamTab(), "Global Stream tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#GlobalStream"),
				"URL does not contain '#GlobalStream' after clicking Global Stream");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void workingTimeCalendarsTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickOrganizationTab();
		Assert.assertTrue(homePage.clickWorkingTimeCalendarsTab(), "Working Time Calendars tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#WorkingTimeCalendar"), "URL does not contain '#WorkingTimeCalendar'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void productsTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickProductsTab(), "Products tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Product"), "URL does not contain '#Product'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void quotesTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickQuotesTab(), "Quotes tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Quote"), "URL does not contain '#Quote'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void salesOrdersTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickSalesOrdersTab(), "Sales Orders tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#SalesOrder"), "URL does not contain '#SalesOrder'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void purchaseOrdersTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickPurchaseOrdersTab(), "Purchase Orders tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#PurchaseOrder"), "URL does not contain '#PurchaseOrder'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void deliveryOrdersTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickDeliveryOrdersTab(), "Delivery Orders tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#DeliveryOrder"), "URL does not contain '#DeliveryOrder'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void returnOrdersTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickReturnOrdersTab(), "Return Orders tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#ReturnOrder"), "URL does not contain '#ReturnOrder'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void inventoryAdjustmentsTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickInventoryAdjustmentsTab(), "Inventory Adjustments tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#InventoryAdjustment"), "URL does not contain '#InventoryAdjustment'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void warehousesTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickWarehousesTab(), "Warehouses tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Warehouse"), "URL does not contain '#Warehouse'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void inventoryNumbersTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickInventoryNumbersTab(), "Inventory Numbers tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#InventoryNumber"), "URL does not contain '#InventoryNumber'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void inventoryTransactionsTabIsClickable() {
		homePage.moreMenuClickable();
		homePage.clickSalesAndPurchaseTab();
		Assert.assertTrue(homePage.clickInventoryTransactionsTab(), "Inventory Transactions tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#InventoryTransaction"),
				"URL does not contain '#InventoryTransaction'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void reportsTabIsClickable() {
		homePage.moreMenuClickable();
		Assert.assertTrue(homePage.clickReportsTab(), "Reports tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Report"), "URL does not contain '#Report'");
	}

	@Test(groups = { "Menu", "Smoke", "Regression" })
	public void projectsTabIsClickable() {
		homePage.moreMenuClickable();
		Assert.assertTrue(homePage.clickProjectsTab(), "Projects tab is not clickable");
		Assert.assertTrue(getPageURl().contains("#Project"), "URL does not contain '#Project'");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void quickCreateDropdownIsClickable() {
		Assert.assertTrue(homePage.clickQuickCreateDropdown(), "Quick Create dropdown is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void quickCreateAccountIsClickable() {
		Assert.assertTrue(homePage.clickQuickCreateAccount(), "Quick Create > Account is not clickable");
		Assert.assertTrue(getPageURl().contains("#Account/create"), "URL does not contain '#Account/create'");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void quickCreateLeadIsClickable() {
		Assert.assertTrue(homePage.clickQuickCreateLead(), "Quick Create > Lead is not clickable");
		Assert.assertTrue(getPageURl().contains("#Lead/create"), "URL does not contain '#Lead/create'");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void notificationsIconIsClickable() {
		Assert.assertTrue(homePage.clickNotificationsIcon(), "Notifications icon is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void userMenuDropdownIsClickable() {
		Assert.assertTrue(homePage.clickUserMenuDropdown(), "User menu dropdown is not clickable");
		// No URL change, toggle action
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void adminLinkIsClickable() {
		Assert.assertTrue(homePage.clickAdminLink(), "Admin link is not clickable");
		Assert.assertTrue(getPageURl().contains("#Admin"), "URL does not contain '#Admin' after clicking Admin");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void preferencesLinkIsClickable() {
		Assert.assertTrue(homePage.clickPreferencesLink(), "Preferences link is not clickable");
		Assert.assertTrue(getPageURl().contains("#Preference"),
				"URL does not contain '#Preference' after clicking Preferences");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void logoutLinkIsClickable() {
		Assert.assertTrue(homePage.clickLogoutLink(), "Logout link is not clickable");
		Assert.assertEquals(getPageURl(), "https://demo.us.espocrm.com/", "URL mismatch after clicking Logout");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void aboutLinkIsClickable() {
		Assert.assertTrue(homePage.clickAboutLink(), "About link is not clickable");
		// No URL change, typically a modal opens
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void dropdownButtonIsClickable() {
		Assert.assertTrue(homePage.clickDropdownButton(), "Dashboard dropdown button is not clickable");
		// No URL change expected
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void editDashboardItemIsClickable() {
		Assert.assertTrue(homePage.clickEditDashboardItem(), "Edit Dashboard option is not clickable");
		// No URL change expected
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void addDashletItemIsClickable() {
		Assert.assertTrue(homePage.clickAddDashletItem(), "Add Dashlet option is not clickable");
		// No URL change expected
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void myHomepageTabIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickMyHomepageTab(), "My Homepage tab is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void mySalesTabIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickMySalesTab(), "My Sales tab is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void salesAnalyticsTabIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickSalesAnalyticsTab(), "Sales Analytics tab is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void callCenterDataTabIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickCallCenterDataTab(), "Call Center Data tab is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void salesManagerTabIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickSalesManagerTab(), "Sales Manager tab is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void activeTabIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickActiveTab(), "Active tab is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void globalSearchInputIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickGlobalSearchInput(), "Global search input is not clickable");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void globalSearchButtonIsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickGlobalSearchButton(), "Global search button is not clickable");

	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void quickCreateDropdown1IsClickable() {
		homePage.clickHomeTab();
		Assert.assertTrue(homePage.clickQuickCreateDropdown(), "Quick Create dropdown 1 is not clickable");

	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createAccountIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateAccount(), "Create Account is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createContactIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateContact(), "Create Contact is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createLeadIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateLead(), "Create Lead is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createOpportunityIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateOpportunity(), "Create Opportunity is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createMeetingIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateMeeting(), "Create Meeting is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createCallIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateCall(), "Create Call is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createTaskIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateTask(), "Create Task is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createCaseIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateCase(), "Create Case is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createEmailIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateEmail(), "Create Email is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "NewCreate", "Smoke", "Regression" })
	public void createProjectTaskIsClickable() {
		homePage.clickHomeTab();
		homePage.clickQuickCreateDropdown();
		Assert.assertTrue(homePage.clickCreateProjectTask(), "Create Project Task is not clickable");
		homePage.clickQuickCreateClose();
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void notificationsButtonIsClickable() {
		Assert.assertTrue(homePage.clickNotificationsButton(), "Notifications button is not clickable");
		// No URL change expected
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void menuDropdownIsClickable() {
		Assert.assertTrue(homePage.clickMenuDropdown(), "Menu dropdown is not clickable");
		// No URL change expected
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void userProfileIsClickable() {
		Assert.assertTrue(homePage.clickUserProfile(), "User profile is not clickable");
		// No URL change expected
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void logoutOptionIsClickable() {
		Assert.assertTrue(homePage.clickLogoutOption(), "Logout option is not clickable");
		Assert.assertEquals(getPageURl(), "https://demo.us.espocrm.com/", "URL mismatch after logout");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void adminOptionIsClickable() {
		Assert.assertTrue(homePage.clickAdminOption(), "Admin option is not clickable");
		Assert.assertTrue(getPageURl().contains("#Admin"), "URL mismatch after Admin click");
	}

	@Test(groups = { "HomePageHeader", "Smoke", "Regression" })
	public void preferencesOptionIsClickable() {
		Assert.assertTrue(homePage.clickPreferencesOption(), "Preferences option is not clickable");
		Assert.assertTrue(getPageURl().contains("#Preference"), "URL mismatch after Preferences click");
	}

}
