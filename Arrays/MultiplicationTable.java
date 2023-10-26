import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[]args){
		int num=0,multiplier=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number ");
        num=sc.nextInt();
        while(multiplier<=10){
            System.out.println(num+" x "+multiplier+" = "+(num*multiplier));
            multiplier++;
        }		
		
	}
}