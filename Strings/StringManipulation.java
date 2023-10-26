class StringManipulation{
    public static void main(String []args){
        String str1="ms dhoni";
        String str2="virat";
        String str3="ms dhoni is the captain of csk";
        System.out.println("length of string 1 "+str1.length());
        System.out.println("character at index 5 "+str1.charAt(5));
        if(str3.contains(str1)){
           System.out.println("str1 is in str3"); 
        }
        int num=str3.indexOf(str2);
        System.out.println(num);
        System.out.println(str2.indexOf("r"));
        System.out.println(str1.compareTo(str2));
    }
}