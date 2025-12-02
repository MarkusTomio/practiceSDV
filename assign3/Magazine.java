package sdvP_assign3;

/*
 * Book class as defined in assignment instructions. It's constructor 
 * contains the superclass attributes and method. In addition, it has the other
 * attributes as well as the override of the abstract method.
 */

public class Magazine extends LibraryItem {

	private int issueNumber;
	private String month;

	public Magazine(String title, String publisher, int year, int issueNumber, String month) {
		super(title, publisher, year);
		this.issueNumber = issueNumber;
		this.month = month;
	}

	@Override
	public void displayDetails() {
		System.out.println(
				"----------------------------------------------------------------------\nWatch out! Here comes the available information about a magazine flying.\n"
						+ "----------------------------------------------------------------------\n\nTitle:           "
						+ title + "\nPublisher:       " + publisher + "\nYear:            " + year
						+ "\nIssue Number:    " + issueNumber + "\nMonth:           " + month + "\n");
	}

}
