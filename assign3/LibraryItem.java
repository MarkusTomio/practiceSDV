package sdvP_assign3;

/* 
 * This is the abstract base class. It contains the attributes and methods 
 * every one of libraryItems subclasses should have according to the assignment
 * instructions. The attributes are set as protected, so the subclasses can access
 * them without the need of getters. This should be valid practice, as they are all
 * used in the subclasses.
*/

public abstract class LibraryItem {

	protected String title;
	protected String publisher;
	protected int year;

	public LibraryItem(String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}

	public abstract void displayDetails();

}
