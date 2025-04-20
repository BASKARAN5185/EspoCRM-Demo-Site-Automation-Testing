package pageObjectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import MyProject.demo.us.espocrm.com.BaseClass;

public class LoginPage extends BaseClass {

	// initial the remote web driver in the base class
	public LoginPage(RemoteWebDriver driver) {

		BaseClass.driver = driver;

	}

	// Login Page Locators
	By username = By.xpath("(//div[@class='form-group']//select)[1]");
	By fieldlanguage = By.xpath("(//select[@class='form-control'])[2]");
	By btnlogin = By.id("btn-login");

	// Login Page Action methods
	public void selectUser(String user) {
		WebElement languageDropdown = driver.findElement(username);
		Select select = new Select(languageDropdown);
		select.selectByVisibleText(user);
	}

	public void selectlanguvage(String lan) {

		WebElement languageDropdown = driver.findElement(fieldlanguage);
		Select select = new Select(languageDropdown);
		select.selectByVisibleText(lan); // Ensure the text matches exactly

	}

	public void clickTheLogin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-login")));
		element.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
