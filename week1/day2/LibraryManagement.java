package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library Lib = new Library();
		Lib.addBook("half state");
		Lib.issueBook();
		//Lib.Author("LP"); - since the method is defined as the private method in Library class , this method is not accessible
	}

}
