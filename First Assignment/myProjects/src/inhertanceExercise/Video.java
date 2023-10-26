package inhertanceExercise;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	public Video(int identificationNumber, String title, int noOfCopies, int runtime,String director,String genre,int year) {
		super(identificationNumber, title, noOfCopies, runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
		
		System.out.println("Video constructor");
	}
	public String getDircetor() {
		return director;
	}
	public void setDircetor(String dircetor) {
		this.director = dircetor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("print video item");
	}
	public void checkIn() {
		System.out.println("video item checkin");
	}
	public void checkOut() {
		System.out.println("video item checkout");
	}
	public void addItem() {
		System.out.println("video item added");
	}
	
}
