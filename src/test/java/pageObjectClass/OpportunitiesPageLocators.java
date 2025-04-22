package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import MyProject.demo.us.espocrm.com.BaseClass;

public class OpportunitiesPageLocators extends BaseClass {

	public OpportunitiesPageLocators(RemoteWebDriver driver) {
		BaseClass.driver = driver; // Clean and no reliance on static BaseClass
	}

	// **Search and Filter Locators**
	By searchInput = By.cssSelector("input.text-filter");
	By filterDropdownButton = By.cssSelector(".filters-button");
	By allFilterOption = By.xpath("//a[@class='preset' and .//div[text()='All']]");
	By openFilterOption = By.xpath("//a[@class='preset' and @data-name='open']");
	By wonFilterOption = By.xpath("//a[@class='preset' and @data-name='won']");
	By onlyMyCheckbox = By.cssSelector("input[data-name='onlyMy']");
	By followedCheckbox = By.cssSelector("input[data-name='followed']");
	By searchButton = By.cssSelector("button[data-action='search']");
	By resetButton = By.cssSelector("button[data-action='reset']");
	By addFilterButton = By.cssSelector("button.add-filter-button");
	By fieldSearchInput = By.cssSelector("input.field-filter-quick-search-input");
	By assignedUserFilterOption = By.xpath("//li[@data-name='assignedUser']//a[@data-action='addFilter']");
	By teamsFilterOption = By.xpath("//li[@data-name='teams']//a[@data-action='addFilter']");
	By closeDateFilterOption = By.xpath("//li[@data-name='closeDate']//a[@data-action='addFilter']");
	By listViewButton = By.cssSelector("button[data-name='list']");
	By kanbanViewButton = By.cssSelector("button[data-name='kanban']");

	// **Actions Dropdown Locators**
	By actionsButton = By.cssSelector(".actions-button");
	By actionsMenu = By.cssSelector(".actions-menu");
	By removeAction = By.cssSelector("a[data-action='remove']");
	By mergeAction = By.cssSelector("a[data-action='merge']");
	By massUpdateAction = By.cssSelector("a[data-action='massUpdate']");
	By exportAction = By.cssSelector("a[data-action='export']");
	By followAction = By.cssSelector("a[data-action='follow']");
	By unfollowAction = By.cssSelector("a[data-action='unfollow']");
	By convertCurrencyAction = By.cssSelector("a[data-action='convertCurrency']");

	// **Pagination Controls Locators**
	By paginationDropdown = By.cssSelector(".pagination-btn-middle");
	By firstPageButton = By.cssSelector("a[data-page='first']");
	By lastPageButton = By.cssSelector("a[data-page='last']");
	By previousPageButton = By.cssSelector("a[data-page='previous']");
	By nextPageButton = By.cssSelector("a[data-page='next']");
	By pageInput = By.cssSelector(".page-input");

	// **Settings Dropdown Locators**
	By settingsDropdown = By.cssSelector(".settings-container .dropdown-toggle");
	By accountColumnToggle = By.cssSelector("a[data-name='account']");
	By stageColumnToggle = By.cssSelector("a[data-name='stage']");
	By assignedUserColumnToggle = By.cssSelector("a[data-name='assignedUser']");
	By closeDateColumnToggle = By.cssSelector("a[data-name='closeDate']");
	By amountColumnToggle = By.cssSelector("a[data-name='amount']");
	By columnResizeToggle = By.cssSelector("a[data-action='toggleColumnResize']");

	// **Page Header Locators**
	By headerTitle = By.cssSelector(".header-title");
	By breadcrumbItem = By.cssSelector(".breadcrumb-item");
	By createOpportunityButton = By.cssSelector("a[data-action='create']");
	By breadcrumbOpportunities = By.cssSelector(".breadcrumb-item a[data-action='navigateToRoot']");
	By breadcrumbCreate = By.xpath("//div[@class='breadcrumb-item']/span[text()='create']");

	// Form Buttons
	By saveButton = By.cssSelector("button[data-action='save']");
	By cancelButton = By.cssSelector("button[data-action='cancel']");
	By saveAndContinueEditing = By.cssSelector("a[data-action='saveAndContinueEditing']");
	By saveAndNew = By.cssSelector("a[data-action='saveAndNew']");

	// Opportunity Form Fields
	By nameInput = By.cssSelector("input[data-name='name']");
	By accountNameInput = By.cssSelector("input[data-name='accountName']");
	By accountSelectButton = By.cssSelector("button[data-action='selectLink']");
	By accountClearButton = By.cssSelector("button[data-action='clearLink']");

	By stageDropdown = By.cssSelector("select[data-name='stage']");
	By amountInput = By.cssSelector("input[data-name='amount']");
	By amountCurrencyDropdown = By.cssSelector("select[data-name='amountCurrency']");

	By probabilityInput = By.cssSelector("input[data-name='probability']");
	By closeDateInput = By.cssSelector("input[data-name='closeDate']");
	By closeDatePickerButton = By.cssSelector("button.date-picker-btn");

	By contactsInput = By.xpath("//div[@data-name='contacts']//input[@placeholder='Select']");
	By leadSourceDropdown = By.cssSelector("select[data-name='leadSource']");
	By descriptionTextarea = By.cssSelector("textarea[data-name='description']");

	// Items Section
	By addItemButton = By.cssSelector("button[data-action='addItem']");
	By addProductsMenuItem = By.cssSelector("a[data-action='addProducts']");
	By itemsCurrencyDropdown = By.cssSelector("select[data-name='currency']");

	// Sidebar Fields
	By assignedUserInput = By.cssSelector("input[data-name='assignedUserName']");
	By assignedUserSelectButton = By.xpath("//div[@data-name='assignedUser']//button[@data-action='selectLink']");
	By assignedUserClearButton = By.xpath("//div[@data-name='assignedUser']//button[@data-action='clearLink']");

	By teamsInput = By.xpath("//div[@data-name='teams']//input[@placeholder='Select']");
	By teamsSelectButton = By.xpath("//div[@data-name='teams']//button[@data-action='selectLink']");

	// Get the header title text
	public String getHeaderTitleText() {
		WebElement header = driver.findElement(headerTitle);
		return header.getText();
	}

	// Get the breadcrumb item text
	public String getBreadcrumbItemText() {
		WebElement breadcrumb = driver.findElement(breadcrumbItem);
		return breadcrumb.getText();
	}

	// Click the "Create Opportunity" button
	public boolean clickCreateOpportunityButton() {
		driver.findElement(createOpportunityButton).click();
		return true;
	}

	// Click the "Opportunities" breadcrumb link
	public boolean clickBreadcrumbOpportunities() {
		driver.findElement(breadcrumbOpportunities).click();
		return true;
	}

	// Check if "Create" breadcrumb is displayed
	public boolean isBreadcrumbCreateDisplayed() {
		return driver.findElement(breadcrumbCreate).isDisplayed();
	}

	// Enter Opportunity Name
	public String enterOpportunityName(String name) {
		WebElement nameField = driver.findElement(nameInput);
		nameField.sendKeys(name);
		return nameField.getAttribute("value");
	}

	// Enter Account Name
	public String enterAccountName(String account) {
		WebElement accountField = driver.findElement(accountNameInput);
		accountField.sendKeys(account);
		return accountField.getAttribute("value");
	}

	// Click the "Select" button for Account
	public boolean clickAccountSelectButton() {
		driver.findElement(accountSelectButton).click();
		return true;
	}

	// Click the "Clear" button for Account
	public boolean clickAccountClearButton() {
		driver.findElement(accountClearButton).click();
		return true;
	}

	// Select Stage from Dropdown
	public String selectStage(String stageName) {
		Select stageDropdownElement = new Select(driver.findElement(stageDropdown));
		stageDropdownElement.selectByVisibleText(stageName);
		return stageDropdownElement.getFirstSelectedOption().getText();
	}

	// Enter Amount
	public String enterAmount(String amount) {
		WebElement amountField = driver.findElement(amountInput);
		amountField.sendKeys(amount);
		return amountField.getAttribute("value");
	}

	// Select Amount Currency
	public String selectAmountCurrency(String currency) {
		Select currencyDropdown = new Select(driver.findElement(amountCurrencyDropdown));
		currencyDropdown.selectByVisibleText(currency);
		return currencyDropdown.getFirstSelectedOption().getText();
	}

	// Enter Probability
	public String enterProbability(String probability) {
		WebElement probabilityField = driver.findElement(probabilityInput);
		probabilityField.clear();
		probabilityField.sendKeys(probability);
		return probabilityField.getAttribute("value");
	}

	// Enter Close Date
	public String enterCloseDate(String closeDate) {
		WebElement closeDateField = driver.findElement(closeDateInput);
		closeDateField.sendKeys(closeDate);
		return closeDateField.getAttribute("value");
	}

	// Click Close Date Picker Icon
	public boolean clickCloseDatePicker() {
		driver.findElement(closeDatePickerButton).click();
		return true;
	}

	// Enter Contacts
	public String enterContacts(String contactName) {
		WebElement contactsField = driver.findElement(contactsInput);
		contactsField.sendKeys(contactName);
		return contactsField.getAttribute("value");
	}

	// Select Lead Source
	public String selectLeadSource(String leadSource) {
		Select leadSourceDropdownElement = new Select(driver.findElement(leadSourceDropdown));
		leadSourceDropdownElement.selectByVisibleText(leadSource);
		return leadSourceDropdownElement.getFirstSelectedOption().getText();
	}

	// Enter Description
	public String enterDescription(String description) {
		WebElement descriptionField = driver.findElement(descriptionTextarea);
		descriptionField.sendKeys(description);
		return descriptionField.getAttribute("value");
	}

	// Click "Add Item" Button
	public boolean clickAddItemButton() {
		driver.findElement(addItemButton).click();
		return true;
	}

	// Click "Add Products" Menu Item
	public boolean clickAddProductsMenuItem() {
		driver.findElement(addProductsMenuItem).click();
		return true;
	}

	// Select Items Currency
	public String selectItemsCurrency(String currency) {
		Select itemsCurrencyDropdownElement = new Select(driver.findElement(itemsCurrencyDropdown));
		itemsCurrencyDropdownElement.selectByVisibleText(currency);
		return itemsCurrencyDropdownElement.getFirstSelectedOption().getText();
	}

	// Enter Assigned User Name
	public String enterAssignedUserName(String userName) {
		WebElement userField = driver.findElement(assignedUserInput);
		userField.sendKeys(userName);
		return userField.getAttribute("value");
	}

	// Click Assigned User Select Button
	public boolean clickAssignedUserSelectButton() {
		driver.findElement(assignedUserSelectButton).click();
		return true;
	}

	// Click Assigned User Clear Button
	public boolean clickAssignedUserClearButton() {
		driver.findElement(assignedUserClearButton).click();
		return true;
	}

	// Enter Teams Input
	public String enterTeamName(String teamName) {
		WebElement teamField = driver.findElement(teamsInput);
		teamField.sendKeys(teamName);
		return teamField.getAttribute("value");
	}

	// Click Teams Select Button
	public boolean clickTeamsSelectButton() {
		driver.findElement(teamsSelectButton).click();
		return true;
	}

	// Click Save Button
	public boolean clickSaveButton() {
		driver.findElement(saveButton).click();
		return true;
	}

	// Click Cancel Button
	public boolean clickCancelButton() {
		driver.findElement(cancelButton).click();
		return true;
	}

	// Click Save & Continue Editing
	public boolean clickSaveAndContinueEditing() {
		driver.findElement(saveAndContinueEditing).click();
		return true;
	}

	// Click Save & New
	public boolean clickSaveAndNew() {
		driver.findElement(saveAndNew).click();
		return true;
	}

}
