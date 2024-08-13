package week1.day2;

public class IsPrime {

	public static void isPrimeNumber(int num) {
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println("The given number " + num + " is not prime");
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("The number " + num + " is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The number " + num + " is prime");
		}
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IsPrime P=new IsPrime();
//		P.isPrimeNumber(31);
		isPrimeNumber(53);// method is static no instance created.
	}
}
