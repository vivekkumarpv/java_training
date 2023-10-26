import java.util.*;
class PhoneNumberValidation{
    public String getInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a phone number:");
        String str=sc.nextLine();
        return str;
    }
    public boolean validatePhoneNumber(String str){
        int count=0,count2=0;
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }else if(str.charAt(i)!='-'){
                count2++;
            }
        }
        boolean result =false;
        if(count==10 && count2==0 && Character.isDigit(str.charAt(0))){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
    public void displayResult(boolean result){
        if (result){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid or empty string");
        }

    }
    
}