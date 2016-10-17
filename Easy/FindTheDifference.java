//https://leetcode.com/problems/find-the-difference/

public class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int n=b.length;
        int i=0;
        while(i<n-1){
            if(a[i]==b[i]){
                i++;
            }
            else
            return b[i];
        }
        return b[i++];
    
    }
}
