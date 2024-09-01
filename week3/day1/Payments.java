package week3.day1;

public interface Payments {
//public keyword already specified in concrete class during implementation.
	void cashOnDelivery();

	void upiPayments();

	public void cardPayments();

	public void internetBanking();

	void startApp(String URL);
}
