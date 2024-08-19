package week1.day3;

//import java.util.Arrays;

public class ReverseOddString {

	public static void main(String[] args) {
		String Input = "I am a software tester";
		String[] NewArray = Input.split(" ");
		// System.out.println(Arrays.toString(NewArray));
		int len = NewArray.length;
		
		// to disp odd words
		for (int k = 0; k < len; k += 2) {
			System.out.print(NewArray[k] + " ");
		}
		// to disp even words
		for (int i = 1; i < len; i += 2) {

			String NewValue = NewArray[i]; // string array to string

			char[] ch = NewValue.toCharArray();// string to char array
			for (int j = ch.length - 1; j >= 0; j--) {// reverse the string

				System.out.print(ch[j]);

			}
			System.out.print(" ");

		}

	}

}

//*------------------------------*Using STRINGBUILDER CLASS*----------------------------*
/*
 * package week1.day3;
 * 
 * 
 * import java.util.Arrays;
 * 
 * public class ReverseOddString {
 * 
 * public static void main(String[] args) { String Input =
 * "I am a software tester"; String[] NewArray = Input.split(" "); int len =
 * NewArray.length;
 * 
 * for (int i = 1; i < len; i += 2) NewArray[i] = new
 * StringBuilder(NewArray[i]).reverse().toString();
 * System.out.println("The reversal of Odd Index of the string is: "
 * +String.join(" ", NewArray));
 * 
 * } }
 */