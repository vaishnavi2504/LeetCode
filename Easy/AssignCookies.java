//https://leetcode.com/problems/assign-cookies/


public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,satisfied=0;
        for(;i<g.length&&j<s.length;){
           if(g[i]<=s[j]){
               satisfied++;
               i++;
               j++;
           }else{
               j++;
           }
        }
        return satisfied;
    }
}
