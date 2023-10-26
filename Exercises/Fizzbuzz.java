import java.util.Scanner;
class Fizzbuzz{
    public static void main(String[]args){
        int num;
        String output="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%3==0 && num%5==0){
            output="Fizzbuzz";
        }else if(num%5==0){
            output="Buzz";
        }else if(num%3==0){
            output="Fizz";
        }else{
            //System.out.println(num);
            output=Integer.toString(num);
        }
        
        System.out.println(output);


    }
}