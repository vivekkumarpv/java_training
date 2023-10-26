import java.util.Scanner;
class SimpleCalculator{
    public static void main(String[]args){
        int num1=0,num2=0,out=0,choice;
        String operator="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Enter a number beside the operation to perform \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide");
        choice=sc.nextInt();

        switch(choice){
            case 1:out=num1+num2;
                    operator="+";
            break;
            case 2:out=num1-num2;
                    operator="-";
            break;
            case 3: out=num1*num2;
                    operator="*";
            break;
            case 4: out=num1/num2;
                    operator="/";
            break;
        }
        
        System.out.println(num1+operator+num2+"="+out);
    }
}