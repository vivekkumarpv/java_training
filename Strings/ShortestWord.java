import java.util.Scanner;
class ShortestWord{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of array");
        int count=sc.nextInt();
        String []arr=new String[count];
        System.out.println("Enter "+count+" words");
        for (int i=0;i<count;i++){
            arr[i]=sc.next()+sc.nextLine();
        }
        String smallest=arr[0];
        for(int j=0;j<count;j++){
            if(arr[j].length()<smallest.length()){
                    smallest=arr[j];
            }
        }System.out.println("Shortest word is "+smallest);
    }

}
