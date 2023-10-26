import java.util.Scanner;
class Exercise3_for{
	public static void main(String[]args){
		int num,sum=0;
		float average;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 numbers ");
        for(int count=0;count<5;count++){
            num=sc.nextInt();
			if(num>0){
            sum+=num;
			}
        }
		average=sum/5;
		System.out.println("Sum of five numbers= "+sum);
		System.out.println("Average of numbers= "+average);		
		
	}
}