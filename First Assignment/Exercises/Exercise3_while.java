import java.util.Scanner;
class Exercise3_while{
	public static void main(String[]args){
		int count=0,num,sum=0;
		float average;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 numbers ");
        while(count<5){
            num=sc.nextInt();
			if(num>0){
            sum+=num;
			}count++;
        }
		average=sum/5;
		System.out.println("Sum of five numbers= "+sum);
		System.out.println("Average of numbers= "+average);		
		
	}
}