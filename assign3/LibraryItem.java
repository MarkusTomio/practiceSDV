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

	/*
	 * As this method will be the same for our 3 subclasses, it is defined in the
	 * abstract class already. It provides informative output related to the methods
	 * intention. In addition it return true if the title indeed was published
	 * before the given year, it returns true. Otherwise it returns false. This
	 * would be a great basis for filtering titles already.
	 */
	public boolean isPublishedBefore(int year) {
		if (this.year < year) {
			System.out.println(this.title + " was published before the year " + year + ".\n");
		} else if (this.year == year) {
			System.out.println(this.title + " was published in the year " + year + ".\n");
		} else {
			System.out.println(this.title + " was published after the year " + year + ".\n");
		}
		return this.year < year;
	};

}
