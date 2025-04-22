package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import MyProject.demo.us.espocrm.com.BaseClass;

public class LeadPageLocators extends BaseClass {

	public LeadPageLocators(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	// Filter Dropdown Button ("All" / "Open" / "Converted")
	By filterDropdownButton = By.cssSelector("button.filters-button");

	// Filter Options
	By filterOptionAll = By.xpath("//a[@data-name='']");
	By filterOptionOpen = By.xpath("//a[@data-name='actual']");
	By filterOptionConverted = By.xpath("//a[@data-name='converted']");

	// Only My Checkbox
	By checkboxOnlyMy = By.cssSelector("input[data-name='onlyMy']");
	By checkboxFollowed = By.cssSelector("input[data-name='followed']");

	// Search
	By searchInput = By.cssSelector("input[data-name='textFilter']");
	By searchButton = By.cssSelector("button[data-action='search']");
	By resetButton = By.cssSelector("button[data-action='reset']");

	// Add Filter
	By addFilterDropdownToggle = By.cssSelector("button.add-filter-button");
	By quickSearchInput = By.cssSelector(".field-filter-quick-search-input");

	// Filter Items
	By filterAssignedUser = By.cssSelector("li[data-name='assignedUser'] a");
	By filterTeams = By.cssSelector("li[data-name='teams'] a");
	By filterCreatedAt = By.cssSelector("li[data-name='createdAt'] a");
	By filterCreatedBy = By.cssSelector("li[data-name='createdBy'] a");
	By filterModifiedAt = By.cssSelector("li[data-name='modifiedAt'] a");
	By filterStreamUpdatedAt = By.cssSelector("li[data-name='streamUpdatedAt'] a");
	By filterAddress = By.cssSelector("li[data-name='address'] a");
	By filterAccountName = By.cssSelector("li[data-name='accountName'] a");
	By filterCampaign = By.cssSelector("li[data-name='campaign'] a");
	By filterEmail = By.cssSelector("li[data-name='emailAddress'] a");
	By filterPhone = By.cssSelector("li[data-name='phoneNumber'] a");
	By filterStatus = By.cssSelector("li[data-name='status'] a");
	By filterSource = By.cssSelector("li[data-name='source'] a");
	By filterOpportunityAmount = By.cssSelector("li[data-name='opportunityAmountConverted'] a");
	By filterIndustry = By.cssSelector("li[data-name='industry'] a");
	By filterTargetLists = By.cssSelector("li[data-name='targetLists'] a");
	By filterCreatedAccount = By.cssSelector("li[data-name='createdAccount'] a");

	// Navigation / Header
	By leadCreate = By.linkText("Create Lead");
	By breadcrumbLeads = By.linkText("Leads");

	// Buttons
	By saveButton = By.xpath("//button[@data-action='save']");
	By cancelButton = By.xpath("//button[@data-action='cancel']");
	By saveAndContinue = By.xpath("//a[@data-action='saveAndContinueEditing']");
	By saveAndNew = By.xpath("//a[@data-action='saveAndNew']");

	// Name fields
	By salutationDropdown = By.name("salutationName");
	By firstNameInput = By.name("firstName");
	By lastNameInput = By.name("lastName");

	// Account
	By accountNameInput = By.name("accountName");

	// Email
	By emailInput = By.cssSelector("input.email-address");
	By addEmailButton = By.cssSelector("button[data-action='addEmailAddress']");

	// Phone
	By phoneNumberInput = By.cssSelector("input.phone-number");
	By addPhoneButton = By.cssSelector("button[data-action='addPhoneNumber']");

	// Job Details
	By titleInput = By.name("title");
	By websiteInput = By.name("website");

	// Address Fields
	By streetAddress = By.name("addressStreet");
	By cityInput = By.name("addressCity");
	By stateInput = By.name("addressState");
	By postalCodeInput = By.name("addressPostalCode");
	By countryInput = By.name("addressCountry");

	// Photo Upload
	By photoUpload = By.cssSelector("input[type='file'][accept='image/*']");

	// Details Section
	By statusDropdown = By.name("status");
	By sourceDropdown = By.name("source");
	By opportunityAmountInput = By.name("opportunityAmount");
	By currencyDropdown = By.name("opportunityAmountCurrency");
	By campaignInput = By.name("campaignName");
	By industryDropdown = By.name("industry");
	By descriptionInput = By.name("description");

	// Assigned User
	By assignedUserInput = By.name("assignedUserName");

	// Teams
	By addTeamInput = By.cssSelector(".add-team input");
	By selectTeamButton = By.cssSelector(".add-team button[data-action='selectLink']");

	// Converted To
	By createdAccountInput = By.name("createdAccountName");
	By createdContactInput = By.name("createdContactName");
	By createdOpportunityInput = By.name("createdOpportunityName");

	// Click on "Create Lead" button/link
	public boolean clickCreateLead() {
		WebElement element = driver.findElement(leadCreate);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		return true;
	}

	// Click on "Leads" breadcrumb (for navigation)
	public boolean clickLeadsBreadcrumb() {
		WebElement element = driver.findElement(breadcrumbLeads);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		return true;
	}

	// Click "Save" button
	public boolean clickSaveButton() {
		WebElement element = driver.findElement(saveButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		return true;
	}

	// Click "Cancel" button
	public boolean clickCancelButton() {
		WebElement element = driver.findElement(cancelButton);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		return true;
	}

	// Click "Save and Continue Editing" link
	public boolean clickSaveAndContinue() {
		WebElement element = driver.findElement(saveAndContinue);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		return true;
	}

	// Click "Save and New" link
	public boolean clickSaveAndNew() {
		WebElement element = driver.findElement(saveAndNew);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		return true;
	}

	// Enter Last Name
	public String enterLastName(String lastName) {
		WebElement lastNameField = driver.findElement(lastNameInput);
		lastNameField.sendKeys(lastName);
		return lastNameField.getAttribute("value");
	}

	// Enter Account
	public String enterAccount(String account) {
		WebElement accountField = driver.findElement(accountNameInput);
		Select dd = new Select(accountField);
		dd.selectByVisibleText(account);
		return dd.getFirstSelectedOption().getText();
	}

	/*
	 * // Click the "Select" button for accounts public boolean
	 * clickAccountsSelectButton() {
	 * driver.findElement(accountsSelectButton).click(); return true; }
	 */

	// Enter First Name
	public String enterFirstName(String firstName) {
		WebElement firstNameField = driver.findElement(firstNameInput);
		firstNameField.sendKeys(firstName);
		return firstNameField.getAttribute("value");
	}

	// Enter Email
	public String enterEmail(String email) {
		WebElement emailField = driver.findElement(emailInput);
		emailField.sendKeys(email);
		return emailField.getAttribute("value");
	}

	// Enter Phone Number
	public String enterPhoneNumber(String phoneNumber) {
		WebElement phoneNumberField = driver.findElement(phoneNumberInput);
		phoneNumberField.sendKeys(phoneNumber);
		return phoneNumberField.getAttribute("value");
	}

	// Enter Title
	public String enterTitle(String title) {
		WebElement titleField = driver.findElement(titleInput);
		titleField.sendKeys(title);
		return titleField.getAttribute("value");
	}

	// Enter Website
	public String enterWebsite(String website) {
		WebElement websiteField = driver.findElement(websiteInput);
		websiteField.sendKeys(website);
		return websiteField.getAttribute("value");
	}

	// Enter Street Address
	public String enterStreetAddress(String street) {
		WebElement streetField = driver.findElement(streetAddress);
		streetField.sendKeys(street);
		return streetField.getAttribute("value");
	}

	// Enter City
	public String enterCity(String city) {
		WebElement cityField = driver.findElement(cityInput);
		cityField.sendKeys(city);
		return cityField.getAttribute("value");
	}

	// Enter State
	public String enterState(String state) {
		WebElement stateField = driver.findElement(stateInput);
		stateField.sendKeys(state);
		return stateField.getAttribute("value");
	}

	// Enter Postal Code
	public String enterPostalCode(String postalCode) {
		WebElement postalCodeField = driver.findElement(postalCodeInput);
		postalCodeField.sendKeys(postalCode);
		return postalCodeField.getAttribute("value");
	}

	// Enter Country
	public String enterCountry(String country) {
		WebElement countryField = driver.findElement(countryInput);
		countryField.sendKeys(country);
		return countryField.getAttribute("value");
	}

	// Upload Photo
	public boolean uploadPhoto(String filePath) {
		WebElement uploadField = driver.findElement(photoUpload);
		uploadField.sendKeys(filePath);
		return true;
	}

	// Select Status
	public String selectStatus(String status) {
		WebElement statusField = driver.findElement(statusDropdown);
		Select dd = new Select(statusField);
		dd.selectByVisibleText(status);
		return dd.getFirstSelectedOption().getText();
	}

	// Select Source
	public String selectSource(String source) {
		WebElement sourceField = driver.findElement(sourceDropdown);
		Select dd = new Select(sourceField);
		dd.selectByVisibleText(source);
		return dd.getFirstSelectedOption().getText();
	}

	// Enter Opportunity Amount
	public String enterOpportunityAmount(String amount) {
		WebElement opportunityAmountField = driver.findElement(opportunityAmountInput);
		opportunityAmountField.sendKeys(amount);
		return opportunityAmountField.getAttribute("value");
	}

	// Select Currency
	public String selectCurrency(String currency) {
		WebElement currencyField = driver.findElement(currencyDropdown);
		Select dd = new Select(currencyField);
		dd.selectByVisibleText(currency);
		return dd.getFirstSelectedOption().getText();
	}

	// Enter Campaign
	public String enterCampaign(String campaign) {
		WebElement campaignField = driver.findElement(campaignInput);
		campaignField.sendKeys(campaign);
		return campaignField.getAttribute("value");
	}

	// Select Industry
	public String selectIndustry(String industry) {
		WebElement industryField = driver.findElement(industryDropdown);
		Select dd = new Select(industryField);
		dd.selectByVisibleText(industry);
		return dd.getFirstSelectedOption().getText();
	}

	// Enter Description
	public String enterDescription(String description) {
		WebElement descriptionField = driver.findElement(descriptionInput);
		descriptionField.sendKeys(description);
		return descriptionField.getAttribute("value");
	}

	// Enter Assigned User
	public String enterAssignedUser(String assignedUser) {
		WebElement assignedUserField = driver.findElement(assignedUserInput);
		assignedUserField.sendKeys(assignedUser);
		return assignedUserField.getAttribute("value");
	}

	// Enter Add Team
	public String enterAddTeam(String team) {
		WebElement teamField = driver.findElement(addTeamInput);
		teamField.sendKeys(team);
		return teamField.getAttribute("value");
	}

	// Click the Select Team Button
	public boolean clickSelectTeamButton() {
		driver.findElement(selectTeamButton).click();
		return true;
	}

	// Enter Created Account
	public String enterCreatedAccount(String createdAccount) {
		WebElement createdAccountField = driver.findElement(createdAccountInput);
		createdAccountField.sendKeys(createdAccount);
		return createdAccountField.getAttribute("value");
	}

	// Enter Created Contact
	public String enterCreatedContact(String createdContact) {
		WebElement createdContactField = driver.findElement(createdContactInput);
		createdContactField.sendKeys(createdContact);
		return createdContactField.getAttribute("value");
	}

	// Enter Created Opportunity
	public String enterCreatedOpportunity(String createdOpportunity) {
		WebElement createdOpportunityField = driver.findElement(createdOpportunityInput);
		createdOpportunityField.sendKeys(createdOpportunity);
		return createdOpportunityField.getAttribute("value");
	}

}
