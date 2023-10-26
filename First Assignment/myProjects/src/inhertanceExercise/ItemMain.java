package inhertanceExercise;

public class ItemMain {

	public static void main(String[] args) {
		Book book = new Book(101,"abcd",10,"xyz");
		JournalPaper journal = new JournalPaper(102,"hgg",5,"svdv", 1998);
		CD cd = new CD(104,"hbnc",9,87,"kjchdc","cdahcbdc");
		Video video = new Video(103,"jhgkj",7,30, "hdajkch", ".dkuhv",1995);
		book.print();
		
	}

}
