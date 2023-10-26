package inhertanceExercise;

public class Book extends WrittenItem {
	public Book(int identificationNumber, String title, int noOfCopies, String author) {
		super(identificationNumber, title, noOfCopies, author);
		System.out.println("Book constructor");
	}
	public void print() {
		System.out.println("book printed");
	}
	public void checkIn() {
		System.out.println("book item checkin");
	}
	public void checkOut() {
		System.out.println("book item checkout");
	}
	public void addItem() {
		System.out.println("book item added");
	}
}
