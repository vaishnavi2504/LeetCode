//https://leetcode.com/problems/is-subsequence/

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0,b=0;
        int l1=s.length(),l2=t.length();
        while(a<l1&&b<l2){
            char x=s.charAt(a);
            char y=t.charAt(b);
            if(x==y){
                a++;
                b++;
            }else b++;
        }
        return(a==l1);
        
    }
}
