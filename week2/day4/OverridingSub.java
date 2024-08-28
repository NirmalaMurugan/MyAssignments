package week2.day4;

public class OverridingSub extends OverridingSuper {

	public static void main(String[] args) {
		OverridingSub OR= new OverridingSub();
		OR.takeSnap();
		OR.reportStep("Message","Status",0);

	}
		public static void takeSnap() {
			System.out.println("Method take snap displayed after overriding in Sub class");
			
		

	}

public static void reportStep(String msg, String status, int snap) {
	// TODO Auto-generated method stub
	System.out.println("3 arguments displayed from sub class");
}

}
