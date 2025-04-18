package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyProject.demo.us.espocrm.com.BaseClass;

public class MainPageLocators extends BaseClass {

	MainPageLocators(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	// ===== Top Menu Tabs =====
	By homeTab = By.cssSelector("li[data-name='Home'] > a.nav-link");
	By accountsTab = By.cssSelector("li[data-name='Account'] > a.nav-link");
	By contactsTab = By.cssSelector("li[data-name='Contact'] > a.nav-link");
	By leadsTab = By.cssSelector("li[data-name='Lead'] > a.nav-link");
	By opportunitiesTab = By.cssSelector("li[data-name='Opportunity'] > a.nav-link");

	// ===== Activities =====
	By emailsTab = By.cssSelector("li[data-name='Email'] > a.nav-link");
	By calendarTab = By.cssSelector("li[data-name='Calendar'] > a.nav-link");
	By callsTab = By.cssSelector("li[data-name='Call'] > a.nav-link");
	By tasksTab = By.cssSelector("li[data-name='Task'] > a.nav-link");
	By meetingsTab = By.cssSelector("li[data-name='Meeting'] > a.nav-link");

	// ===== Support =====
	By casesTab = By.cssSelector("li[data-name='Case'] > a.nav-link");
	By knowledgeBaseTab = By.cssSelector("li[data-name='KnowledgeBaseArticle'] > a.nav-link");

	// ===== More Dropdown =====
	By moreDropdown = By.cssSelector("li.dropdown.more > a");

	// Marketing
	By campaignsTab = By.cssSelector("li[data-name='Campaign'] > a.nav-link");
	By targetListsTab = By.cssSelector("li[data-name='TargetList'] > a.nav-link");

	// Business
	By documentsTab = By.cssSelector("li[data-name='Document'] > a.nav-link");

	// Organization Group
	By organizationGroup = By.id("nav-tab-group-group-22");
	By usersTab = By.cssSelector("li[data-name='User'] > a.nav-link");
	By teamsTab = By.cssSelector("li[data-name='Team'] > a.nav-link");
	By streamTab = By.cssSelector("li[data-name='Stream'] > a.nav-link");
	By globalStreamTab = By.cssSelector("li[data-name='GlobalStream'] > a.nav-link");
	By workingTimeCalendarsTab = By.cssSelector("li[data-name='WorkingTimeCalendar'] > a.nav-link");

	// Sales & Purchase Group
	By salesPurchaseGroup = By.id("nav-tab-group-group-23");
	By productsTab = By.cssSelector("li[data-name='Product'] > a.nav-link");
	By quotesTab = By.cssSelector("li[data-name='Quote'] > a.nav-link");
	By salesOrdersTab = By.cssSelector("li[data-name='SalesOrder'] > a.nav-link");
	By purchaseOrdersTab = By.cssSelector("li[data-name='PurchaseOrder'] > a.nav-link");
	By deliveryOrdersTab = By.cssSelector("li[data-name='DeliveryOrder'] > a.nav-link");
	By returnOrdersTab = By.cssSelector("li[data-name='ReturnOrder'] > a.nav-link");
	By inventoryAdjustmentsTab = By.cssSelector("li[data-name='InventoryAdjustment'] > a.nav-link");
	By warehousesTab = By.cssSelector("li[data-name='Warehouse'] > a.nav-link");
	By inventoryNumbersTab = By.cssSelector("li[data-name='InventoryNumber'] > a.nav-link");
	By inventoryTransactionsTab = By.cssSelector("li[data-name='InventoryTransaction'] > a.nav-link");

	// ===== Analytics =====
	By reportsTab = By.cssSelector("li[data-name='Report'] > a.nav-link");

	// ===== Projects =====
	By projectsTab = By.cssSelector("li[data-name='Project'] > a.nav-link");
	By projectTasksTab = By.cssSelector("li[data-name='ProjectTask'] > a.nav-link");

	// ===== Top Right Elements =====
	By searchInput = By.cssSelector("input.global-search-input");
	By searchButton = By.cssSelector("a.global-search-button");

	// ===== Quick Create =====
	By quickCreateDropdown = By.id("nav-quick-create-dropdown");
	By quickCreateAccount = By.cssSelector("a[data-action='quickCreate'][data-name='Account']");
	By quickCreateLead = By.cssSelector("a[data-action='quickCreate'][data-name='Lead']");

	// ===== Notifications =====
	By notificationsIcon = By.cssSelector("a.notifications-button");

	// ===== User Menu =====
	By userMenuDropdown = By.id("nav-menu-dropdown");
	By adminLink = By.cssSelector("a[data-name='admin']");
	By preferencesLink = By.cssSelector("a[data-name='preferences']");
	By logoutLink = By.cssSelector("a[data-name='logout']");
	By aboutLink = By.cssSelector("a[data-name='about']");

	// Locator for the dropdown button (ellipsis icon)
	By dropdownButton = By.cssSelector("button.btn.btn-text.btn-icon.dropdown-toggle");

	// Locators for the dropdown menu items
	By editDashboardItem = By.xpath("//a[@data-action='editTabs']/span[text()='Edit Dashboard']");
	By addDashletItem = By.xpath("//a[@data-action='addDashlet']/span[text()='Add Dashlet']");

	// Locators for the tab buttons
	By myHomepageTab = By.cssSelector("button[data-tab='0']");
	By mySalesTab = By.cssSelector("button[data-tab='1']");
	By salesAnalyticsTab = By.cssSelector("button[data-tab='2']");
	By callCenterDataTab = By.cssSelector("button[data-tab='3']");
	By salesManagerTab = By.cssSelector("button[data-tab='4']");

	// Locator for the active tab button
	By activeTab = By.cssSelector("button.btn.btn-text.active");

	// Locator for the global search input field
	By globalSearchInput = By.cssSelector("input.form-control.global-search-input");

	// Locator for the global search button (search icon)
	By globalSearchButton = By.cssSelector("a.btn.btn-link.global-search-button");

	// Locator for the quick create dropdown
	By quickCreateDropdown1 = By.id("nav-quick-create-dropdown");

	// Locator for the "Create" menu options under the quick create dropdown
	By createAccount = By.xpath("//a[@data-name='Account' and @data-action='quickCreate']");
	By createContact = By.xpath("//a[@data-name='Contact' and @data-action='quickCreate']");
	By createLead = By.xpath("//a[@data-name='Lead' and @data-action='quickCreate']");
	By createOpportunity = By.xpath("//a[@data-name='Opportunity' and @data-action='quickCreate']");
	By createMeeting = By.xpath("//a[@data-name='Meeting' and @data-action='quickCreate']");
	By createCall = By.xpath("//a[@data-name='Call' and @data-action='quickCreate']");
	By createTask = By.xpath("//a[@data-name='Task' and @data-action='quickCreate']");
	By createCase = By.xpath("//a[@data-name='Case' and @data-action='quickCreate']");
	By createEmail = By.xpath("//a[@data-name='Email' and @data-action='quickCreate']");
	By createProjectTask = By.xpath("//a[@data-name='ProjectTask' and @data-action='quickCreate']");

	// Locator for the notifications icon
	By notificationsButton = By.cssSelector("a.notifications-button[data-action='showNotifications']");

	// Locator for the menu dropdown
	By menuDropdown = By.id("nav-menu-dropdown");

	// Locator for the user profile in the menu
	By userProfile = By.xpath("//a[@class='nav-link']/img[@class='avatar avatar-link']");

	// Locator for the logout option in the menu
	By logoutOption = By.xpath("//a[@data-name='logout' and @class='nav-link action']");

	// Locator for the "Administration" link in the menu
	By adminOption = By.xpath("//a[@data-name='admin' and @class='nav-link']");

	// Locator for the "Preferences" link in the menu
	By preferencesOption = By.xpath("//a[@data-name='preferences' and @class='nav-link']");

	// ===== Click methods for Top Menu Tabs =====
	public boolean clickHomeTab() {
		driver.findElement(homeTab).click();
		return true;
	}

	public boolean clickAccountsTab() {
		driver.findElement(accountsTab).click();
		return true;
	}

	public boolean clickContactsTab() {
		driver.findElement(contactsTab).click();
		return true;
	}

	public boolean clickLeadsTab() {
		driver.findElement(leadsTab).click();
		return true;
	}

	public boolean clickOpportunitiesTab() {
		driver.findElement(opportunitiesTab).click();
		return true;
	}

	// ===== Click methods for Activities Tabs =====
	public boolean clickEmailsTab() {
		driver.findElement(emailsTab).click();
		return true;
	}

	public boolean clickCalendarTab() {
		driver.findElement(calendarTab).click();
		return true;
	}

	public boolean clickCallsTab() {
		driver.findElement(callsTab).click();
		return true;
	}

	public boolean clickTasksTab() {
		driver.findElement(tasksTab).click();
		return true;
	}

	public boolean clickMeetingsTab() {
		driver.findElement(meetingsTab).click();
		return true;
	}

	// ===== Support Tabs =====
	public boolean clickCasesTab() {
		driver.findElement(casesTab).click();
		return true;
	}

	public boolean clickKnowledgeBaseTab() {
		driver.findElement(knowledgeBaseTab).click();
		return true;
	}

	// ===== More Dropdown =====
	public boolean clickMoreDropdown() {
		driver.findElement(moreDropdown).click();
		return true;
	}

	// ===== Marketing Tabs =====
	public boolean clickCampaignsTab() {
		driver.findElement(campaignsTab).click();
		return true;
	}

	public boolean clickTargetListsTab() {
		driver.findElement(targetListsTab).click();
		return true;
	}

	// ===== Business Tabs =====
	public boolean clickDocumentsTab() {
		driver.findElement(documentsTab).click();
		return true;
	}

	// ===== Organization Group Tabs =====
	public boolean clickUsersTab() {
		driver.findElement(usersTab).click();
		return true;
	}

	public boolean clickTeamsTab() {
		driver.findElement(teamsTab).click();
		return true;
	}

	public boolean clickStreamTab() {
		driver.findElement(streamTab).click();
		return true;
	}

	public boolean clickGlobalStreamTab() {
		driver.findElement(globalStreamTab).click();
		return true;
	}

	public boolean clickWorkingTimeCalendarsTab() {
		driver.findElement(workingTimeCalendarsTab).click();
		return true;
	}

	// ===== Sales & Purchase Group Tabs =====
	public boolean clickProductsTab() {
		driver.findElement(productsTab).click();
		return true;
	}

	public boolean clickQuotesTab() {
		driver.findElement(quotesTab).click();
		return true;
	}

	public boolean clickSalesOrdersTab() {
		driver.findElement(salesOrdersTab).click();
		return true;
	}

	public boolean clickPurchaseOrdersTab() {
		driver.findElement(purchaseOrdersTab).click();
		return true;
	}

	public boolean clickDeliveryOrdersTab() {
		driver.findElement(deliveryOrdersTab).click();
		return true;
	}

	public boolean clickReturnOrdersTab() {
		driver.findElement(returnOrdersTab).click();
		return true;
	}

	public boolean clickInventoryAdjustmentsTab() {
		driver.findElement(inventoryAdjustmentsTab).click();
		return true;
	}

	public boolean clickWarehousesTab() {
		driver.findElement(warehousesTab).click();
		return true;
	}

	public boolean clickInventoryNumbersTab() {
		driver.findElement(inventoryNumbersTab).click();
		return true;
	}

	public boolean clickInventoryTransactionsTab() {
		driver.findElement(inventoryTransactionsTab).click();
		return true;
	}

	// ===== Analytics Tabs =====
	public boolean clickReportsTab() {
		driver.findElement(reportsTab).click();
		return true;
	}

	// ===== Project Tabs =====
	public boolean clickProjectsTab() {
		driver.findElement(projectsTab).click();
		return true;
	}

	public boolean clickProjectTasksTab() {
		driver.findElement(projectTasksTab).click();
		return true;
	}

	// ===== Quick Create =====
	public boolean clickQuickCreateDropdown() {
		driver.findElement(quickCreateDropdown).click();
		return true;
	}

	public boolean clickQuickCreateAccount() {
		driver.findElement(quickCreateAccount).click();
		return true;
	}

	public boolean clickQuickCreateLead() {
		driver.findElement(quickCreateLead).click();
		return true;
	}

	// ===== Notifications & Menu =====
	public boolean clickNotificationsIcon() {
		driver.findElement(notificationsIcon).click();
		return true;
	}

	public boolean clickUserMenuDropdown() {
		driver.findElement(userMenuDropdown).click();
		return true;
	}

	public boolean clickAdminLink() {
		driver.findElement(adminLink).click();
		return true;
	}

	public boolean clickPreferencesLink() {
		driver.findElement(preferencesLink).click();
		return true;
	}

	public boolean clickLogoutLink() {
		driver.findElement(logoutLink).click();
		return true;
	}

	public boolean clickAboutLink() {
		driver.findElement(aboutLink).click();
		return true;
	}

	// Click methods for interacting with the dropdown button and its items
	public boolean clickDropdownButton() {
		driver.findElement(dropdownButton).click();
		return true;
	}

	public boolean clickEditDashboardItem() {
		driver.findElement(editDashboardItem).click();
		return true;
	}

	public boolean clickAddDashletItem() {
		driver.findElement(addDashletItem).click();
		return true;
	}

	// Click methods for interacting with the tab buttons
	public boolean clickMyHomepageTab() {
		driver.findElement(myHomepageTab).click();
		return true;
	}

	public boolean clickMySalesTab() {
		driver.findElement(mySalesTab).click();
		return true;
	}

	public boolean clickSalesAnalyticsTab() {
		driver.findElement(salesAnalyticsTab).click();
		return true;
	}

	public boolean clickCallCenterDataTab() {
		driver.findElement(callCenterDataTab).click();
		return true;
	}

	public boolean clickSalesManagerTab() {
		driver.findElement(salesManagerTab).click();
		return true;
	}

	// Click method for the active tab button
	public boolean clickActiveTab() {
		driver.findElement(activeTab).click();
		return true;
	}

	// Click method for the global search input field
	public boolean clickGlobalSearchInput() {
		driver.findElement(globalSearchInput).click();
		return true;
	}

	// Click method for the global search button
	public boolean clickGlobalSearchButton() {
		driver.findElement(globalSearchButton).click();
		return true;
	}

	// Click method for the quick create dropdown
	public boolean clickQuickCreateDropdown1() {
		driver.findElement(quickCreateDropdown1).click();
		return true;
	}

	// Click methods for the "Create" menu options under the quick create dropdown
	public boolean clickCreateAccount() {
		driver.findElement(createAccount).click();
		return true;
	}

	public boolean clickCreateContact() {
		driver.findElement(createContact).click();
		return true;
	}

	public boolean clickCreateLead() {
		driver.findElement(createLead).click();
		return true;
	}

	public boolean clickCreateOpportunity() {
		driver.findElement(createOpportunity).click();
		return true;
	}

	public boolean clickCreateMeeting() {
		driver.findElement(createMeeting).click();
		return true;
	}

	public boolean clickCreateCall() {
		driver.findElement(createCall).click();
		return true;
	}

	public boolean clickCreateTask() {
		driver.findElement(createTask).click();
		return true;
	}

	public boolean clickCreateCase() {
		driver.findElement(createCase).click();
		return true;
	}

	public boolean clickCreateEmail() {
		driver.findElement(createEmail).click();
		return true;
	}

	public boolean clickCreateProjectTask() {
		driver.findElement(createProjectTask).click();
		return true;
	}

	// Click method for the notifications icon
	public boolean clickNotificationsButton() {
		driver.findElement(notificationsButton).click();
		return true;
	}

	// Click method for the menu dropdown
	public boolean clickMenuDropdown() {
		driver.findElement(menuDropdown).click();
		return true;
	}

	// Click method for the user profile in the menu
	public boolean clickUserProfile() {
		driver.findElement(userProfile).click();
		return true;
	}

	// Click method for the logout option in the menu
	public boolean clickLogoutOption() {
		driver.findElement(logoutOption).click();
		return true;
	}

	// Click method for the "Administration" link in the menu
	public boolean clickAdminOption() {
		driver.findElement(adminOption).click();
		return true;
	}

	// Click method for the "Preferences" link in the menu
	public boolean clickPreferencesOption() {
		driver.findElement(preferencesOption).click();
		return true;
	}

}
