//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/?tab=Description

public class Solution {
    public String findLongestWord(String s, List<String> d1) {
        if(d1.size()==0)return "";
        int max=Integer.MIN_VALUE;
        String res="";
        for(String a: d1){
            char[] d=a.toCharArray();
            char[] ip=s.toCharArray();
            int j=0;
            for(int i=0;j<d.length&&i<ip.length;i++){
                if(d[j]==ip[i])j++;
            }
            if(j==a.length()&&a.length()>max){
                res=a;
                max=res.length();
            }
            if(j==a.length()&&a.length()==max){
                if(res.compareTo(a)>0){
                    res=a;
                }
            }            
        }
        return res;        
    }
}
