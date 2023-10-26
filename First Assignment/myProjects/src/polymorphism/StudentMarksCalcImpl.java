package polymorphism;
import java.util.Scanner;
public class StudentMarksCalcImpl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentMarks std=new StudentMarks();
		System.out.println( "Enter the stream \n 1)Medical \n 2)Non Medical \n 3)Commerce ");
		int stream=sc.nextInt();
		switch(stream) {
		case 1: System.out.println("Enter the marks in physics: ");
				double phy=sc.nextDouble();
				System.out.println("Enter the marks in chemistry: ");
				double che=sc.nextDouble();
				System.out.println("Enter the marks in maths: ");
				double maths=sc.nextDouble();
				System.out.println("Enter the marks in biology: ");
				double bio=sc.nextDouble();
				double total=std.calculateMarks(phy, che, maths, bio);
				System.out.println("Total marks: "+total);
				break;
		case 2: System.out.println("Enter the marks in physics: ");
				int phy2=sc.nextInt();
				System.out.println("Enter the marks in chemistry: ");
				int che2=sc.nextInt();
				System.out.println("Enter the marks in maths: ");
				int maths2=sc.nextInt();
				int total2=std.calculateMarks(phy2, che2, maths2);
				System.out.println("Total marks: "+total2);
				break;
		case 3: System.out.println("Enter the marks in bussiness studies: ");
				int bs=sc.nextInt();
				System.out.println("Enter the marks in finance: ");
				int fin=sc.nextInt();
				System.out.println("Enter the marks in accounts: ");
				int acc=sc.nextInt();
				int total3=std.calculateMarks(bs, fin, acc);
				System.out.println("Total marks: "+total3);
				break;
		}
		sc.close();

	}

}
