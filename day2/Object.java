package week1.day2;

public class Object {

	public static void main(String[] args) {

		Method op=new Method();
		
		op.browserName();
		
		int numberOfBrowser = op.numberOfBrowser();
		System.out.println(numberOfBrowser);
		System.out.println(op.browserUrl("google.in", "Email"));
		
	
	}

}