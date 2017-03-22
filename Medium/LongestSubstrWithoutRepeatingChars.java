//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int r=0,l=0,maxLen=0;
        for(;i<s.length();++i){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                //l points to the beginning of the non repeating characters sub string               
                l=Math.max(j,hm.get(c)+1);
            }
            hm.put(c,i);
            maxLen=Math.max(maxLen,r-l+1);
        }
        return max;
    }
}
