import java.util.Scanner;
class EvenSum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                sum+=rem;
            }
            num=num/10;
        }
        System.out.println("Sum of even numbers: "+sum);

    }
}
