package TestNGTestMarathon.testMarathon.copy;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovieTicketBooking {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pvrcinemas.com/");

		// select location
		// driver.findElement(By.xpath("//span[text()='Chennai']")).click(); //--chn
		// driver.findElement(By.xpath("//h6[text()='Chennai']")).click(); //--chn

		// select theater.
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX Prozone Mall')]")).click();

		// select date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();

		// select movie.
		driver.findElement(By.xpath("//span[text()='VIRUNDHU']/parent::li[@class='p-dropdown-item']")).click();

		// Select Timing
		driver.findElement(By.xpath("//span[contains(text(),'01:15 PM')]")).click();

		// book
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();

		// seat selection and price
		WebElement SeatInfo = driver.findElement(By.xpath("//span[@id='CL.CLUB|J:10']"));
		SeatInfo.click();
		String PrintSeat = SeatInfo.getText();
		System.out.println("Seat Info is:" + PrintSeat);
		String GrandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("Grand Total is " + GrandTotal);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
}