
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCreateAccount {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		// Login/Sign-up
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // crmsfa
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);

		// navigate through webpage
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		// Account creation
		driver.findElement(By.id("accountName")).sendKeys("DSM1234");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select opt = new Select(Industry);
		opt.selectByVisibleText("Computer Software");
		
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select opt1 = new Select(Ownership);
		opt1.selectByVisibleText("S-Corporation");

		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select opt2 = new Select(Source);
		opt2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Marketing = driver.findElement(By.name("marketingCampaignId"));
		Select opt3 = new Select(Marketing);
		opt3.selectByIndex(6);
		
		WebElement StateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt4 = new Select(StateProvince);
		opt4.selectByValue("TX");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Account created successfully");
		
		//validate Title
		String title=driver.getTitle();
		if(title.contains("opentaps"))
		{
			System.out.println("Title " +title+" is displayed correctly");
		}
		else
		{
			System.out.println("Title is Incorrect");
		}
		driver.close();
}

}
