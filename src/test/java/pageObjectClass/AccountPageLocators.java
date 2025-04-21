package pageObjectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import MyProject.demo.us.espocrm.com.BaseClass;

public class AccountPageLocators extends BaseClass {

	public AccountPageLocators(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	// Account tab menu
	By accountsTab = By.cssSelector("li[data-name='Account'] > a.nav-link");

	// Header title
	By AccountheaderTitle = By.cssSelector("h3.header-title");

	// Search Filters
	By filterDropdownButton = By.cssSelector(".filters-button.dropdown-toggle");
	By searchInput = By.cssSelector("input.text-filter[data-name='textFilter']");
	By searchButton = By.cssSelector("button[data-action='search']");
	By resetButton = By.cssSelector("button[data-action='reset']");

	// Filter Options
	By filterDropdown = By.xpath("(//span[@class='caret'])[1]");
	By filterOptionAll = By.cssSelector("a.preset[data-name='']");
	By filterOptionStarred = By.cssSelector("a.preset[data-name='starred']");
	By filterOptionRecentlyCreated = By.cssSelector("a.preset[data-name='recentlyCreated']");

	// Checkboxes
	By checkboxOnlyMy = By.cssSelector("input[data-name='onlyMy']");
	By checkboxFollowed = By.cssSelector("input[data-name='followed']");

	// Add Filter Dropdown (right side 3 dots)
	By addFilterDropdown = By.cssSelector("button.add-filter-button.dropdown-toggle");

	// Filter Options inside Add Filter Menu
	By filterAssignedUser = By.cssSelector("li[data-name='assignedUser'] a.add-filter");
	By filterTeams = By.cssSelector("li[data-name='teams'] a.add-filter");
	By filterCreatedAt = By.cssSelector("li[data-name='createdAt'] a.add-filter");
	By filterCreatedBy = By.cssSelector("li[data-name='createdBy'] a.add-filter");
	By filterModifiedAt = By.cssSelector("li[data-name='modifiedAt'] a.add-filter");
	By filterType = By.cssSelector("li[data-name='type'] a.add-filter");
	By filterIndustry = By.cssSelector("li[data-name='industry'] a.add-filter");
	By filterDescription = By.cssSelector("li[data-name='description'] a.add-filter");
	By filterEmail = By.cssSelector("li[data-name='emailAddress'] a.add-filter");
	By filterPhone = By.cssSelector("li[data-name='phoneNumber'] a.add-filter");
	By filterTargetLists = By.cssSelector("li[data-name='targetLists'] a.add-filter");
	By filterCountry = By.cssSelector("li[data-name='billingAddressCountry'] a.add-filter");
	By filterBillingAddress = By.cssSelector("li[data-name='billingAddress'] a.add-filter");
	By filterShippingAddress = By.cssSelector("li[data-name='shippingAddress'] a.add-filter");
	By filterWebsite = By.cssSelector("li[data-name='website'] a.add-filter");

	// Create New Account
	By createAccountButton = By.linkText("Create Account");

	// --- Actions Button & Dropdown Items ---
	By actionsDropdownButton = By.cssSelector("button.actions-button.dropdown-toggle");
	By actionRemove = By.cssSelector("a.mass-action[data-action='remove']");
	By actionMerge = By.cssSelector("a.mass-action[data-action='merge']");
	By actionMassUpdate = By.cssSelector("a.mass-action[data-action='massUpdate']");
	By actionExport = By.cssSelector("a.mass-action[data-action='export']");
	By actionFollow = By.cssSelector("a.mass-action[data-action='follow']");
	By actionUnfollow = By.cssSelector("a.mass-action[data-action='unfollow']");
	By actionRecalculateFormula = By.cssSelector("a.mass-action[data-action='recalculateFormula']");

	// --- Pagination ---
	By paginationStatus = By.cssSelector("a.pagination-btn-middle");
	By paginationFirstPage = By.cssSelector("a[data-page='first']");
	By paginationLastPage = By.cssSelector("a[data-page='last']");
	By paginationPrevious = By.cssSelector("a[data-page='previous']");
	By paginationNext = By.cssSelector("a[data-page='next']");

	// --- Settings Dropdown ---
	By settingsDropdownToggle = By.cssSelector(".settings-container.pull-right");

	// Column Toggles in Settings
	By toggleIndustryColumn = By.cssSelector("a[data-action='toggleColumn'][data-name='industry']");
	By toggleTypeColumn = By.cssSelector("a[data-action='toggleColumn'][data-name='type']");
	By toggleCountryColumn = By.cssSelector("a[data-action='toggleColumn'][data-name='billingAddressCountry']");
	By toggleCityColumn = By.cssSelector("a[data-action='toggleColumn'][data-name='billingAddressCity']");
	By toggleColumnResize = By.cssSelector("a[data-action='toggleColumnResize']");

	// ======= HEADER =======
	By headerTitle = By.cssSelector("h3.header-title");
	By breadcrumbs = By.cssSelector(".header-breadcrumbs");

	// ======= ACTION BUTTONS =======
	By ActionDropdownToggle = By.cssSelector("button.dropdown-toggle[data-toggle='dropdown']");
	By saveButton = By.cssSelector("button[data-action='save']");
	By cancelButton = By.cssSelector("button[data-action='cancel']");
	By saveAndContinueButton = By.cssSelector("a[data-action='saveAndContinueEditing']");
	By saveAndNewButton = By.cssSelector("a[data-action='saveAndNew']");

	// ======= BASIC INFO =======
	By nameInput = By.cssSelector("input[data-name='name']");
	By websiteInput = By.cssSelector("input[data-name='website']");
	By emailInput = By.cssSelector("input[type='email'].email-address");
	By phoneInput = By.cssSelector("input[type='text'][autocomplete='espo-phoneNumber']");

	// ======= PHONE TYPE =======
	By phoneTypeDropdown = By.cssSelector("div.phone-number-block select");

	// ======= BILLING ADDRESS =======
	By billingStreet = By.cssSelector("textarea[data-name='billingAddressStreet']");
	By billingCity = By.cssSelector("input[data-name='billingAddressCity']");
	By billingState = By.cssSelector("input[data-name='billingAddressState']");
	By billingPostalCode = By.cssSelector("input[data-name='billingAddressPostalCode']");
	By billingCountry = By.cssSelector("input[data-name='billingAddressCountry']");

	// ======= SHIPPING ADDRESS =======
	By shippingStreet = By.cssSelector("textarea[data-name='shippingAddressStreet']");
	By shippingCity = By.cssSelector("input[data-name='shippingAddressCity']");
	By shippingState = By.cssSelector("input[data-name='shippingAddressState']");
	By shippingPostalCode = By.cssSelector("input[data-name='shippingAddressPostalCode']");
	By shippingCountry = By.cssSelector("input[data-name='shippingAddressCountry']");
	By copyBillingButton = By.xpath("//button[contains(text(), 'Copy Billing')]");

	// ======= DROPDOWNS =======
	By typeDropdown = By.xpath("(//div[contains(@class,'selectize-input items')])[2]");
	By industryDropdown = By.xpath("(//div[contains(@class,'selectize-input items')])[3]");

	// ======= DESCRIPTION =======
	By descriptionTextarea = By.cssSelector("textarea[data-name='description']");

	// ======= ASSIGNED USER =======
	By assignedUserInput = By.cssSelector("input[data-name='assignedUserName']");
	By assignedUserSelectButton = By.cssSelector("button[data-action='selectLink']:not([disabled])");
	By assignedUserClearButton = By.cssSelector("button[data-action='clearLink']");

	// ======= TEAMS =======
	By teamsInput = By.cssSelector("div.input-group.add-team input");
	By teamsSelectButton = By.cssSelector("div.input-group.add-team button[data-action='selectLink']");

	// account tab click
	public boolean clickAccountsTab() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait until the element is visible and clickable
	    By accountTabLocator = By.cssSelector("li[data-name='Account'] > a.nav-link");
	    WebElement accountTab = wait.until(ExpectedConditions.elementToBeClickable(accountTabLocator));

	    // Use JS executor to click
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", accountTab);

	    return true;
	}

	

	// Method to get the header title
	public String getHeaderTitle() {
		WebElement header = driver.findElement(AccountheaderTitle);
		return header.getText();
	}

	// Method to click the filter dropdown button
	public boolean clickFilterDropdown() {
		driver.findElement(filterDropdownButton).click();
		return true;
	}

	// Method to type into the search input
	public boolean enterSearchText(String text) {
		driver.findElement(searchInput).sendKeys(text);
		return true;
	}

	// Method to click the search button
	public boolean clickSearchButton() {
		driver.findElement(searchButton).click();
		return true;
	}

	// Method to click the reset button
	public boolean clickResetButton() {
		driver.findElement(resetButton).click();
		return true;
	}

	// Method to select the "All" filter option
	public boolean FilterDropdownClick() {
		driver.findElement(filterOptionAll).click();
		return true;
	}

	// Method to select the "All" filter option
	public boolean selectFilterOptionAll() {
		driver.findElement(filterOptionAll).click();
		return true;
	}

	// Method to select the "Starred" filter option
	public boolean selectFilterOptionStarred() {
		driver.findElement(filterOptionStarred).click();
		return true;
	}

	// Method to select the "Recently Created" filter option
	public boolean selectFilterOptionRecentlyCreated() {
		driver.findElement(filterOptionRecentlyCreated).click();
		return true;
	}

	// Method to check the "Only My" checkbox
	public boolean checkOnlyMyCheckbox() {
		WebElement onlyMyCheckbox = driver.findElement(checkboxOnlyMy);
		if (!onlyMyCheckbox.isSelected()) {
			onlyMyCheckbox.click();
		}
		return true;
	}

	// Method to check the "Followed" checkbox
	public boolean checkFollowedCheckbox() {
		WebElement followedCheckbox = driver.findElement(checkboxFollowed);
		if (!followedCheckbox.isSelected()) {
			followedCheckbox.click();
		}
		return true;
	}

	// Method to click the add filter dropdown button
	public boolean clickAddFilterDropdown() {
		driver.findElement(addFilterDropdown).click();
		return true;
	}

	// Method to click on the "Assigned User" filter option
	public boolean selectFilterAssignedUser() {
		driver.findElement(filterAssignedUser).click();
		return true;
	}

	// Method to click on the "Teams" filter option
	public boolean selectFilterTeams() {
		driver.findElement(filterTeams).click();
		return true;
	}

	// Method to click on the "Created At" filter option
	public boolean selectFilterCreatedAt() {
		driver.findElement(filterCreatedAt).click();
		return true;
	}

	// Method to click on the "Created By" filter option
	public boolean selectFilterCreatedBy() {
		driver.findElement(filterCreatedBy).click();
		return true;
	}

	// Method to click on the "Modified At" filter option
	public boolean selectFilterModifiedAt() {
		driver.findElement(filterModifiedAt).click();
		return true;
	}

	// Method to click on the "Type" filter option
	public boolean selectFilterType() {
		driver.findElement(filterType).click();
		return true;
	}

	// Method to click on the "Industry" filter option
	public boolean selectFilterIndustry() {
		driver.findElement(filterIndustry).click();
		return true;
	}

	// Method to click on the "Description" filter option
	public boolean selectFilterDescription() {
		driver.findElement(filterDescription).click();
		return true;
	}

	// Method to click on the "Email Address" filter option
	public boolean selectFilterEmail() {
		driver.findElement(filterEmail).click();
		return true;
	}

	// Method to click on the "Phone Number" filter option
	public boolean selectFilterPhone() {
		driver.findElement(filterPhone).click();
		return true;
	}

	// Method to click on the "Target Lists" filter option
	public boolean selectFilterTargetLists() {
		driver.findElement(filterTargetLists).click();
		return true;
	}

	// Method to click on the "Country" filter option
	public boolean selectFilterCountry() {
		driver.findElement(filterCountry).click();
		return true;
	}

	// Method to click on the "Billing Address" filter option
	public boolean selectFilterBillingAddress() {
		driver.findElement(filterBillingAddress).click();
		return true;
	}

	// Method to click on the "Shipping Address" filter option
	public boolean selectFilterShippingAddress() {
		driver.findElement(filterShippingAddress).click();
		return true;
	}

	// Method to click on the "Website" filter option
	public boolean selectFilterWebsite() {
		driver.findElement(filterWebsite).click();
		return true;
	}

	// Method to click the "Create Account" button
	public boolean clickCreateAccountButton() {
		WebElement accountCreate = driver.findElement(createAccountButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", accountCreate);
		return true;
	}

	// Method to click the actions dropdown button
	public boolean clickActionsDropdownButton() {
		driver.findElement(actionsDropdownButton).click();
		return true;
	}

	// Method to click the "Remove" action
	public boolean clickActionRemove() {
		driver.findElement(actionRemove).click();
		return true;
	}

	// Method to click the "Merge" action
	public boolean clickActionMerge() {
		driver.findElement(actionMerge).click();
		return true;
	}

	// Method to click the "Mass Update" action
	public boolean clickActionMassUpdate() {
		driver.findElement(actionMassUpdate).click();
		return true;
	}

	// Method to click the "Export" action
	public boolean clickActionExport() {
		driver.findElement(actionExport).click();
		return true;
	}

	// Method to click the "Follow" action
	public boolean clickActionFollow() {
		driver.findElement(actionFollow).click();
		return true;
	}

	// Method to click the "Unfollow" action
	public boolean clickActionUnfollow() {
		driver.findElement(actionUnfollow).click();
		return true;
	}

	// Method to click the "Recalculate Formula" action
	public boolean clickActionRecalculateFormula() {
		driver.findElement(actionRecalculateFormula).click();
		return true;
	}

	// --- Pagination Methods ---

	// Method to click the pagination status
	public boolean clickPaginationStatus() {
		driver.findElement(paginationStatus).click();
		return true;
	}

	// Method to click the "First Page" button
	public boolean clickPaginationFirstPage() {
		driver.findElement(paginationFirstPage).click();
		return true;
	}

	// Method to click the "Last Page" button
	public boolean clickPaginationLastPage() {
		driver.findElement(paginationLastPage).click();
		return true;
	}

	// Method to click the "Previous" page button
	public boolean clickPaginationPrevious() {
		driver.findElement(paginationPrevious).click();
		return true;
	}

	// Method to click the "Next" page button
	public boolean clickPaginationNext() {
		driver.findElement(paginationNext).click();
		return true;
	}

	// --- Settings Methods ---

	// Method to click the settings dropdown toggle
	public boolean clickSettingsDropdownToggle() {
		driver.findElement(settingsDropdownToggle).click();
		return true;
	}

	// Method to toggle the "Industry" column
	public boolean toggleIndustryColumn() {
		driver.findElement(toggleIndustryColumn).click();
		return true;
	}

	// Method to toggle the "Type" column
	public boolean toggleTypeColumn() {
		driver.findElement(toggleTypeColumn).click();
		return true;
	}

	// Method to toggle the "Country" column
	public boolean toggleCountryColumn() {
		driver.findElement(toggleCountryColumn).click();
		return true;
	}

	// Method to toggle the "City" column
	public boolean toggleCityColumn() {
		driver.findElement(toggleCityColumn).click();
		return true;
	}

	// Method to resize columns
	public boolean toggleColumnResize() {
		driver.findElement(toggleColumnResize).click();
		return true;
	}

	// ======= HEADER ACTIONS =======

	// Method to check if the header title is visible
	public boolean isHeaderTitleVisible() {
		return driver.findElement(headerTitle).isDisplayed();
	}

	// Method to check if the breadcrumbs are visible
	public boolean isBreadcrumbsVisible() {
		return driver.findElement(breadcrumbs).isDisplayed();
	}

	public void confirmLeaveFormIfVisible(RemoteWebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        System.out.println("Waiting for confirmation popup...");

	        WebElement yesButton = wait.until(ExpectedConditions.presenceOfElementLocated(
	            By.xpath("//button[@data-name='confirm' and contains(., 'Yes')]")));

	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesButton);
	        wait.until(ExpectedConditions.elementToBeClickable(yesButton)).click();

	        System.out.println("Clicked 'Yes' on confirmation popup.");

	        // Optional: wait for "Are you sure..." message to appear after clicking
	        try {
	            WebElement leaveFormText = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//*[contains(text(), 'Are you sure you want to leave the form')]")));
	            System.out.println("'Are you sure...' message appeared after clicking 'Yes'.");
	        } catch (TimeoutException e) {
	            System.out.println("'Are you sure...' message did not appear after clicking.");
	        }

	    } catch (TimeoutException e) {
	        System.out.println("No confirmation popup appeared. Nothing to click.");
	    } catch (Exception e) {
	        System.out.println("Error while handling confirmation: " + e.getMessage());
	    }
	}



	public boolean clickActionToggleButton() {
		driver.findElement(ActionDropdownToggle).click();
		return true;
	}

	public boolean clickSaveButton() {
		WebElement SaveButton = driver.findElement(saveButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", SaveButton);
		return true;

	}

	public boolean clickCancelButton() {
		WebElement cancelingButton = driver.findElement(cancelButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cancelingButton);
		return true;
	}

	public boolean clickSaveAndContinueButton() {
		WebElement SaveContinueButton = driver.findElement(saveAndContinueButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", SaveContinueButton);
		return true;
	}

	public boolean clickSaveAndNewButton() {
		WebElement SaveButtonAndNew = driver.findElement(saveAndNewButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", SaveButtonAndNew);
		return true;
	}

	// ======= BASIC INFO INPUT =======
	public boolean enterName(String name) {
		driver.findElement(nameInput).sendKeys(name);
		return true;
	}

	public boolean enterWebsite(String website) {
		driver.findElement(websiteInput).sendKeys(website);
		return true;
	}

	public boolean enterEmail(String email) {
		driver.findElement(emailInput).sendKeys(email);
		return true;
	}

	public boolean enterPhone(String phone) {
		driver.findElement(phoneInput).sendKeys(phone);
		return true;
	}

	public boolean isPhoneTypeDropdownVisible() {
		return driver.findElement(phoneTypeDropdown).isDisplayed();
	}

	// ======= BILLING ADDRESS INPUT =======
	public boolean enterBillingStreet(String street) {
		driver.findElement(billingStreet).sendKeys(street);
		return true;
	}

	public boolean enterBillingCity(String city) {
		driver.findElement(billingCity).sendKeys(city);
		return true;
	}

	public boolean enterBillingState(String state) {
		driver.findElement(billingState).sendKeys(state);
		return true;
	}

	public boolean enterBillingPostalCode(String postalCode) {
		driver.findElement(billingPostalCode).sendKeys(postalCode);
		return true;
	}

	public boolean enterBillingCountry(String country) {
		driver.findElement(billingCountry).sendKeys(country);
		return true;
	}

	// ======= SHIPPING ADDRESS INPUT =======
	public boolean enterShippingStreet(String street) {
		driver.findElement(shippingStreet).sendKeys(street);
		return true;
	}

	public boolean enterShippingCity(String city) {
		driver.findElement(shippingCity).sendKeys(city);
		return true;
	}

	public boolean enterShippingState(String state) {
		driver.findElement(shippingState).sendKeys(state);
		return true;
	}

	public boolean enterShippingPostalCode(String postalCode) {
		driver.findElement(shippingPostalCode).sendKeys(postalCode);
		return true;
	}

	public boolean enterShippingCountry(String country) {
		driver.findElement(shippingCountry).sendKeys(country);
		return true;
	}

	public boolean clickCopyBillingButton() {
		driver.findElement(copyBillingButton).click();
		return true;
	}

	// ======= DROPDOWN VISIBILITY =======
	public boolean isTypeDropdownVisible(String value) {
		WebElement TypeDrodown1 = driver.findElement(typeDropdown);
		Select dd = new Select(TypeDrodown1);
		dd.selectByVisibleText(value);
		return true;
	}

	public boolean isIndustryDropdownVisible(String value ) {
		WebElement IndustryDD= driver.findElement(industryDropdown);
		Select dd = new Select(IndustryDD);
		dd.selectByVisibleText(value);
		return true;
	}

	// ======= DESCRIPTION =======
	public boolean enterDescription(String description) {
		driver.findElement(descriptionTextarea).sendKeys(description);
		return true;
	}

	// ======= ASSIGNED USER ACTIONS =======
	public boolean enterAssignedUser(String user) {
		driver.findElement(assignedUserInput).sendKeys(user);
		return true;
	}

	public boolean clickAssignedUserSelect() {
		driver.findElement(assignedUserSelectButton).click();
		return true;
	}

	public boolean clickAssignedUserClear() {
		driver.findElement(assignedUserClearButton).click();
		return true;
	}

	// ======= TEAMS ACTIONS =======
	public boolean enterTeam(String team) {
		driver.findElement(teamsInput).sendKeys(team);
		return true;
	}

	public boolean clickTeamSelectButton() {
		driver.findElement(teamsSelectButton).click();
		return true;
	}
}
