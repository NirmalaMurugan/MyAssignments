package week3.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> Count = driver.findElements(By.tagName("div"));
		int size = Count.size();
		System.out.println("No of a tags in the weebpage: " +size);

		for (int i=0;i< Count.size(); i++) {

			String text = Count.get(i).getText();
			System.out.println(text);
			
		}

	}

}
