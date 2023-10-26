import java.util.Scanner;
class Day_Message_Switch{
    public static void main(String[]args){
        int day;
        String message="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to represent a day ");
        day=sc.nextInt();
        switch(day){
            case 1:message="Monday, its the start of the week";
            break;
            case 2:message="Tuesday";
            break;
            case 3:message="Wednessday";
            break;
            case 4:message="Thursday";
            break;
            case 5:message="Friday";
            break;
            case 6:message="Saturday,its weekend";
            break;
            case 7:message="Sunday";
            break;
            default:message="Wrong option entered";
            break;
        }
        
        System.out.println(message);
    }
}