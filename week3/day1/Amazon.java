package week3.day1;

//Concrete Class / Execution class 
//obj instantiated, methods of interface are implemented here. @override 
// public class Amazon extends CanaraBank implements Payments{ --> canara already implements payments  not required again.
public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		Amazon A = new Amazon();
		A.cashOnDelivery();
		A.upiPayments();
		A.cardPayments();
		A.internetBanking();
		A.recordPaymentDetails();
		A.startApp("www.google.com");

	}

//	@Override
//	public void cashOnDelivery() {
//		System.out.println("Payment mode: COD");
//		
//	}

	@Override
	public void upiPayments() {

		System.out.println("Payment mode: UPI");
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment mode: CARD");

	}

	@Override
	public void internetBanking() {
		System.out.println("Payment mode: Internet Banking");

	}

	@Override
	public void startApp(String URL) {
		System.out.println("URL: " + URL);

	}
	public void recordPaymentDetails() {
		System.out.println("Payment details recorded from Concrete class");
	}


}
