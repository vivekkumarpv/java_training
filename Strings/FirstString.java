import java.util.Scanner;
class FirstString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        if(word1.equalsIgnoreCase(word2)){
            System.out.println("words are equal");
        }else{
            System.out.println("words are not equal");
        }
        int difference=word1.compareTo(word2);
        System.out.println(difference);
    }
}