package inhertanceExercise;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int identificationNumber, String title, int noOfCopies,String author) {
		super(identificationNumber, title, noOfCopies);
		this.author=author;
		System.out.println("WrittenItem constructor");
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	/*public void print() {
		System.out.println("writtenitem printed");
	}
	public void checkIn() {
		System.out.println("written item checked in");
	}
	public void checkOut() {
		System.out.println("written item checked out");
	}
	public void addItem() {
		System.out.println("writtenitem added");
	}*/

}
