import java.util.Scanner;
class UniqueArray{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of array");
        int count=sc.nextInt();
        int []arr=new int[count];
        System.out.println("Enter "+count+" numbers");
        for (int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        int out=0;
        for (int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    out++;                                          //can use boolean insted.
                    break;
            }
        }    
        }if (out==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}