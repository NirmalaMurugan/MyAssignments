package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Nirmala";
		char[] CH = value.toCharArray();
		System.out.print("The Reverseed String is : ");
		
		for (int i = CH.length - 1; i >= 0; i--) {

			System.out.print(CH[i]);
		}

	}

}
