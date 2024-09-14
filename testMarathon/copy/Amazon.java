package TestNGTestMarathon.testMarathon.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();

		WebElement resultCount = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing')]"));
		String count = resultCount.getText();

		System.out.println(count);
		driver.findElement(By.xpath("(//span[text()='American Tourister'])[3]")).click();
		// driver.findElement(By.xpath("(//span[contains(text(),'COSMUS')]")).click();
		WebElement NewArrival = driver.findElement(By.id("s-result-sort-select"));
		Select NewArrivalOption = new Select(NewArrival);
		NewArrivalOption.selectByVisibleText("Newest Arrivals");

		WebElement FirstBag = driver.findElement(By.xpath(
				"//a[contains(@class,'a-link-normal')]/span[contains(text(),'Chupa Chups, 22L Volume School Backpack')]"));
		String Bagname = FirstBag.getText();
		WebElement FirstBagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String DiscountedPrice = FirstBagPrice.getText();
		System.out.println("Bagname: " + Bagname + "\n" + "DiscountedPrice: " + DiscountedPrice);

		System.out.println(driver.getTitle());
		driver.close();
	}

}
