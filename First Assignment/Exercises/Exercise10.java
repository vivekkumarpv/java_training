import java.util.Scanner;
class Exercise10{
    public static void main(String[]args){
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an age ");
        age=sc.nextInt();
        if(age<=0 || age>120){
            System.out.println("Enter a valid age");
        }
        else if (age>=1 && age<=12){
            System.out.println("Kid");
        }   
        else if(age<=19){
            System.out.println("Teenager");
        }
        else if(age<=59){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
}