package arrayExercises;

import java.util.Scanner;

public class MirrorString {
	public void stringMirror(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(str+" | "+sb);
	}
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		MirrorString obj=new MirrorString();
		obj.stringMirror(str);
		sc.close();
	}
}
