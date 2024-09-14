package TestNGTestMarathon.testMarathon.copy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {

		// To disable all notifications:
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		// open browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");

		// close dialogue box.
		driver.findElement(By.xpath("//div[@class='wzrk-alert wiz-show-animate']//button[@id='wzrk-cancel']")).click();

		WebElement Brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions MouseHover1 = new Actions(driver);
		MouseHover1.moveToElement(Brands).perform();

		WebElement WatchAccessories = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions MouseHover2 = new Actions(driver);
		MouseHover2.moveToElement(WatchAccessories).perform();

		driver.findElement(By.xpath("//div[text()='Casio']")).click();

		WebElement Sort = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select opt1 = new Select(Sort);
		opt1.selectByIndex(3);

		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		Thread.sleep(3000);
		List<WebElement> PriceList = driver
				.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		System.out.println(PriceList.size());
		Thread.sleep(3000);
		for (WebElement Price : PriceList) {
			String MobilePrice = Price.getText();
			System.out.print(MobilePrice);
			System.out.print(", ");
		}
		Thread.sleep(3000);

		// move to next window.
		driver.findElement(By.className("ProductModule__dummyDiv")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ChildWindow = new ArrayList<String>(windowHandles);
		Thread.sleep(3000);
		driver.switchTo().window(ChildWindow.get(1));
		Thread.sleep(3000);
		System.out.println("\n" + "Switched to child window " + "\n" + "Title: " + driver.getTitle());

		// Add item to cart
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		Thread.sleep(3000);
		List<WebElement> CartItems = driver.findElements(By.xpath("//div[@class='CartItemForDesktop__base ']"));
		System.out.println("Items Added in the cart: " + CartItems.size());

		// Compare Prices
		WebElement FinalPrice = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']"));
		WebElement WatchPrice = driver
				.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']"));
		if (FinalPrice.equals(WatchPrice)) {
			System.out.println("Both the prices matches");
		} else {
			System.out.println("Both the prices matches");
		}

		// Take Snapshot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File path = new File("./snaps/WatchResultPage.png");
		FileUtils.copyFile(screenshot, path);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
