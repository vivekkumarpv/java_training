package inhertanceExercise;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int noOfCopies;
	public Item() {}
	public Item(int identificationNumber, String title, int noOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public abstract void print() ;
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	
}
