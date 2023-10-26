import java.util.Scanner;
class Exercise5{
    public static void main(String[]args){
        char input;
        String output;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        input=sc.next().toLowerCase().charAt(0);
        if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u'){
            output="Vowel";
            }
        else{
            output="Consonant";
        }
        System.out.println(output);


    }
}