package MyProject.demo.us.espocrm.com;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static RemoteWebDriver driver;

	@BeforeTest
	public void setUpTheBrowser() {

		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions();

		// Add desired Chrome options
		// options.addArguments("--headless"); // Run in headless mode
		options.addArguments("--disable-gpu"); // Disable GPU acceleration
		options.addArguments("--window-size=1920x1080"); // Set window size
		options.addArguments("--incognito"); // Open in incognito mode
		options.addArguments("--disable-notifications"); // Disable notifications
		options.addArguments("--no-sandbox"); // Disable the sandbox (use with caution)
		options.addArguments("--disable-extensions"); // Disable extensions
		options.addArguments("--start-maximized"); // Start maximized

		driver = new ChromeDriver(options);
		driver.get("https://demo.us.espocrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@AfterTest
	public void teardown() {

		driver.quit();

	}

	public String getPageURl() {
		String geturl = driver.getCurrentUrl();
		return geturl;

	}
}