import java.util.Scanner;
class Exercise3{
	public static void main(String[]args){
		int num1,num2,num3,num4,num5,sum;
		float average;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter five numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();	
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		sum=num1+num2+num3+num4+num5;
		average=sum/5;
		System.out.println("Sum of five numbers= "+sum);
		System.out.println("Average of numbers= "+average);		
		
	}
}