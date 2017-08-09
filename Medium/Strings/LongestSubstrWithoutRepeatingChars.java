//https://leetcode.com/problems/longest-substring-without-repeating-characters/

//Approach1; general  approach for sub string related problems

public class Solution {
    public int lengthOfLongestSubstring(String s1) {
        int[] count=new int[256];
        char[] s=s1.toCharArray();
        
        int len=0, l=0, r=0, maxLen=0; 
        while(r<s.length){
            if(count[s[r]]>0) len++; // To indicate there is len number of redundant characters
            count[s[r]]++;  
            r++;
            while(len>0){ // we determine characters that are redundant my checking if count[l]>1
                // if try to reduce the count by 1 and len by 1 until len=0
                if(count[s[l]]>1) len--;
                count[s[l]]--;
                l++;
            }
            maxLen=Math.max(maxLen, r-l);            
        }
        return maxLen;
    }
}


//Approach1
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

//Approach2 Using hashset

public class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> st=new HashSet<>();
       int i=0,j=0,max=0;
       while(j<s.length()){
           char c=s.charAt(j);
           if(!st.contains(c)){
               st.add(c);
               j++;
               max=Math.max(max,st.size());
           }else{
               st.remove(s.charAt(i++));
           }
       }
       return max;
    }
}
