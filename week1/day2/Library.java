package week1.day2;

public class Library {
	public static void main (String args[])
	{
		Library Bk = new Library();
		Bk.addBook("Manifest");
		Bk.issueBook();
		Bk.Author("KJ");
	}
	public String addBook(String bookTitle)
	{
		System.out.println("book added successfully");
		return bookTitle;
	}
	private String Author(String Author)
	{
		System.out.println("book added successfully");
		return Author;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
}
