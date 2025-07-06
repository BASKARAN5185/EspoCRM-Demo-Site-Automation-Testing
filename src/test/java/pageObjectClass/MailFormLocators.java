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

	public void toMailEntered(String ToMail) {
		WebElement Field = driver.findElement(To);
		Field.clear();
		Field.sendKeys(ToMail);
	}

	public void CCEntered(String cc) {
		WebElement Field = driver.findElement(CC);
		Field.clear();
		Field.sendKeys(cc);
	}

	public void BCCEntered(String bcc) {
		WebElement Field = driver.findElement(Bcc);
		Field.clear();
		Field.sendKeys(bcc);
	}

	public boolean Parentselect(String parent) {
		WebElement ParentField = driver.findElement(Parent);
		ParentField.sendKeys(parent);
		driver.findElement(By.xpath("//*[text()='AFP Supply']")).click();
		return true;
	}

	public void templetselect(String temp) {
		WebElement ParentField = driver.findElement(SelectTemplete);
		ParentField.sendKeys(temp);
		driver.findElement(By.xpath("//*[text()='Case-to-Email auto-reply']")).click();
	}

	public void subjectEntered(String subj) {
		WebElement Field = driver.findElement(Subject);
		Field.clear();
		Field.sendKeys(subj);
	}

	public void bodyEntered(String body) {
		WebElement Field = driver.findElement(Body);
		Field.clear();
		Field.sendKeys(body);
	}

	public void attchmentAdded(String attach) {
		WebElement Field = driver.findElement(Attachment);
		Field.sendKeys(attach);
	}

	public boolean sendMailButtonClick() {
		driver.findElement(Send).click();
		return true;
	}

	public boolean composeMailFillandsend(String tomail, String cc, String bcc, String par, String sub, String temp,
			String body, String attach) {
		toMailEntered(tomail);
		CCEntered(cc);
		BCCEntered(bcc);
		Parentselect(par);
		templetselect(temp);
		subjectEntered(sub);
		bodyEntered(body);
		attchmentAdded(attach);
		return sendMailButtonClick();

	}

}
