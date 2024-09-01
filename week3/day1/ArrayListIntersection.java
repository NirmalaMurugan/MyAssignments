package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListIntersection {

	public static void main(String[] args) {

		// Initialize int array with values.
		int[] Array1 = { 3, 2, 11, 4, 6, 7 };
		int[] Array2 = { 1, 2, 8, 4, 9, 7 };

		// copying List elts to ArrayList:
		// 1. Iterate each elt from list
		// 2. Add method to add elements to array list.
		List<Integer> ArrayList1 = new ArrayList<Integer>();
		for (Integer i : Array1) { // for each loop -->arrayList
			ArrayList1.add(i);
		}

		List<Integer> ArrayList2 = new ArrayList<Integer>();
		for (Integer i : Array2) {
			ArrayList2.add(i);
		}

		System.out.println(ArrayList1 + " " + " " + ArrayList2);//no need loop to disp just the var.

		// list has sort method
		// set has TreeSet method
		Collections.sort(ArrayList1);
		Collections.sort(ArrayList2);

		// array --> use LENGTH to find size.
		int Size1 = Array1.length;
		int Size2 = Array2.length;
		System.out.println("length of the list :" + Size1 + "," + Size2);
		// ArrayList --> use SIZE to find size.
		int AL1Size = ArrayList1.size();
		int AL2Size = ArrayList2.size();
		System.out.println("length of the list :" + AL1Size + "," + AL2Size);

		ArrayList2.retainAll(ArrayList1);// method to remove duplicates and print only common values.
		System.out.println(ArrayList2);

	}

}
