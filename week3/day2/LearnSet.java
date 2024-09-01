package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSet {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("ear buds");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// to display price of earcbuds.
		List<WebElement> CountEarBudPrice = driver.findElements(By.className("a-price-whole"));
		int size = CountEarBudPrice.size();
		System.out.println("No of a earbuds in the weebpage: " + size);

		// Creating an empty array -->disp price.
		List<Integer> EarBudPrice = new ArrayList<Integer>();
		for (WebElement P : CountEarBudPrice) {
			String text = P.getText();
			System.out.println(text);

			// checking if string value empty/null ignore and then parseint is performed.
			if (!text.isEmpty()) {
				// to eliminate comma in price and to display as string[price is a Text value].
				String PriceVal = text.replaceAll(",", "");
				System.out.println(PriceVal);
				// convert the string value into integer
				int parseInt = Integer.parseInt(PriceVal);
				System.out.println(parseInt);
				EarBudPrice.add(parseInt);
			}
		}
		// Convert List to Set --> removes duplicates and sorts to ascending.
		Set<Integer> value = new TreeSet<Integer>(EarBudPrice);
		System.out.println(value);
		int Setsize = value.size();
		System.out.println(Setsize);
		if (size != Setsize) {
			System.out.println("Duplicate values");
		} else {
			System.out.println("No Duplicate Values");
		}
	}
}
