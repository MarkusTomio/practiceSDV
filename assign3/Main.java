package sdvP_assign3;

public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("The Silent Horizon", "Ridgway Press", 2019, "Emily Carter", 328);
		Book b2 = new Book("Fragments of Tomorrow", "Northbridge Publishing", 2022, "Jonathan Hale", 256);
		Magazine m1 = new Magazine("Tech Innovator", "Brightline Media", 2023, 14, "August");
		Magazine m2 = new Magazine("Adventure Monthly", "Summit Publications", 2024, 7, "March");
		DVD d1 = new DVD("Inception", "Warner Bros", 2010, 148, "Christopher Nolan");
		DVD d2 = new DVD("The Lord of the Rings: The Fellowship of the Ring", "New Line Cinema", 2001, 178,
				"Peter Jackson");

		/*
		 * Displaying all the created items details as well as checking if they were
		 * published before 2019. 2019 was chosen to showcase the different print
		 * scenarios of the method.
		 */
		b1.displayDetails();
		b1.isPublishedBefore(2019);
		b2.displayDetails();
		b2.isPublishedBefore(2019);
		m1.displayDetails();
		m1.isPublishedBefore(2019);
		m2.displayDetails();
		m2.isPublishedBefore(2019);
		d1.displayDetails();
		d1.isPublishedBefore(2019);
		d2.displayDetails();
		d2.isPublishedBefore(2019);

	}

}
