package week1.day3;

public class DuplicateStringWord {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1 Basics";
		//use equalsIgnoreCase instead of tolower
		//text = text.toLowerCase(); 
		System.out.println("Input String: " +text);
		String[] Newtext = text.split(" "); // {"we","learn","java","basics","as","part","of"}

		System.out.print("Duplicate words in a given string : ");
		for (int i = 0; i < Newtext.length; i++) {
			int count = 1;
			for (int j = i + 1; j < Newtext.length; j++) {
				if (Newtext[i].equalsIgnoreCase(Newtext[j])) {
					count++;
					Newtext[j] = "0"; // already visited word neglected.
		
				}
			}
			if (count > 1 && Newtext[i] != "0") {
				System.out.println(Newtext[i]);
			}
		}
	}
}