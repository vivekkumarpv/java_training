import java.util.Scanner;
class BasicProgramming{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int size=sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}