package testBase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.ContactPageLocators;
import utility.TestDataProviderClass;

public class ContactPageTests extends BaseClass {

    ContactPageLocators contactPage;

    @BeforeClass
    public void setupPage() {
        contactPage = new ContactPageLocators(driver);
    }

    // First, interact with the main contact UI
    @Test(priority = 1, groups = { "ContactCreate", "Sanity", "Regression" })
    public void testClickContactsTab() {
        Assert.assertTrue(contactPage.clickContactsTab(), "Failed to click Contacts tab");
    }

    @Test(priority = 2, dependsOnMethods = "testClickContactsTab", groups = { "ContactCreate", "Sanity" })
    public void testClickCreateContactButton() {
        Assert.assertTrue(contactPage.clickCreateContactButton(), "Failed to click Create Contact button");
    }

    // Then, proceed to save the contact
    @Test(priority = 29, groups = { "ContactCreate", "Regression" })
    public void testClickSaveButton() {
        Assert.assertTrue(contactPage.clickSaveButton(), "Failed to click Save button");
    }

    // Disable for now, but could be tested later
    @Test(priority = 4, enabled = false, groups = { "ContactCreate", "Sanity" })
    public void testClickCancelButton() {
        Assert.assertTrue(contactPage.clickCancelButton(), "Failed to click Cancel button");
    }

    // Interacting with input fields like salutation, name, etc.
    @Test(priority = 5, groups = { "ContactCreate", "Sanity" })
    public void testSelectSalutation() {
        String selected = contactPage.selectSalutation("Mr.");
        Assert.assertEquals(selected, "Mr.");
    }

    @Test(priority = 6, groups = { "ContactCreate", "Sanity" })
    public void testEnterFirstName() {
        String entered = contactPage.enterFirstName("John");
        Assert.assertEquals(entered, "John");
    }

    @Test(priority = 7, groups = { "ContactCreate", "Sanity" })
    public void testEnterLastName() {
        String entered = contactPage.enterLastName("Doe");
        Assert.assertEquals(entered, "Doe");
    }

    @Test(priority = 8, groups = { "ContactCreate", "Sanity" })
    public void testEnterAccount() {
        String entered = contactPage.enterAccount("Test Account");
        Assert.assertEquals(entered, "Test Account");
    }

    @Test(priority = 9, enabled = false, groups = { "ContactCreate" })
    public void testClickAccountsSelectButton() {
        Assert.assertTrue(contactPage.clickAccountsSelectButton());
    }

    @Test(priority = 10, groups = { "ContactCreate", "Sanity" })
    public void testEnterEmail() {
        String entered = contactPage.enterEmail("john.doe@example.com");
        Assert.assertEquals(entered, "john.doe@example.com");
    }

    @Test(priority = 11, groups = { "ContactCreate", "Sanity" })
    public void testClickAddEmailButton() {
        Assert.assertTrue(contactPage.clickAddEmailButton());
    }

    // Next, dealing with phone-related actions
    @Test(priority = 12, groups = { "ContactCreate", "Sanity" })
    public void testSelectPhoneType() {
        String selected = contactPage.selectPhoneType("Mobile");
        Assert.assertEquals(selected, "Mobile");
    }

    @Test(priority = 13, groups = { "ContactCreate", "Sanity" })
    public void testEnterPhoneNumber() {
        String entered = contactPage.enterPhoneNumber("1234567890");
        Assert.assertEquals(entered, "1234567890");
    }

    @Test(priority = 14, groups = { "ContactCreate", "Sanity" })
    public void testClickAddPhoneButton() {
        Assert.assertTrue(contactPage.clickAddPhoneButton());
    }

    // Address-related inputs
    @Test(priority = 15, groups = { "ContactCreate", "Sanity" })
    public void testEnterAddressStreet() {
        String entered = contactPage.enterAddressStreet("123 Elm Street");
        Assert.assertEquals(entered, "123 Elm Street");
    }

    @Test(priority = 16, groups = { "ContactCreate", "Sanity" })
    public void testEnterCity() {
        String entered = contactPage.enterCity("New York");
        Assert.assertEquals(entered, "New York");
    }

    @Test(priority = 17, groups = { "ContactCreate", "Sanity" })
    public void testEnterState() {
        String entered = contactPage.enterState("NY");
        Assert.assertEquals(entered, "NY");
    }

    @Test(priority = 18, groups = { "ContactCreate", "Sanity" })
    public void testEnterPostalCode() {
        String entered = contactPage.enterPostalCode("10001");
        Assert.assertEquals(entered, "10001");
    }

    @Test(priority = 19, groups = { "ContactCreate", "Sanity" })
    public void testEnterCountry() {
        String entered = contactPage.enterCountry("USA");
        Assert.assertEquals(entered, "USA");
    }

    // Photo upload and birthday-related actions
    @Test(priority = 20, groups = { "ContactCreate", "Regression" })
    public void testUploadPhoto() {
        Assert.assertTrue(contactPage.uploadPhoto("C:\\path\\to\\photo.jpg"));
    }

    @Test(priority = 21, groups = { "ContactCreate", "Sanity" })
    public void testEnterBirthday() {
        String entered = contactPage.enterBirthday("01/01/1990");
        Assert.assertEquals(entered, "01/01/1990");
    }

    @Test(priority = 22, groups = { "ContactCreate", "Sanity" })
    public void testClickBirthdayPickerButton() {
        Assert.assertTrue(contactPage.clickBirthdayPickerButton());
    }

    // Description and assigned user
    @Test(priority = 23, groups = { "ContactCreate", "Sanity" })
    public void testEnterDescription() {
        String entered = contactPage.enterDescription("Test Description");
        Assert.assertEquals(entered, "Test Description");
    }

    @Test(priority = 24, groups = { "ContactCreate", "Sanity" })
    public void testEnterAssignedUser() {
        String entered = contactPage.enterAssignedUser("Admin");
        Assert.assertEquals(entered, "Admin");
    }

    @Test(priority = 25, groups = { "ContactCreate", "Sanity" })
    public void testClickAssignedUserSelectButton() {
        Assert.assertTrue(contactPage.clickAssignedUserSelectButton());
    }

    @Test(priority = 26, groups = { "ContactCreate", "Sanity" })
    public void testClickAssignedUserClearButton() {
        Assert.assertTrue(contactPage.clickAssignedUserClearButton());
    }

    // Teams-related actions
    @Test(priority = 27, groups = { "ContactCreate", "Sanity" })
    public void testEnterTeams() {
        String entered = contactPage.enterTeams("Sales");
        Assert.assertEquals(entered, "Sales");
    }

    @Test(priority = 28, groups = { "ContactCreate", "Sanity" })
    public void testClickTeamsSelectButton() {
        Assert.assertTrue(contactPage.clickTeamsSelectButton());
    }

    @Test(priority = 31, dataProvider = "contactData", dataProviderClass = TestDataProviderClass.class, groups = { "ContactCreate", "Regression" })
    public void testCreateNewContact(String salutation, String firstName, String lastName, String account, String email,
                                      String phoneType, String phone, String street, String city, String state, String postalCode,
                                      String country, String birthday, String assignedUser, String team, String description) {

        Assert.assertTrue(contactPage.clickContactsTab(), "Failed to click Contacts tab");
        Assert.assertTrue(contactPage.clickCreateContactButton(), "Failed to click Create Contact button");

        Assert.assertEquals(contactPage.selectSalutation(salutation), salutation);
        Assert.assertEquals(contactPage.enterFirstName(firstName), firstName);
        Assert.assertEquals(contactPage.enterLastName(lastName), lastName);
        Assert.assertEquals(contactPage.enterAccount(account), account);
        Assert.assertEquals(contactPage.enterEmail(email), email);
        Assert.assertEquals(contactPage.selectPhoneType(phoneType), phoneType);
        Assert.assertEquals(contactPage.enterPhoneNumber(phone), phone);
        Assert.assertEquals(contactPage.enterAddressStreet(street), street);
        Assert.assertEquals(contactPage.enterCity(city), city);
        Assert.assertEquals(contactPage.enterState(state), state);
        Assert.assertEquals(contactPage.enterPostalCode(postalCode), postalCode);
        Assert.assertEquals(contactPage.enterCountry(country), country);
        Assert.assertEquals(contactPage.enterBirthday(birthday), birthday);
        Assert.assertEquals(contactPage.enterAssignedUser(assignedUser), assignedUser);
        Assert.assertEquals(contactPage.enterTeams(team), team);
        Assert.assertEquals(contactPage.enterDescription(description), description);

        contactPage.clickAddEmailButton();
        contactPage.clickAddPhoneButton();
        contactPage.clickBirthdayPickerButton();
        contactPage.clickAssignedUserSelectButton();
        contactPage.clickAssignedUserClearButton();
        contactPage.clickTeamsSelectButton();
        contactPage.uploadPhoto("C:\\path\\to\\photo.jpg");
        Assert.assertTrue(contactPage.clickSaveButton(), "Save button click failed");
    }
}
