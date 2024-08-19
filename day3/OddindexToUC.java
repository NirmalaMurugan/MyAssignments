package week1.day3;

public class OddindexToUC {

	public static void main(String[] args) {
		String test = "changename";
		char[] CharArray = test.toCharArray();
		System.out.println("Given text: "+test);
		System.out.print("Odd Index changed to Upper case: ");
		for (int i = 0; i < CharArray.length; i++) {

			if (i % 2 != 0) {
				// char test2 = CharArray[i];
				char upperCase = Character.toUpperCase(CharArray[i]);
				System.out.print(upperCase);
			} else {
				System.out.print(CharArray[i]);
			}
		}

	}

}
