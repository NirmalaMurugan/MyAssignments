package week2.day4;

public class Elements extends Button {

	public static void main(String[] args) {
		Elements C3 = new Elements();
		System.out.println("Methods of Button class are invoked from elements sub class");
		C3.submit();
		C3.click();
		C3.setText("EMAIL");

	}

}
