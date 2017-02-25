//https://leetcode.com/problems/detect-capital/?tab=Description

public class Solution {
    public boolean isCapital(char c){
        int asciival=(int)c;
        if(asciival>=65&&asciival<=90)return true;
        else return false;
    }
    
    public boolean detectCapitalUse(String word) {
        boolean flag=false;
        int count=0;
        if(word.length()==1)return true;
        if(isCapital(word.charAt(0)))flag=true;
        
        for(int i=1;i<word.length();i++){
            if(isCapital(word.charAt(i)))count++;
        }
        
        if((flag&&count==word.length()-1)||(!flag&&count==0)||(flag&&count==0))return true;
        else return false;
        
        
    }
}
