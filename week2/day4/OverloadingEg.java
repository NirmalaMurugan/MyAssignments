package week2.day4;

public class OverloadingEg {

	public static void main(String[] args) {

//		OverloadingEg OL = new OverloadingEg();
//		OL.reportStep("Message","status");
//		OL.reportStep("Message","Status",0);
		reportStep("Message","status");
		reportStep("Message","Status",0);
		//reportStep("Message","Status",1);// to check duplicates
	}

		public static void reportStep(String msg, String status)
		{
			System.out.println("2 arguments displayed");
		
	}

	private static void reportStep(String msg, String status, int snap) {
		// TODO Auto-generated method stub
		System.out.println("3 arguments displayed");
	}
//	private static void reportStep(String msg, String status, int snap) {
//		// TODO Auto-generated method stub
//		System.out.println("3 arguments displayed");
//	}
}
	
