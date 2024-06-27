package week1.Assignments1;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library Ency=new Library();
		//Passing the string value to the addBook method
		Ency.addBook("Java");
		Ency.issueBook();

	}
	//Declaring void method for issueBook
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	//Declaring method for addBook with return value && adding the string value inside the syso
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully " +bookTitle);
		return(bookTitle);
	}
}
