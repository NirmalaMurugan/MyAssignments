package week1.day1;

public class Chrome {

	public String developer;
	private static int releaseYear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float version = 91.0f;
		Chrome C = new Chrome();
		C.developer = "Google";
		boolean isBeta = false;
		Chrome.releaseYear = 2008; // static --no instance required.
		char shortcutKey = 'C';

		System.out.println("The Version is : " + version + "\n" + "Developed by : " + C.developer + "\n" + "If Beta : "
				+ isBeta + "\n" + "Year of Release: " + Chrome.releaseYear + "\n" + "The shortcut key is: "
				+ shortcutKey);

	}

}
