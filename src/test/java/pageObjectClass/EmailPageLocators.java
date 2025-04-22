package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import MyProject.demo.us.espocrm.com.BaseClass;

public class EmailPageLocators extends BaseClass {
    
    public EmailPageLocators(RemoteWebDriver driver) {
        BaseClass.driver = driver;
    }

    // Header section locators
    By headerTitle = By.cssSelector(".header-title h3"); 
    By composeEmailButton = By.cssSelector("a[data-name='composeEmail']");
    By dropdownButton = By.cssSelector(".dropdown-toggle"); 
    By archiveEmailOption = By.xpath("//a[text()='Archive Email']");
    By emailTemplatesOption = By.xpath("//a[text()='Email Templates']");
    By foldersOption = By.xpath("//a[text()='Folders']");
    By groupEmailFolderOption = By.xpath("//a[text()='Group Folders']");
    By filtersOption = By.xpath("//a[text()='Filters']");
    By personalEmailAccountsOption = By.xpath("//a[text()='Personal Email Accounts']");
    By groupEmailAccountsOption = By.xpath("//a[text()='Group Email Accounts']");

    // Search section locators
    By searchInput = By.cssSelector("input.text-filter");
    By searchButton = By.cssSelector(".search .btn-search");
    By filterDropdownButton = By.cssSelector(".add-filter-button");
    By filterList = By.cssSelector(".filter-list");
    By accountFilterOption = By.xpath("//a[text()='Account']");
    By dateSentFilterOption = By.xpath("//a[text()='Date Sent']");
    By emailAddressFilterOption = By.xpath("//a[text()='Email Address']");
    By fromFilterOption = By.xpath("//a[text()='From']");
    By toFilterOption = By.xpath("//a[text()='To']");
    By isNotReadFilterOption = By.xpath("//a[text()='Is Not Read']");
    By isNotRepliedFilterOption = By.xpath("//a[text()='Is Not Replied']");
    By statusFilterOption = By.xpath("//a[text()='Status']");
    By parentFilterOption = By.xpath("//a[text()='Parent']");
    By teamsFilterOption = By.xpath("//a[text()='Teams']");
    By sentByFilterOption = By.xpath("//a[text()='Sent by (User)']");
    By usersFilterOption = By.xpath("//a[text()='Users']");
    By createdAtFilterOption = By.xpath("//a[text()='Created At']");
    By hasAttachmentFilterOption = By.xpath("//a[text()='Has Attachment']");
    By nameFilterOption = By.xpath("//a[text()='Name (Subject)']");
    By bodyFilterOption = By.xpath("//a[text()='Body']");
    By bodyPlainFilterOption = By.xpath("//a[text()='Body (Plain)']");
    By inboundEmailsFilterOption = By.xpath("//a[text()='Group Accounts']");
    By emailAccountsFilterOption = By.xpath("//a[text()='Personal Accounts']");

    // Folder list section locators
    By allFolderLink = By.cssSelector("li[data-id='all'] .side-link");
    By inboxFolderLink = By.cssSelector("li[data-id='inbox'] .side-link");
    By importantFolderLink = By.cssSelector("li[data-id='important'] .side-link");
    By sentFolderLink = By.cssSelector("li[data-id='sent'] .side-link");
    By myPersonalFolderLink = By.cssSelector("li[data-id='65f1958d76139321f'] .side-link");
    By salesGroupFolderLink = By.cssSelector("li[data-id='group:65f195fc74eebb3f6'] .side-link");
    By archiveFolderLink = By.cssSelector("li[data-id='archive'] .side-link");
    By draftsFolderLink = By.cssSelector("li[data-id='drafts'] .side-link");
    By trashFolderLink = By.cssSelector("li[data-id='trash'] .side-link");

    // List section locators
    By actionsButton = By.cssSelector(".actions-button");
    By paginationNextButton = By.cssSelector("a[data-page='next']");
    By paginationPreviousButton = By.cssSelector("a[data-page='previous']");
    By pageInputField = By.cssSelector(".page-input");

    // Settings section locators
    By settingsButton = By.cssSelector(".settings-container .dropdown-toggle");
    By toggleColumnParent = By.xpath("//a[@data-action='toggleColumn'][@data-name='parent']");
    By toggleColumnDateSent = By.xpath("//a[@data-action='toggleColumn'][@data-name='dateSent']");
    By columnResizeOption = By.xpath("//a[@data-action='toggleColumnResize']");

    // No data section locators
    By noDataMessage = By.cssSelector(".no-data");
    
    // Header section methods
    public boolean clickHeaderTitle() {
        driver.findElement(headerTitle).click();
        return true;
    }

    public boolean clickComposeEmailButton() {
        driver.findElement(composeEmailButton).click();
        return true;
    }

    public boolean clickDropdownButton() {
        driver.findElement(dropdownButton).click();
        return true;
    }

    public boolean clickArchiveEmailOption() {
        driver.findElement(archiveEmailOption).click();
        return true;
    }

    public boolean clickEmailTemplatesOption() {
        driver.findElement(emailTemplatesOption).click();
        return true;
    }

    public boolean clickFoldersOption() {
        driver.findElement(foldersOption).click();
        return true;
    }

    public boolean clickGroupEmailFolderOption() {
        driver.findElement(groupEmailFolderOption).click();
        return true;
    }

    public boolean clickFiltersOption() {
        driver.findElement(filtersOption).click();
        return true;
    }

    public boolean clickPersonalEmailAccountsOption() {
        driver.findElement(personalEmailAccountsOption).click();
        return true;
    }

    public boolean clickGroupEmailAccountsOption() {
        driver.findElement(groupEmailAccountsOption).click();
        return true;
    }

    // Search section methods
    public boolean enterSearchText(String text) {
        driver.findElement(searchInput).sendKeys(text);
        return true;
    }

    public boolean clickSearchButton() {
        driver.findElement(searchButton).click();
        return true;
    }

    public boolean clickFilterDropdownButton() {
        driver.findElement(filterDropdownButton).click();
        return true;
    }

    public boolean selectAccountFilterOption() {
        driver.findElement(accountFilterOption).click();
        return true;
    }

    public boolean selectDateSentFilterOption() {
        driver.findElement(dateSentFilterOption).click();
        return true;
    }

    public boolean selectEmailAddressFilterOption() {
        driver.findElement(emailAddressFilterOption).click();
        return true;
    }

    public boolean selectFromFilterOption() {
        driver.findElement(fromFilterOption).click();
        return true;
    }

    public boolean selectToFilterOption() {
        driver.findElement(toFilterOption).click();
        return true;
    }

    public boolean selectIsNotReadFilterOption() {
        driver.findElement(isNotReadFilterOption).click();
        return true;
    }

    public boolean selectIsNotRepliedFilterOption() {
        driver.findElement(isNotRepliedFilterOption).click();
        return true;
    }

    public boolean selectStatusFilterOption() {
        driver.findElement(statusFilterOption).click();
        return true;
    }

    public boolean selectParentFilterOption() {
        driver.findElement(parentFilterOption).click();
        return true;
    }

    public boolean selectTeamsFilterOption() {
        driver.findElement(teamsFilterOption).click();
        return true;
    }

    public boolean selectSentByFilterOption() {
        driver.findElement(sentByFilterOption).click();
        return true;
    }

    public boolean selectUsersFilterOption() {
        driver.findElement(usersFilterOption).click();
        return true;
    }

    public boolean selectCreatedAtFilterOption() {
        driver.findElement(createdAtFilterOption).click();
        return true;
    }

    public boolean selectHasAttachmentFilterOption() {
        driver.findElement(hasAttachmentFilterOption).click();
        return true;
    }

    public boolean selectNameFilterOption() {
        driver.findElement(nameFilterOption).click();
        return true;
    }

    public boolean selectBodyFilterOption() {
        driver.findElement(bodyFilterOption).click();
        return true;
    }

    public boolean selectBodyPlainFilterOption() {
        driver.findElement(bodyPlainFilterOption).click();
        return true;
    }

    public boolean selectInboundEmailsFilterOption() {
        driver.findElement(inboundEmailsFilterOption).click();
        return true;
    }

    public boolean selectEmailAccountsFilterOption() {
        driver.findElement(emailAccountsFilterOption).click();
        return true;
    }

    // Folder list section methods
    public boolean clickAllFolderLink() {
        driver.findElement(allFolderLink).click();
        return true;
    }

    public boolean clickInboxFolderLink() {
        driver.findElement(inboxFolderLink).click();
        return true;
    }

    public boolean clickImportantFolderLink() {
        driver.findElement(importantFolderLink).click();
        return true;
    }

    public boolean clickSentFolderLink() {
        driver.findElement(sentFolderLink).click();
        return true;
    }

    public boolean clickMyPersonalFolderLink() {
        driver.findElement(myPersonalFolderLink).click();
        return true;
    }

    public boolean clickSalesGroupFolderLink() {
        driver.findElement(salesGroupFolderLink).click();
        return true;
    }

    public boolean clickArchiveFolderLink() {
        driver.findElement(archiveFolderLink).click();
        return true;
    }

    public boolean clickDraftsFolderLink() {
        driver.findElement(draftsFolderLink).click();
        return true;
    }

    public boolean clickTrashFolderLink() {
        driver.findElement(trashFolderLink).click();
        return true;
    }

    // List section methods
    public boolean clickActionsButton() {
        driver.findElement(actionsButton).click();
        return true;
    }

    public boolean clickPaginationNextButton() {
        driver.findElement(paginationNextButton).click();
        return true;
    }

    public boolean clickPaginationPreviousButton() {
        driver.findElement(paginationPreviousButton).click();
        return true;
    }

    public boolean enterPageNumber(String pageNumber) {
        driver.findElement(pageInputField).sendKeys(pageNumber);
        return true;
    }

    // Settings section methods
    public boolean clickSettingsButton() {
        driver.findElement(settingsButton).click();
        return true;
    }

    public boolean toggleColumnParent() {
        driver.findElement(toggleColumnParent).click();
        return true;
    }

    public boolean toggleColumnDateSent() {
        driver.findElement(toggleColumnDateSent).click();
        return true;
    }

    public boolean toggleColumnResize() {
        driver.findElement(columnResizeOption).click();
        return true;
    }

    // No data section methods
    public boolean isNoDataMessageDisplayed() {
        return driver.findElement(noDataMessage).isDisplayed();
    }


}
