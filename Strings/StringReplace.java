class StringReplace{
    public static void main(String[]args){
        String str="Hello everyone, how are you. ";
        StringBuilder sbr=new StringBuilder(str);
        sbr.replace(6,14,"folks");
        System.out.println(sbr);
    }
}