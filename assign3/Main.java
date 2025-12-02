package sdvP_assign3;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book("The Silent Horizon", "Ridgway Press", 2019, "Emily Carter", 328);
		Book b2 = new Book("Fragments of Tomorrow", "Northbridge Publishing", 2022, "Jonathan Hale", 256);
		Magazine m1 = new Magazine("Tech Innovator", "Brightline Media", 2023, 14, "August");
		Magazine m2 = new Magazine("Adventure Monthly", "Summit Publications", 2024, 7, "March");
		
		b1.displayDetails();
		b2.displayDetails();
		m1.displayDetails();
		m2.displayDetails();

	}

}
