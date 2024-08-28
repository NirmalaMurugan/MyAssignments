package week2.day4;

public class Chrome extends Browser{

	public String browserName;

	public static void main(String[] args) {
		
		Chrome C= new Chrome();
		C.openURL();
		System.out.println(C.browserName);
		C.closeBrowser();
		C.navigateBack();
		C.clearCache();
		C.openIncognito();


	}

	public static void clearCache() {
		System.out.println("Cleared cache in Chrome class");
		
	}

	public static void openIncognito() {
		System.out.println("opened Incognito in Chrome class");
		
	}

}
