package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="Stops";
		String text2= "Potss";
		
		if(text1.length()!=text2.length())
		{
			System.out.println("The texts cannot be compared");
		}
		else
		{
			char[] ch1= text1.toCharArray();
			char[] ch2= text1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean checkstrings = Arrays.equals(ch1, ch2);
			if(checkstrings){
				System.out.println("The given strings: " + " " +text1 +" and " + text2 +" " + "are anagram.");
			}
			else
			{
				System.out.println("The given strings are not an anagram.");
			}
		}

	}

}
