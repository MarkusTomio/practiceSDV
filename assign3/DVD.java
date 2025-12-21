package sdvP_assign3;

/*
 * DVD class as defined in assignment instructions. It's constructor 
 * contains the superclass attributes and method. In addition, it has the other
 * attributes as well as the override of the abstract method.
 */

public class DVD extends LibraryItem{

	private int duration;
	private String director;

	public DVD(String title, String publisher, int year, int duration, String director) {
		super(title, publisher, year);
		this.duration = duration;
		this.director = director;
	}

	@Override
	public void displayDetails() {
		System.out.println(
				"----------------------------------------------------------------------\nWatch out! Here comes the available information about a DVD flying.\n"
						+ "----------------------------------------------------------------------\n\nTitle:           "
						+ title + "\nPublisher:       " + publisher + "\nYear:            " + year
						+ "\nDuration:        " + duration + "\ndirector:        " + director + "\n");
	}

}
