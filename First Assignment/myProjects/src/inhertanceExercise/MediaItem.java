package inhertanceExercise;

public abstract class MediaItem extends Item {
	private int runtime;
	public MediaItem(int identificationNumber, String title, int noOfCopies,int runtime) {
		super(identificationNumber, title, noOfCopies);
		this.runtime=runtime;
		System.out.println("MediaItem constructor");
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	/*public void print() {
		System.out.println();
	}
	public void checkIn() {
		
	}
	public void checkOut() {
		
	}
	public void addItem() {
		
	}*/
	
	
}
