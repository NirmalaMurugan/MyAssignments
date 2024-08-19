package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Account creation
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("User");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TEST123");
				//driver.findElement(By.className("smallSubmit")).click();
				Thread.sleep(2000);
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
