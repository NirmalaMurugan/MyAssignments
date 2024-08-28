package week2.day4;

public class Edge extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge E = new Edge();
		E.openURL();
		E.closeBrowser();
		E.navigateBack();
		E.takeSnap();
		E.clearCookies();

	}

	public void clearCookies() {
		System.out.println("Cleared cookies in Edge class");
		
	}

	public void takeSnap() {
		System.out.println("takeSnap  in Edge class");
		
	}

}
