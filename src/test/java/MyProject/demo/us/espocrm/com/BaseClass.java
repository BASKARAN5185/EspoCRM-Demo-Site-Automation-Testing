package MyProject.demo.us.espocrm.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
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
	    options.addArguments("--headless"); // Run in headless mode
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
	
	public String captureScreen(String testName) throws IOException {
		// Take the screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Define the directory where screenshots will be stored
		String screenshotDirectory = "C:\\Users\\xmedia\\Desktop\\Automation Test Report\\Screenshots\\" + testName;

		// Create a new directory if it does not exist
		File directory = new File(screenshotDirectory);
		if (!directory.exists()) {
			directory.mkdirs();
		}

		// Define the file path for the screenshot
		String filePath = screenshotDirectory + "\\screenshot.png";
		File destination = new File(filePath);

		// Copy the screenshot to the destination path
		FileHandler.copy(screenshot, destination);

		return destination.getAbsolutePath(); // Return the path to the screenshot
	}

	
}