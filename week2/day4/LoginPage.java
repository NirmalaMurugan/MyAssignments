package week2.day4;

public class LoginPage extends BasePage {

	//Override
	void performCommonTasks() 
	{
		System.out.println("Perform Common task method from subclass is called -- Method overridden");
	}
	public static void main(String[] args) {
		LoginPage LP = new LoginPage();

		LP.findElement();
		LP.clickElement();
		LP.enterText();
		LP.performCommonTasks();
		

	} 	

}
