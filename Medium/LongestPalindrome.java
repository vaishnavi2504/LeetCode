//https://leetcode.com/problems/longest-palindrome/#/description
//409. Longest Palindrome

public class Solution {    
    public int longestPalindrome(String s) {
        if(s.length()==0)return 0;
        int max=0;
        Map<Character, Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c))map.put(c,1);
            else map.put(c,map.get(c)+1);
        }
        
        boolean oddCount=false;
        for(char x:map.keySet()){
            if(map.get(x)==1) oddCount=true;
            else if(map.get(x)%2!=0&&map.get(x)>2){
                max+=map.get(x)-1;
                oddCount=true;
            }
            else max+=map.get(x);
        }
            
        max=(oddCount==true)?max+1:max;
        return max;
    }
}