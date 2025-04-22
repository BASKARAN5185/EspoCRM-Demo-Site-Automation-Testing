package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProject.demo.us.espocrm.com.BaseClass;
import pageObjectClass.LandingPageLocators;
import pageObjectClass.LeadPageLocators;

public class LeadPageTest extends BaseClass {

	LeadPageLocators leadPage = new LeadPageLocators(driver);
	LandingPageLocators Landpage=new LandingPageLocators(driver);
	
	   // Test for clicking on "Create Lead"
    @Test(priority = -1, groups = { "LeadCreate", "Sanity" })
    public void testClickCreateLead() {
    	Landpage.clickLeadsTab();
        boolean result = leadPage.clickCreateLead();
        Assert.assertTrue(result, "Clicking on 'Create Lead' failed.");
    }

    // Test for clicking on "Leads" breadcrumb (for navigation)
    @Test(priority = 27, groups = { "Navigation", "Sanity" })
    public void testClickLeadsBreadcrumb() {
        boolean result = leadPage.clickLeadsBreadcrumb();
        Assert.assertTrue(result, "Clicking on 'Leads' breadcrumb failed.");
    }

    // Test for clicking the "Save" button
    @Test(priority = 28, groups = { "LeadActions", "Sanity" })
    public void testClickSaveButton() {
        boolean result = leadPage.clickSaveButton();
        Assert.assertTrue(result, "Clicking on 'Save' button failed.");
    }

    // Test for clicking the "Cancel" button
    @Test(priority = 29, groups = { "LeadActions", "Sanity" })
    public void testClickCancelButton() {
        boolean result = leadPage.clickCancelButton();
        Assert.assertTrue(result, "Clicking on 'Cancel' button failed.");
    }

    // Test for clicking the "Save and Continue Editing" link
    @Test(priority = 30, groups = { "LeadActions", "Sanity" })
    public void testClickSaveAndContinue() {
        boolean result = leadPage.clickSaveAndContinue();
        Assert.assertTrue(result, "Clicking on 'Save and Continue Editing' failed.");
    }

    // Test for clicking the "Save and New" link
    @Test(priority = 31, groups = { "LeadActions", "Sanity" })
    public void testClickSaveAndNew() {
        boolean result = leadPage.clickSaveAndNew();
        Assert.assertTrue(result, "Clicking on 'Save and New' failed.");
    }

	@Test(priority = 1, groups = { "LeadCreate", "Sanity" })
	public void testEnterLastName() {
		
		String enteredLastName = leadPage.enterLastName("Doe");
		Assert.assertEquals(enteredLastName, "Doe", "Entered last name does not match expected.");
	}

	@Test(priority = 2, groups = { "LeadCreate", "Sanity" })
	public void testEnterAccount() {
		String enteredAccount = leadPage.enterAccount("Test Account");
		Assert.assertEquals(enteredAccount, "Test Account", "Entered account does not match expected.");
	}

	@Test(priority = 3, groups = { "LeadCreate", "Sanity" })
	public void testEnterFirstName() {
		String enteredFirstName = leadPage.enterFirstName("John");
		Assert.assertEquals(enteredFirstName, "John", "Entered first name does not match expected.");
	}

	@Test(priority = 4, groups = { "LeadCreate", "Sanity" })
	public void testEnterEmail() {
		String enteredEmail = leadPage.enterEmail("john.doe@example.com");
		Assert.assertEquals(enteredEmail, "john.doe@example.com", "Entered email does not match expected.");
	}

	@Test(priority = 5, groups = { "LeadCreate", "Sanity" })
	public void testEnterPhoneNumber() {
		String enteredPhoneNumber = leadPage.enterPhoneNumber("1234567890");
		Assert.assertEquals(enteredPhoneNumber, "1234567890", "Entered phone number does not match expected.");
	}

	@Test(priority = 6, groups = { "LeadCreate", "Sanity" })
	public void testEnterTitle() {
		String enteredTitle = leadPage.enterTitle("Mr.");
		Assert.assertEquals(enteredTitle, "Mr.", "Entered title does not match expected.");
	}

	@Test(priority = 7, groups = { "LeadCreate", "Sanity" })
	public void testEnterWebsite() {
		String enteredWebsite = leadPage.enterWebsite("www.example.com");
		Assert.assertEquals(enteredWebsite, "www.example.com", "Entered website does not match expected.");
	}

	@Test(priority = 8, groups = { "LeadCreate", "Sanity" })
	public void testEnterStreetAddress() {
		String enteredStreet = leadPage.enterStreetAddress("123 Main St");
		Assert.assertEquals(enteredStreet, "123 Main St", "Entered street address does not match expected.");
	}

	@Test(priority = 9, groups = { "LeadCreate", "Sanity" })
	public void testEnterCity() {
		String enteredCity = leadPage.enterCity("New York");
		Assert.assertEquals(enteredCity, "New York", "Entered city does not match expected.");
	}

	@Test(priority = 10, groups = { "LeadCreate", "Sanity" })
	public void testEnterState() {
		String enteredState = leadPage.enterState("NY");
		Assert.assertEquals(enteredState, "NY", "Entered state does not match expected.");
	}

	@Test(priority = 11, groups = { "LeadCreate", "Sanity" })
	public void testEnterPostalCode() {
		String enteredPostalCode = leadPage.enterPostalCode("10001");
		Assert.assertEquals(enteredPostalCode, "10001", "Entered postal code does not match expected.");
	}

	@Test(priority = 12, groups = { "LeadCreate", "Sanity" })
	public void testEnterCountry() {
		String enteredCountry = leadPage.enterCountry("USA");
		Assert.assertEquals(enteredCountry, "USA", "Entered country does not match expected.");
	}

	@Test(priority = 13, groups = { "LeadCreate", "Sanity" })
	public void testUploadPhoto() {
		boolean isUploaded = leadPage.uploadPhoto("/path/to/photo.jpg");
		Assert.assertTrue(isUploaded, "Photo upload failed.");
	}

	@Test(priority = 14, groups = { "LeadCreate", "Sanity" })
	public void testSelectStatus() {
		String selectedStatus = leadPage.selectStatus("Active");
		Assert.assertEquals(selectedStatus, "Active", "Selected status does not match expected.");
	}

	@Test(priority = 15, groups = { "LeadCreate", "Sanity" })
	public void testSelectSource() {
		String selectedSource = leadPage.selectSource("Web");
		Assert.assertEquals(selectedSource, "Web", "Selected source does not match expected.");
	}

	@Test(priority = 16, groups = { "LeadCreate", "Sanity" })
	public void testEnterOpportunityAmount() {
		String enteredAmount = leadPage.enterOpportunityAmount("1000");
		Assert.assertEquals(enteredAmount, "1000", "Entered opportunity amount does not match expected.");
	}

	@Test(priority = 17, groups = { "LeadCreate", "Sanity" })
	public void testSelectCurrency() {
		String selectedCurrency = leadPage.selectCurrency("USD");
		Assert.assertEquals(selectedCurrency, "USD", "Selected currency does not match expected.");
	}

	@Test(priority = 18, groups = { "LeadCreate", "Sanity" })
	public void testEnterCampaign() {
		String enteredCampaign = leadPage.enterCampaign("Campaign X");
		Assert.assertEquals(enteredCampaign, "Campaign X", "Entered campaign does not match expected.");
	}

	@Test(priority = 19, groups = { "LeadCreate", "Sanity" })
	public void testSelectIndustry() {
		String selectedIndustry = leadPage.selectIndustry("Technology");
		Assert.assertEquals(selectedIndustry, "Technology", "Selected industry does not match expected.");
	}

	@Test(priority = 20, groups = { "LeadCreate", "Sanity" })
	public void testEnterDescription() {
		String enteredDescription = leadPage.enterDescription("This is a test description.");
		Assert.assertEquals(enteredDescription, "This is a test description.",
				"Entered description does not match expected.");
	}

	@Test(priority = 21, groups = { "LeadCreate", "Sanity" })
	public void testEnterAssignedUser() {
		String enteredAssignedUser = leadPage.enterAssignedUser("johndoe");
		Assert.assertEquals(enteredAssignedUser, "johndoe", "Entered assigned user does not match expected.");
	}

	@Test(priority = 22, groups = { "LeadCreate", "Sanity" })
	public void testEnterAddTeam() {
		String enteredTeam = leadPage.enterAddTeam("Team A");
		Assert.assertEquals(enteredTeam, "Team A", "Entered team does not match expected.");
	}

	@Test(priority = 23, groups = { "LeadCreate", "Sanity" })
	public void testClickSelectTeamButton() {
		boolean isClicked = leadPage.clickSelectTeamButton();
		Assert.assertTrue(isClicked, "Failed to click Select Team button.");
	}

	@Test(priority = 24, groups = { "LeadCreate", "Sanity" })
	public void testEnterCreatedAccount() {
		String enteredAccount = leadPage.enterCreatedAccount("Created Account X");
		Assert.assertEquals(enteredAccount, "Created Account X", "Entered created account does not match expected.");
	}

	@Test(priority = 25, groups = { "LeadCreate", "Sanity" })
	public void testEnterCreatedContact() {
		String enteredContact = leadPage.enterCreatedContact("John Doe");
		Assert.assertEquals(enteredContact, "John Doe", "Entered created contact does not match expected.");
	}

	@Test(priority = 26, groups = { "LeadCreate", "Sanity" })
	public void testEnterCreatedOpportunity() {
		String enteredOpportunity = leadPage.enterCreatedOpportunity("Opportunity 123");
		Assert.assertEquals(enteredOpportunity, "Opportunity 123",
				"Entered created opportunity does not match expected.");
	}
}
