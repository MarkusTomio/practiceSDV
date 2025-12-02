package sdvP_assign3;

/*
 * Book class as defined in assignment instructions. It's constructor 
 * contains the superclass attributes and method. In addition, it has the other
 * attributes as well as the override of the abstract method.
 */

public class Book extends LibraryItem {

	private String author;
	private int numPages;

	public Book(String title, String publisher, int year, String author, int numPages) {
		super(title, publisher, year);
		this.author = author;
		this.numPages = numPages;
	}

	@Override
	public void displayDetails() {
		System.out.println(
				"----------------------------------------------------------------------\nWatch out! Here comes the available information about a book flying.\n"
						+ "----------------------------------------------------------------------\n\nTitle:           "
						+ title + "\nPublisher:       " + publisher + "\nYear:            " + year
						+ "\nAuthor:          " + author + "\nNumber of pages: " + numPages + "\n");
	}

}
