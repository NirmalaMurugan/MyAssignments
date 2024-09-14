package TestNGTestMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpportunityDelete extends PSMSalesforceTestng {

	@BeforeTest
	public void setValues() {
		Excelfilename = "DeleteSF"; // excel stored inside data folder in eclipse.
	}

	@Test(dataProvider = "getData")

	public void OpportunityDelete(String Name) throws InterruptedException {
		System.out.println("Executing Delete in oppurtuity");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebElement search = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Opportunity-search-input']")));
		search.sendKeys(Name);
		Thread.sleep(5000);
		System.out.println("Printhere if executed1");
		WebElement dropdown = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//*[name()='svg' and @class='slds-icon slds-icon-text-default slds-icon_xx-small']/ancestor::span[@class='slds-icon_container slds-icon-utility-down']")));
		dropdown.click();
		System.out.println("Printhere if executed");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Delete']/parent::a")).click();
		driver.findElement(By.xpath(
				"//div[@class='forceModalActionContainer--footerAction forceModalActionContainer']/button/span[text()='Delete']"))
				.click();
		Thread.sleep(3000);
	}
}
