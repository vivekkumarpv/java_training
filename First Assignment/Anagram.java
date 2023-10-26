import java.util.*;
class Anagram{
    public String checkAnagram(String str1,String str2){
        String temp1,temp2,output="";
        char tempArray1[] = str1.toCharArray();
        Arrays.sort(tempArray1);
        temp1=new String(tempArray1);
        char tempArray2[] = str2.toCharArray();
        Arrays.sort(tempArray2);
        temp2=new String(tempArray2);
        
        if(temp1.length()==temp2.length()){
            if(temp1.isEmpty()&&temp2.isEmpty()){
                output="Give proper input not empty phrases";
            }else if (temp1.equals(temp2)){
                output="Given phrases are anagrams";
            }
        }else{
            output="Given phrases are not anagrams";
        }
        return output;
    }
    }