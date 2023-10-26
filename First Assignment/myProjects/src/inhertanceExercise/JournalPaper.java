package inhertanceExercise;

public class JournalPaper extends WrittenItem {
	private int year;
	public JournalPaper(int identificationNumber, String title, int noOfCopies, String author,int year) {
		super(identificationNumber, title, noOfCopies, author);
		this.year=year;
		System.out.println("JournalPaper constructor");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
	public void print() {
		System.out.println("journal paper printed");
	}
	public void checkIn() {
		System.out.println("journal item checkin");
	}
	public void checkOut() {
		System.out.println("journal item checkout");
	}
	public void addItem() {
		System.out.println("journal item added");
	}
	
}
