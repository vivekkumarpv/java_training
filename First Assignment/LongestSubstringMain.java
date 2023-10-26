import java.util.Scanner;
class LongestSubstringMain{
    public static void main(String[]args){
        LongestSubstring obj=new LongestSubstring();
        StringBuilder sb=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        sb.append(sc.nextLine());
        StringBuilder sb2=new StringBuilder();
        sb2=obj.findLongestSubString(sb);
        System.out.println(sb2);
    }
}