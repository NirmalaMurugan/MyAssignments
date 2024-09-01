package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//mutiple interface classes can be invoked using ',' and call its methods using objs of concrete class.

public class JavaConnection extends MySqlConnection implements DatabaseConnection,Payments  {

	public static void main(String[] args) {
		
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.executeUpdate();
		JC.disconnect();
		JC.executeQuery();
		JC.cashOnDelivery();
		
		//ChromeDriver driver =new ChromeDriver();
	}
	
	void executeQuery() {
		System.out.println("ExecuteQuery is implemented and executed from JavaConnection class");
	}

	@Override
	public void connect() {
		System.out.println("Connected interface methods using concrete class");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DisConnected interface methods using concrete class");
		ChromeDriver driver = new ChromeDriver();
		driver.close();
		
	}

	@Override
	public void executeUpdate() {
		 System.out.println("Executed Update interface methods using concrete class");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 List<WebElement> Count = driver.findElements(By.tagName("div"));
			int size = Count.size();
			System.out.println("No of a tags in the weebpage: " +size);

			for (int i=0;i< Count.size(); i++) {

				String text = Count.get(i).getText();
				System.out.println(text);
				
			}
		
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Interface method cod is displayed");
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startApp(String URL) {
		// TODO Auto-generated method stub
		
	}

}
