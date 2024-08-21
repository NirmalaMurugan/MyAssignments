package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClasstFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://en-gb.facebook.com/");
		
		//xpath: //a[@data-testid='open-registration-form-button']
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("9000000000");
		driver.findElement(By.id("password_step_input")).sendKeys("TestLeaf1");
				
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("10");
		
		Select Month = new Select(driver.findElement(By.id("Month")));
		Month.selectByValue("OCT");
		
		Select Year = new Select(driver.findElement(By.id("Year")));
		Year.selectByValue("2010");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		

	}

}
