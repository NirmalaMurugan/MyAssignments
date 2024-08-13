package week1.day2;

public class Library {

	  public void addBook(String bookTitle) {
	  System.out.println("book Title is: "+bookTitle +"\n" +
	  "Book Added Successfully");
	  }

//	public String addBook(String bookTitle) {
//		return "Title of the book: " + bookTitle + "\n" + "Book Added Successfully";
//	}

	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}

	public static void main(String[] args) {

		Library L = new Library();
//		if D.T provided, store in a variable and pass the var	
//		String addingBook = L.addBook("HARRY POTTER");
//		System.out.println(addingBook);
//		printing without storing in var
//		System.out.println(L.addBook("HARRY POTTER")) ; 
//		if void just pass the value	
		L.addBook("Harry Potter");
		L.issueBook();

	}

}
