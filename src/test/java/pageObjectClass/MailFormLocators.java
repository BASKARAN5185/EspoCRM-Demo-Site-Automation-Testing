package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyProject.demo.us.espocrm.com.BaseClass;

public class MailFormLocators extends BaseClass {

	public MailFormLocators(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	By mailComposeButton = By.xpath("//a[@title='Ctrl+Space' or @data-action='composeEmail']");

	// Compose mail tab locators
	By To = By.xpath("(//input[@type='email'])[1]");
	By CC = By.xpath("(//input[@type='email'])[2]");
	By Bcc = By.xpath("(//input[@type='email'])[3]");
	By Parent = By.xpath("//input[@data-name='parentName']");
	By SelectTemplete = By.xpath("//input[@data-name='selectTemplateName']");
	By Subject = By.xpath("//input[@data-name='subject']");
	By Body = By.xpath("//div[@role='textbox']");
	By Attachment = By.xpath("//span[@class='fas fa-paperclip']");
	By Send = By.xpath("//button[@data-name='send']");

	public boolean mailComposeButtonClick() {
		driver.findElement(mailComposeButton);
		return true;
	}

	public void toMailEntered() {
		WebElement Field = driver.findElement(To);
		Field.clear();
		Field.sendKeys("guru@gmail.com");
	}

	public void CCEntered() {
		WebElement Field = driver.findElement(CC);
		Field.clear();
		Field.sendKeys("new lead");
	}

	public void BCCEntered() {
		WebElement Field = driver.findElement(Bcc);
		Field.clear();
		Field.sendKeys("New oppertunity");
	}

	public void Parentselect() {
		WebElement ParentField = driver.findElement(Parent);
		ParentField.sendKeys("AFP Supply");
		driver.findElement(By.xpath("//*[text()='AFP Supply']")).click();
	}

	public void templetselect() {
		WebElement ParentField = driver.findElement(Parent);
		ParentField.sendKeys("Case");
		driver.findElement(By.xpath("//*[text()='Case-to-Email auto-reply']")).click();
	}

	public void subjectEntered() {
		WebElement Field = driver.findElement(Subject);
		Field.clear();
		Field.sendKeys("New iphone 16 pro");
	}

	public void bodyEntered() {
		WebElement Field = driver.findElement(Body);
		Field.clear();
		Field.sendKeys("New order will be 15000 iphoe 16 promaxis ordered ");
	}

	public void attchmentAdded() {
		WebElement Field = driver.findElement(Attachment);
		Field.sendKeys("C:\\Users\\xmedia\\Downloads\\Java_Problems_QA_Tester.pdf");
	}

	public boolean sendMailButtonClick() {
		driver.findElement(Send).click();
		return true;
	}

	public boolean composeMailFillandsell() {
		toMailEntered();
		CCEntered();
		BCCEntered();
		Parentselect();
		templetselect();
		subjectEntered();
		bodyEntered();
		attchmentAdded();
		return sendMailButtonClick();

	}

}
