package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestArrList {

	public static void main(String[] args) {
		int[] Array1 = { 3, 2, 11, 4, 6, 7 };
		
		//converting array to arraylist
		List<Integer> Arr = new ArrayList<Integer>();
		
		//traverse through each elt of array and add it to arraylist
		for (int i : Array1) {
			Arr.add(i);
		}
		System.out.println(Arr);
		
		//retrieve (get) last second value (size) AL --> (length)A
		int last = Arr.get(Arr.size()-2);
		System.out.println(last);
	}

}
