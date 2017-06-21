//https://leetcode.com/problems/valid-anagram/#/description 
//242. Valid Anagram
// One pass one array solution

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] count=new int[256];
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i))res++;
            else{
                if(count[s.charAt(i)-'0']<0)res++;
                if(count[t.charAt(i)-'0']>0)res++;
                count[s.charAt(i)-'0']++;
                count[t.charAt(i)-'0']--;
            }
        }
        return (res==s.length());
    }
}