import java.util.Scanner;
class Exercise5{
    public static void main(String[]args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" is the largest");
        }else if(num1==num2){
            System.out.println("both numbers are equal");
        }else{
            System.out.println(num2+" is the largest");
        }
    }
}