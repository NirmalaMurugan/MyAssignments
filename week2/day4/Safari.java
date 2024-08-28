package week2.day4;

public class Safari extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari S = new Safari();
		S.openURL();
		S.closeBrowser();
		S.navigateBack();
		S.readerMode();
		S.fullScreenMode();

	}

	public void fullScreenMode() {
		System.out.println("Full Screen mode is on from Safari class");
		
	}

	public void readerMode() {
		System.out.println("Reader mode is on from Safari class");
		
	}

}
