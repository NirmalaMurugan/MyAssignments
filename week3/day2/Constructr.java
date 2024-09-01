package week3.day2;

public class Constructr {

	boolean pass;
	int age;
	String name;
	
	//default constructor
	   public Constructr() { 
		    System.out.println("i am default constructor");
	   }
	   public Constructr(boolean pass,String name,int age) {
		   //previous constructor should be called in another constructor in 1st line
		   this();

		   //globally variable=local variable
		   this.pass=pass;
		   this.name=name;
		   this.age=age;
		   
		   System.out.println("status :"+pass+"\n"+"Name :"+name+"\n"+"Age :"+age);
	   }
	   
	   //constructor chaining 
	   //keyword =this
	   //this - reffer current class -variable,method,constructor
	   
	public static void main(String[] args) {
		//ChromeDriver cd=new ChromeDriver();
		Constructr cd1=new Constructr(true,"Dilip",37);
		//System.out.println(cd.pass+"\n"+cd.age+"\n"+cd.name);
	}
}