package week1.day2;

public class Fibonacci {

	public void fibonacciSeries(int limit, int num1, int num2) {
		int sum;
		System.out.println("fibonnacci Series is: " + num1 + "\n" + "fibonnacci Series is: " + num2);
		for (int i = 2; i < limit; ++i) {
			sum = num1 + num2;
			System.out.println("fibonnacci Series is: " + sum);
			num1 = num2;
			num2 = sum;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci Fs = new Fibonacci();
		Fs.fibonacciSeries(8, 0, 1);

	}

}
