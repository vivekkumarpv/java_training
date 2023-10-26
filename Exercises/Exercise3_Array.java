import java.util.Scanner;
class Exercise3_Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of array ");
        int lenght=sc.nextInt();
        int []numbers=new int[lenght];
        int sum=0;
        System.out.println("Enter "+lenght+ " numbers ");
        for(int index=0;index<lenght;index++){
            numbers[index]=sc.nextInt();
            sum +=numbers[index];
        }
        System.out.println("Sum of numbers= "+sum);
    }
}