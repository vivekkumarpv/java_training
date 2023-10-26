class PhoneNumberValidationMain{
    public static void main(String []args){
        PhoneNumberValidation obj=new PhoneNumberValidation();
        String phno=obj.getInput();
        boolean result=obj.validatePhoneNumber(phno);
        obj.displayResult(result);
    }
}