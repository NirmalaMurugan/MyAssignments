package TestNGTestMarathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day1.IntegrationWithTCDynamic;

public class PSMSalesforceTestng {

	public RemoteWebDriver driver;
	public String Excelfilename;

	@DataProvider(name = "getData")

	public String[][] setValue() throws IOException {
		return ExcelData.readExcel(Excelfilename);
	}

	@Parameters({ "url", "username", "password", "browser" })

	@BeforeMethod
	public void LoginSalesforce(String url, String Uname, String Password, String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath(
				"//div[@class='slds-icon-waffle']//ancestor::div[@class='appLauncher slds-context-bar__icon-action']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Opportunities']/ancestor::one-app-nav-bar-item-root")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void CloseDriver() {
		driver.close();

	}

}
