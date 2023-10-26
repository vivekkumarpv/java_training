class LongestSubstring{
    public StringBuilder findLongestSubString(StringBuilder str){
        int size=str.length();
        StringBuilder longestSubstring=new StringBuilder();
        StringBuilder output=new StringBuilder();
        for (int i=0;i<size/2;i++){
            String frontSubStr=str.substring(0,i+1);
            String backSubStr=str.substring(size-i-1,size);
            if(frontSubStr.equals(backSubStr)){
                longestSubstring.append(frontSubStr);
            }
        }if(longestSubstring.length()==0){
            output.append("Longest substring is not present in the given StringBuilder");
        }else{
            output.append(longestSubstring);
        }
        return output;
    }
}