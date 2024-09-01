package week3.day1;
//Abstract can have both implemented and unimplemented methods:
//its own method recordPaymentDetails implemented here
//interface methods also implemented here cashOnDelivery

//recordPaymentDetails implemented in both abstract and amazon --> method overloading so amazon (code) is displayed.
//amazon has no ovveride annotation for this coz its already implemented here.

public abstract class CanaraBank implements Payments {
	public void recordPaymentDetails() {
		System.out.println("Payment details recorded from abstract class");
	}

	public void cashOnDelivery() {
		System.out.println("Payment mode: COD");
	}

	public void upiPayments() {
	}

	public void cardPayments() {
	}

	public void internetBanking() {
	}

}
