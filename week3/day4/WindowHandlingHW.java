package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHW {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		//capture title of new window.
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		System.out.println(driver.getTitle());
		
		
		Set <String> AllWindows = driver.getWindowHandles();
		System.out.println(AllWindows);
		
		//Converting set into list [for n childs]
		List<String> ChildWindow = new ArrayList<String>(AllWindows);
		
		//switch to child tab
		driver.switchTo().window(ChildWindow.get(1));	
		String title = driver.getTitle();
		System.out.println("Child window name :"+title);
		System.out.println(ChildWindow);
		
		// switch and close the parentWindow
				driver.switchTo().window(ChildWindow.get(0));
				driver.close();
				System.out.println("parent window closed successfully");
				
	}

}
