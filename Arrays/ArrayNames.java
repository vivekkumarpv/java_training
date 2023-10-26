import java.util.Scanner;
class ArrayNames{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of names ");
        int length=sc.nextInt();
        String []names=new String[length];
        System.out.println("Enter "+length+ " names ");
        for(int index=0;index<length;index++){
            names[index]=sc.nextLine();
        }
        for(String name: names){
        System.out.println(name);
        }
    }
}