package TestNGTestMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpportunityEdit extends PSMSalesforceTestng {
	@BeforeTest
	public void setValues() {
		Excelfilename = "EditSF"; // excel stored inside data folder in eclipse.
	}

	@Test(dataProvider = "getData")
	// public void OpportunityEdit(String Name,String Description) throws
	// InterruptedException {
	public void OpportunityEdit(String Name, String Description) throws InterruptedException {
		System.out.println("Executing Edit in oppurtuity ");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebElement search = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Opportunity-search-input']")));
		search.sendKeys(Name);
		Thread.sleep(5000);

		WebElement dropdown = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//*[name()='svg' and @class='slds-icon slds-icon-text-default slds-icon_xx-small']/ancestor::span[@class='slds-icon_container slds-icon-utility-down']")));
		dropdown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-aura-class='uiMenuItem']//a")).click();
		Thread.sleep(3000);

		WebElement Date = driver.findElement(By.xpath(
				"//lightning-input[@class='slds-form-element slds-form-element_stacked']/lightning-datepicker/div/div/input[@name='CloseDate']"));
		Date.click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//td/span[text()='14']")).click();
		Thread.sleep(3000);

		WebElement scroll = driver.findElement(By.xpath("//span[text()='Last Modified By']"));
		Actions ac = new Actions(driver);
		ac.scrollToElement(scroll).perform();
		Thread.sleep(3000);

		WebElement Stage = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Stage']")));
		Stage.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();

		WebElement DeliveryStatus = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@aria-label='Delivery/Installation Status']")));
		DeliveryStatus.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='In progress']")).click();

		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(Description);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();

		WebElement VerifyStage = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
		if (VerifyStage.getText().equalsIgnoreCase("Perception Analysis")) {
			System.out.println("Stage is Verified to be Perception Analysis");
		} else {
			System.out.println("Stage is Verification failed");
		}
	}

	@AfterMethod
	public void CloseDriver() {
		// driver.close();

	}
}