package testBase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class MyTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\xmedia\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = null;
		String browser = "firefox";
		if (browser.equalsIgnoreCase("charome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.print("Browser not found ");
		}

		driver.get("https://demo.us.espocrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // WebDriverWait for waiting explicit
																				// elements

		try {
			for (int Page = 0; Page <= 33; Page++) {

				WebElement Lang = wait
						.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"field-language\"]")));
				Select LDD = new Select(Lang);
				LDD.selectByIndex(Page);
				int page1 = Page;

				if (Page == page1) {
					System.out.println("Index and Name : " + Page + " " + Lang.getText());
					driver.findElement(By.id("btn-login")).click();

					for (int menus = 1; menus <= 5; menus++) {
						WebElement Customername = wait.until(ExpectedConditions.elementToBeClickable(
								By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/div[2]/button[" + menus + "]")));
						Customername.click();

						if (menus <= 5) {
							try {
								// Explicit wait for the element to be visible before trying to interact
								WebElement Customername1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By
										.xpath("//*[@id=\"dashlet-d915388\"]/div[2]/div/div/ul/li[1]/div[2]/span[1]/a")));
								System.out.println(Customername1.getText()); // Assuming you want to print the text of
																				// the element
							} catch (Exception e) {
								System.out.println("Element is not visible or not found for menus: " + menus);
							}
						} else {
							System.out.println("Not Displayed for menus: " + menus);
						}
					}

					// After the menus loop, proceed to click the dropdown and navigate
					driver.findElement(By.id("nav-menu-dropdown")).click();
					driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div[2]/div/ul/li[4]/ul/li[10]/a")).click();
				} else {
					System.out.println("Page " + Page + " not working");
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			// driver.quit(); // Make sure to quit the driver after execution
		}
	}
}
