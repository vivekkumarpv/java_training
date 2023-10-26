import java.util.*;
class ArrayAverage{
    public int[] getArrayValues(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }return arr;
    }
    public String findAverage(int[] arr){
        float average=0,sum=0;
        String output="";
        if(arr.length==0){
                output="Array is empty";
        }
        for(int num:arr){
            if(num<0){
                output="Give proper positive integer values";
                break;
            }else{
                sum+=num;
                average=sum/arr.length;
                output="The average value is: "+average;
            }
        }return output;
    }
}