package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import MyProject.demo.us.espocrm.com.BaseClass;

public class ContactPageLocators extends BaseClass {

	public ContactPageLocators(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	// Dropdown toggle button (three dots)
	By filterDropdownButton = By.cssSelector("button.add-filter-button");

	// Reset button (X icon)
	By resetButton = By.cssSelector("button[data-action='reset']");

	// Dropdown menu container
	By filterDropdownMenu = By.cssSelector("ul.filter-list");

	// Search input inside filter dropdown
	By quickSearchInput = By.cssSelector("input.field-filter-quick-search-input");

	// Individual filter items (all)
	By allFilterItems = By.cssSelector("li.filter-item");

	// Specific filter items
	By assignedUserFilter = By.cssSelector("li.filter-item[data-name='assignedUser']");
	By teamsFilter = By.cssSelector("li.filter-item[data-name='teams']");
	By createdAtFilter = By.cssSelector("li.filter-item[data-name='createdAt']");
	By createdByFilter = By.cssSelector("li.filter-item[data-name='createdBy']");
	By modifiedAtFilter = By.cssSelector("li.filter-item[data-name='modifiedAt']");
	By streamUpdatedAtFilter = By.cssSelector("li.filter-item[data-name='streamUpdatedAt']");
	By accountsFilter = By.cssSelector("li.filter-item[data-name='accounts']");
	By addressFilter = By.cssSelector("li.filter-item[data-name='address']");
	By emailAddressFilter = By.cssSelector("li.filter-item[data-name='emailAddress']");
	By phoneNumberFilter = By.cssSelector("li.filter-item[data-name='phoneNumber']");
	By titleFilter = By.cssSelector("li.filter-item[data-name='title']");
	By targetListsFilter = By.cssSelector("li.filter-item[data-name='targetLists']");
	By campaignFilter = By.cssSelector("li.filter-item[data-name='campaign']");

	// "Add Filter" clickable links
	By addFilterLinks = By.cssSelector("a.add-filter");

	// Create button
	By createContactButton = By.cssSelector(
			"a.btn.btn-default.btn-xs-wide.main-header-manu-action.action.radius-left.radius-right[data-action=\"create\"]");

	// Top Action Buttons
	By saveButton = By.cssSelector("button[data-action='save']");
	By cancelButton = By.cssSelector("button[data-action='cancel']");
	By dropdownMenuButton = By.cssSelector("button.dropdown-toggle");

	// Dropdown menu options
	By saveAndContinueEditing = By.cssSelector("a[data-action='saveAndContinueEditing']");
	By saveAndNew = By.cssSelector("a[data-action='saveAndNew']");

	// Name Fields
	By salutationDropdown = By.xpath("//div[@class=\"selectize-input\"]//input[@type=\"text\"]");
	By firstNameInput = By.cssSelector("input[data-name='firstName']");
	By lastNameInput = By.cssSelector("input[data-name='lastName']");

	// Accounts
	By accountsInput = By.cssSelector("div[data-name='accounts'] input.form-control");
	By accountsSelectButton = By.cssSelector("div[data-name='accounts'] button[data-action='selectLink']");

	// Email Address
	By emailInput = By.cssSelector("input[type='email'].email-address");
	By addEmailButton = By.cssSelector("button[data-action='addEmailAddress']");

	// Phone Number
	By phoneTypeDropdown = By.cssSelector("select[data-property-type='type']");
	By phoneInput = By.cssSelector("input.phone-number");
	By addPhoneButton = By.cssSelector("button[data-action='addPhoneNumber']");

	// Address Fields
	By addressStreetTextarea = By.cssSelector("textarea[data-name='addressStreet']");
	By addressCityInput = By.cssSelector("input[data-name='addressCity']");
	By addressStateInput = By.cssSelector("input[data-name='addressState']");
	By addressPostalCodeInput = By.cssSelector("input[data-name='addressPostalCode']");
	By addressCountryInput = By.cssSelector("input[data-name='addressCountry']");

	// Photo Upload
	By photoUploadInput = By.cssSelector("input[type='file']");

	// Birthday
	By birthdayInput = By.cssSelector("input[data-name='birthday']");
	By birthdayPickerButton = By.cssSelector("button.date-picker-btn");

	// Description
	By descriptionTextarea = By.cssSelector("textarea[data-name='description']");

	// Assigned User & Teams
	By assignedUserInput = By.cssSelector("input[data-name='assignedUserName']");
	By assignedUserSelectButton = By.cssSelector("button[data-action='selectLink']");
	By assignedUserClearButton = By.cssSelector("button[data-action='clearLink']");

	By teamsInput = By.cssSelector("div[data-name='teams'] input.form-control");
	By teamsSelectButton = By.cssSelector("div[data-name='teams'] button[data-action='selectLink']");

	// Contact Tab
	By contactsTab = By.cssSelector("li[data-name='Contact'] > a.nav-link");

	// Methods to interact with elements

	// Click the Contact tab
	public boolean clickContactsTab() {
	    WebElement contactsTabElement = driver.findElement(contactsTab);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].click();", contactsTabElement);
	    return true;
	}

	// Click the Create Contact button using JavaScript
	public boolean clickCreateContactButton() {
	    WebElement createContactElement = driver.findElement(createContactButton);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].click();", createContactElement);
	    return true;
	}

	// Click the Save button using JavaScript
	public boolean clickSaveButton() {
	    WebElement saveButtonElement = driver.findElement(saveButton);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].click();", saveButtonElement);
	    return true;
	}

	// Click the Cancel button using JavaScript
	public boolean clickCancelButton() {
	    WebElement cancelButtonElement = driver.findElement(cancelButton);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].click();", cancelButtonElement);
	    return true;
	}

	// Select salutation
	public String selectSalutation(String salutation) {
	    WebElement salutationDropdownElement = driver.findElement(salutationDropdown);
	    Select select = new Select(salutationDropdownElement);
	    select.selectByVisibleText(salutation);
	    return select.getFirstSelectedOption().getText();
	}

	// Enter first name
	public String enterFirstName(String firstName) {
	    WebElement firstNameField = driver.findElement(firstNameInput);
	    firstNameField.sendKeys(firstName);
	    return firstNameField.getAttribute("value");
	}

	// Enter last name
	public String enterLastName(String lastName) {
	    WebElement lastNameField = driver.findElement(lastNameInput);
	    lastNameField.sendKeys(lastName);
	    return lastNameField.getAttribute("value");
	}

	// Enter account
	public String enterAccount(String account) {
	    WebElement accountField = driver.findElement(accountsInput);
	    Select dd = new Select(accountField);
	    dd.selectByVisibleText(account);
	    return dd.getFirstSelectedOption().getText();
	}

	// Click the "Select" button for accounts
	public boolean clickAccountsSelectButton() {
	    driver.findElement(accountsSelectButton).click();
	    return true;
	}

	// Enter email
	public String enterEmail(String email) {
	    WebElement emailField = driver.findElement(emailInput);
	    emailField.sendKeys(email);
	    return emailField.getAttribute("value");
	}

	// Click the "Add Email" button
	public boolean clickAddEmailButton() {
	    driver.findElement(addEmailButton).click();
	    return true;
	}

	// Select phone type
	public String selectPhoneType(String phoneType) {
	    WebElement phoneTypeDropdownElement = driver.findElement(phoneTypeDropdown);
	    Select select = new Select(phoneTypeDropdownElement);
	    select.selectByVisibleText(phoneType);
	    return select.getFirstSelectedOption().getText();
	}

	// Enter phone number
	public String enterPhoneNumber(String phoneNumber) {
	    WebElement phoneField = driver.findElement(phoneInput);
	    phoneField.sendKeys(phoneNumber);
	    return phoneField.getAttribute("value");
	}

	// Click the "Add Phone" button
	public boolean clickAddPhoneButton() {
	    driver.findElement(addPhoneButton).click();
	    return true;
	}

	// Enter address street
	public String enterAddressStreet(String street) {
	    WebElement streetField = driver.findElement(addressStreetTextarea);
	    streetField.sendKeys(street);
	    return streetField.getText();
	}

	// Enter city
	public String enterCity(String city) {
	    WebElement cityField = driver.findElement(addressCityInput);
	    cityField.sendKeys(city);
	    return cityField.getAttribute("value");
	}

	// Enter state
	public String enterState(String state) {
	    WebElement stateField = driver.findElement(addressStateInput);
	    stateField.sendKeys(state);
	    return stateField.getAttribute("value");
	}

	// Enter postal code
	public String enterPostalCode(String postalCode) {
	    WebElement postalCodeField = driver.findElement(addressPostalCodeInput);
	    postalCodeField.sendKeys(postalCode);
	    return postalCodeField.getAttribute("value");
	}

	// Enter country
	public String enterCountry(String country) {
	    WebElement countryField = driver.findElement(addressCountryInput);
	    countryField.sendKeys(country);
	    return countryField.getAttribute("value");
	}

	// Upload photo
	public boolean uploadPhoto(String filePath) {
	    WebElement uploadField = driver.findElement(photoUploadInput);
	    uploadField.sendKeys(filePath);
	    return true;
	}

	// Enter birthday
	public String enterBirthday(String birthday) {
	    WebElement birthdayField = driver.findElement(birthdayInput);
	    birthdayField.sendKeys(birthday);
	    return birthdayField.getAttribute("value");
	}

	// Click the birthday picker button
	public boolean clickBirthdayPickerButton() {
	    driver.findElement(birthdayPickerButton).click();
	    return true;
	}

	// Enter description
	public String enterDescription(String description) {
	    WebElement descriptionField = driver.findElement(descriptionTextarea);
	    descriptionField.sendKeys(description);
	    return descriptionField.getText();
	}

	// Enter assigned user
	public String enterAssignedUser(String assignedUser) {
	    WebElement assignedUserField = driver.findElement(assignedUserInput);
	    Select dd = new Select(assignedUserField);
	    dd.selectByVisibleText(assignedUser);
	    return dd.getFirstSelectedOption().getText();
	}

	// Click the "Select" button for the assigned user
	public boolean clickAssignedUserSelectButton() {
	    driver.findElement(assignedUserSelectButton).click();
	    return true;
	}

	// Click the "Clear" button for the assigned user
	public boolean clickAssignedUserClearButton() {
	    driver.findElement(assignedUserClearButton).click();
	    return true;
	}

	// Enter teams
	public String enterTeams(String team) {
	    WebElement teamsField = driver.findElement(teamsInput);
	    Select dd = new Select(teamsField);
	    dd.selectByVisibleText(team);
	    return dd.getFirstSelectedOption().getText();
	}

	// Click the "Select" button for teams
	public boolean clickTeamsSelectButton() {
	    driver.findElement(teamsSelectButton).click();
	    return true;
	}

}
