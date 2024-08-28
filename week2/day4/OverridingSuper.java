package week2.day4;

import static week2.day4.OverridingSuper.reportStep;

public class OverridingSuper {

	public static void main(String[] args) {
		takeSnap();
		reportStep();
		reportStep("Message","Status",0);

	}

	protected static void reportStep() {
		// TODO Auto-generated method stub
		System.out.println("Method report step is displayed from super class");
		
	}

	public static void takeSnap() {
		System.out.println("Method before overriding in super class");
		
	}

public static void reportStep(String msg, String status, int snap) {
	// TODO Auto-generated method stub
	System.out.println("3 arguments displayed from superclass");
}

}
