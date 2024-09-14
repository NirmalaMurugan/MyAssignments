package TestNGTestMarathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpportunityCreate extends PSMSalesforceTestng {

	@BeforeTest
	public void setValues() {
		Excelfilename = "Opportunity"; // excel stored inside data folder in eclipse.
	}

	@Test(dataProvider = "getData")
	public void OpportunityCreate(String Name, String Amount) throws InterruptedException {

		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"(//lightning-input[@class='slds-form-element slds-form-element_stacked']/lightning-primitive-input-simple/div/div/input[@class='slds-input'])[1]"))
				.sendKeys(Name);
		driver.findElement(By.xpath(
				"//lightning-input[@class='slds-form-element_stacked slds-form-element']/lightning-primitive-input-simple/div/div/input[@name='Amount']"))
				.sendKeys(Amount);

		// Date Pick
		Thread.sleep(3000);
		WebElement Date = driver.findElement(By.xpath(
				"//lightning-input[@class='slds-form-element slds-form-element_stacked']/lightning-datepicker/div/div/input[@name='CloseDate']"));
		Date.click();
		driver.findElement(By.xpath("//span[text()='13']")).click();
		Thread.sleep(3000);

		WebElement scroll = driver.findElement(By.xpath("//span[text()='Additional Information']"));
		WebElement stageDropdown = driver.findElement(By.xpath("//label[text()='Stage']/following::button"));
		Actions ac = new Actions(driver);
		ac.scrollToElement(scroll).perform();
		stageDropdown.click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		WebElement Verifyname = driver.findElement(By.xpath(
				"//div[@class='slds-media__body']//lightning-formatted-text[text()='Salesforce Automation by Nirmala']"));
		String name = Verifyname.getText();
		if (name.equalsIgnoreCase("Salesforce Automation by Nirmala")) {
			System.out.println("Opportunity Account Verified");
		} else {
			System.out.println("Opportunity Account not Created");
		}
	}

}
