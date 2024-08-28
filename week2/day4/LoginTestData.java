package week2.day4;

public class LoginTestData extends TestData{

	void enterUsername()
	{
		System.out.println("enterUsername from LoginTestData");
		
	}
	void enterPassword()
	{
		System.out.println("enterPassword from LoginTestData");
	}
	public static void main(String[] args) {
		
		LoginTestData LTD = new LoginTestData();
		LTD.enterUsername();
		LTD.enterPassword();
		LTD.enterCredentials();
		LTD.navigateToHomePage();
	}

}
