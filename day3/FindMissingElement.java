package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 4, 3, 2, 8, 6, 7 };
		int len = array.length;
		System.out.println("The missing Element is: ");
		findMissingNumbers(array, len);
	}

	public static void findMissingNumbers(int[] arr, int len) {

		System.out.println();
		for (int i = 1; i <= len; i++) {
			boolean elt = false;
			Arrays.sort(arr);
			for (int num: arr)
				if (num== i) {
					elt = true;
					break;
				}
			if (!elt) {
				System.out.print(i + " ");
			}
		}
	}
}