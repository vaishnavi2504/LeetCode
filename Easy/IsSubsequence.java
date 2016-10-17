// https://leetcode.com/problems/is-subsequence/

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0)return true;
        while(j<t.length()){
            char a=s.charAt(i);
            char b=t.charAt(j);
            if(a==b){
                i++;
                j++;
                if(i==s.length())return true;
            }
            else j++;
            
        }
        return false;
    }
}
