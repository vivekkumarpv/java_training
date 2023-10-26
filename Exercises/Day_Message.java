import java.util.Scanner;
class Day_Message{
    public static void main(String[]args){
        int day;
        String message="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to represent a day ");
        day=sc.nextInt();
        if(day==1){
            message="Monday, its the start of the week";
        }else if(day==2){
            message="Tuesday";
        }else if(day==3){
            message="Wednessday";
        }else if(day==4){
            message="Thursday";
        }else if(day==5){
            message="Friday";
        }else if(day==6){
            message="Saturday,its weekend";
        }else if(day==7){
            message="Sunday";
        }else{
            message="Wrong option entered"
        }
        
        System.out.println(message);
    }
}