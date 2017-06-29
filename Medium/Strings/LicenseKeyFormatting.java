
//https://leetcode.com/problems/license-key-formatting/

//Start from the last character of the string, 
//Use String builder to append
//Identify the position at which '-' needs to be inserted
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
    
        StringBuilder sb=new StringBuilder();
        for(int i=S.length()-1;i>=0;){
            char c=S.charAt(i);
            if(c!='-'){
                //Tricky part
                if((sb.length())%(K+1)==K)sb.append('-');
                else sb.append("");
                sb.append(c);
                i--;
            }else i--;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
