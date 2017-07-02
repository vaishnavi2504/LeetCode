//https://leetcode.com/problems/longest-common-prefix/#/description
//14. Longest Common Prefix

/**
	Write a function to find the longest common prefix string amongst an array of strings.


**/

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++){
            //if the string whose index we're trying to fetch doesn't exist then indexOf() returns 0
            //so we keep pulling out 1 character from last at a time until we get the indexOf to return 0
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }
}