import java.util.Scanner;

class StringLocationRead{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your details in the format: (Name Age Location Company_name");
		String str=sc.nextLine();
		str.split(" ");
		System.out.println(str);
	}
}