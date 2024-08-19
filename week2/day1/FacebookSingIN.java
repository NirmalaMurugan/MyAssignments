package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSingIN {

	public static void main(String[] args) throws InterruptedException {
		// initiate chrome driver
		ChromeDriver driver = new ChromeDriver();
		// maximizing browser window
		driver.manage().window().maximize();
		// fetching url
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println("Title fetch successful " + title);
		} else {
			System.out.println("Title fetch is Unsuccessful. Mismatch found " + title);
		}

		Thread.sleep(5000);
		// Entering credentials and signing up.
		driver.findElement(By.id("email")).sendKeys("nimy.fice7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("*****");
		driver.findElement(By.name("login")).click();

		// wait for few seconds
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgotten password?")).click();

		// closing the browser window
		driver.close();

	}

}
