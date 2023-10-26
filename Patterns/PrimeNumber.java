import java.util.Scanner;
class Exercise5{
    public static void main(String[]args){
        int num, count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(int divisor=2;divisor<(num/2);divisor++){
                if (num%divisor==0){
                    count++;
                    break;
                }
        }if (count==0){
            System.out.println("number is prime");

        }else{
            System.out.println("number is not prime");
        }
    }
}