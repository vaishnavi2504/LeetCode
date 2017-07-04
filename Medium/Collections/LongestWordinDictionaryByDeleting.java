//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/#/description
// 524. Longest Word in Dictionary through Deleting

/** Given a string and a string dictionary, find the longest string in the dictionary that can be formed by 
    deleting some characters of the given string. If there are more than one possible results, return the longest
    word with the smallest lexicographical order.    If there is no possible result, return the empty string.
**/

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d,(a,b)->a.compareTo(b));     
        String res="";
        int max=0;        
        for(String x:d){            
            char[] c=x.toCharArray();
            int j=0;
            for(int i=0;i<s.length()&&j<x.length();){
                if(s.charAt(i)==x.charAt(j)){
                    j++;                
                    if(j==x.length()){                       
                        if(x.length()>max){                            
                            max=c.length;
                            res=x;                            
                        }
                        break;
                    }
                }i++;
            }
        } 
        return res;
    }
}