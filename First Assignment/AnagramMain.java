import java.util.*;
class AnagramMain{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Anagram obj = new Anagram();
        System.out.println("Enter words separated by comma: " );
        String str=sc.next();
        String[] st = str.split(",");
        String str2=obj.checkAnagram(st[0],st[1]);
        System.out.println(str2);
    }
}