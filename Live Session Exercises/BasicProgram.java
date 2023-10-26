import java.util.Scanner;
class BasicProgram{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an string");
        String str=sc.nextLine();
        System.out.println("Enter an integer");
        int num=sc.nextInt();
        System.out.println("Enter an float");
        float num2=sc.nextFloat();
        System.out.println("Enter an double");
        double num3=sc.nextDouble();
        System.out.println("String "+str);
        System.out.println("Integer "+num);
        System.out.println("Float "+num2);
        System.out.println("Double "+num3);
    }
}