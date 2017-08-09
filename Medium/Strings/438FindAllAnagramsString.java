//https://leetcode.com/problems/find-all-anagrams-in-a-string/#/description

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] count=new int[256];
        List<Integer> res=new ArrayList<>();
        for(char c:p.toCharArray())count[c]++;
        int l=0,r=0,len=p.length();
        while(r<s.length()){
            if(count[s.charAt(r)]>=1)len--;            
            count[s.charAt(r)]--;
            r++;
            //System.out.println(l+" "+r+" "+len);
            if(len==0)res.add(l);
            
            if(r-l==p.length()){
                if(count[s.charAt(l)]>=0){
                    len++;
                }         
                count[s.charAt(l)]++;//Leaving l behind so reset the count by incrementing
                l++;// also increment l( to ensure window size is maintained)
            }   
        }return res;
    }
}