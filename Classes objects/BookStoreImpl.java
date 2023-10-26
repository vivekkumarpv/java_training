class Book {
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;

    // Declare required constructors
    public Book(int isbnNo,String bookName,String author,String genre,float price){
        this.isbnNo=isbnNo;
        this.bookName=bookName;
        this.author=author;
        this.genre=genre;
        this.price=price;
    }

    // create a method to print book details
    public void printBookDetails(){
        System.out.println("Book Number: "+isbnNo);
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Author: "+author);
        System.out.println("Book Genrer: "+genre);
        System.out.println("Book Price: "+price);
    }
    public Book cheapestBook(Book b1,Book b2,Book b3){
        if(b1.price<b2.price && b1.price<b3.price){
            cheap=b1;
        }else if(b2.price<b1.price && b2.price<b3.price){
            cheap=b2;
        }else if(b3.price<b2.price && b3.price<b2.price){
            cheap=b3;
        }return cheap;
    }

}
public class BookStoreImpl {
    public static void main(String[] args) {
        Book b1=new Book(2423,"Gulliver's Travel","Jonathan Swift","Satirical",1199);
        b1.printBookDetails();
        System.out.println();
        Book b2=new Book(2424,"The Pilgrims Progress","John Bunyan","Classic",999);
        b2.printBookDetails();
        System.out.println();
        Book b3=new Book(2425,"Robinson Crusoe","Daniel Defoe","Adventure Fiction",1119);
        b3.printBookDetails();
        System.out.println();
        
       /* if(b1.price<b2.price && b1.price<b3.price){
            System.out.println("Cheapest Book: ");
            b1.printBookDetails();
        }else if(b2.price<b1.price && b2.price<b3.price){
            System.out.println("Cheapest Book: ");
            b2.printBookDetails();
        }else if(b3.price<b2.price && b3.price<b2.price){
            System.out.println("Cheapest Book: ");
            b3.printBookDetails();
        }*/
        
        System.out.println("Cheapest book is ");
        b1.cheapestBook(b1,b2,b3).printBookDetails();

    }

}
