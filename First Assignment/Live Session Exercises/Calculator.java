import java.util.Scanner;
class Calculator{
    public static void main(String[]args){
        int choice;
        float num1=0,num2=0,out=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        num1=sc.nextFloat();
        num2=sc.nextFloat();
        System.out.println("Enter a number to perform an operation\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide");
        choice=sc.nextInt();

        switch(choice){
            case 1:out=num1+num2;
            break;
            case 2:out=num1-num2;
            break;
            case 3: out=num1*num2;
            break;
            case 4: out=num1/num2;
            break;
        }
        
        System.out.println("Result= "+out);
    }
}