package inhertanceExercise;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(int identificationNumber, String title, int noOfCopies, int runtime,String artist,String genre) {
		super(identificationNumber, title, noOfCopies, runtime);
		this.artist=artist;
		this.genre=genre;
		System.out.println("CD constructor");	
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void print() {
		System.out.println("print cd item");
	}
	public void checkIn() {
		System.out.println("cd item checkin");
	}
	public void checkOut() {
		System.out.println("cd item checkout");
	}
	public void addItem() {
		System.out.println("cd item added");
	}
	
}
