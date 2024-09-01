package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 1. loacate the elt For Prompt Alert:
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Handling Prompt alert
		Alert al = driver.switchTo().alert();
		al.sendKeys("Nemo"); //sending input msg directly to alert
		String text = al.getText(); 
		System.out.println(text);// Visible text/prompt 
		Thread.sleep(5000);
		al.accept(); //ok
		String textmsg = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();// location of text sent.
		System.out.println(textmsg);// Entered text displayed
		
		//2. simple Alert: 

	}

}
