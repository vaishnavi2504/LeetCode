//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,j=0,maxLen=0;
        for(;i<s.length();++i){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                //j points to the beginning of the non repeating characters sub string
                //To handle cases like "abba"
                j=Math.max(j,hm.get(c)+1);
            }
            hm.put(c,i);
            maxLen=Math.max(maxLen,-j+i+1);
        }
        return maxLen;
    }
}
