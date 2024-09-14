package TestNGTestMarathon.testMarathon.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class Servicenow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev186929.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		//Shadow tagged elements(ALL, Service Catalogue) can't be found as normal Web elt.  
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//div[text(),'All']").click(); 
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//Click mobile --> Apple iphone13pro -->lost/broken: Yes
		driver.findElement(By.xpath("//div/a/table/tbody/tr/td//h2[contains(text(),'Mobiles')]")).click();
				//div[@class='homepage_category_only']/a/table/tbody/tr/td//h2[contains(text(),'Mobiles')]

	}

}
