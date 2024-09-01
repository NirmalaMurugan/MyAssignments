package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrListCommonValues {
	public static void main(String args[]) {

		List<Integer> firstList = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7,3,2)); //asList -- fixed length		
		List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		System.out.println("First array list is here: "+firstList);
		System.out.println("Second array list is here: " +secondList);
		
		secondList.retainAll(firstList); //compares 2 list and displays common value.
		System.out.println("Common elements in both list: " +secondList);
	}
}
