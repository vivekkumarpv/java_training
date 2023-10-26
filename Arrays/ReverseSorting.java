import java.util.Scanner;
class ReverseSorting{
    public int[] computeRearrangedArray(int[] inputArray) {
        int j=inputArray.length;
        int [] temp=new int[j];
        for(int i=0;i<inputArray.length;i++){
            temp[i]=inputArray[j-1];
            j--;
        }
        int newLength=0;
        newLength=(inputArray.length/2);
        int [] resultArr=new int[inputArray.length];
        for(int k=0;k<newLength;k++){
            resultArr[k*2]=temp[k];
            resultArr[k*2+1]=inputArray[k];
        }
        if(inputArray.length%2!=0){
            resultArr[inputArray.length-1]=temp[newLength];
        }
    
        return resultArr;
        
    }
    public void displayResult(int[] outputArray) {
        if(outputArray.length==0){
            System.out.println("Give proper input");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[size];
        ReverseSorting obj=new ReverseSorting();
        temp=obj.computeRearrangedArray(arr);
        for(int num:temp){
            System.out.println(num);
        }
        obj.displayResult(arr);

    }
}