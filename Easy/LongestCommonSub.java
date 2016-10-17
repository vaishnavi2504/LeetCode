//https://leetcode.com/problems/longest-common-prefix/
//Common substring will always be in the beggining of every string in the array

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        Arrays.sort(strs);        
        
        char[] f=strs[0].toCharArray();
        char[] l=strs[strs.length-1].toCharArray();
        //f will have the shortest length
        //l will have the longest lenegth
        
        int i=0,len=f.length;        
        while(i<len&&f[i]==l[i])i++;
        String res=new String(f);
        return res.substring(0,i);        
        
    }
}
