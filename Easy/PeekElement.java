// Link to the problem https://leetcode.com/problems/find-peak-element/

public class Solution {
    public int findPeakElement(int[] a) {
        int n=a.length;
        
        for(int i=1;i<n;i++){
            
            if(a[i]<a[i-1])return i-1;
        }
        return n-1;
        
    }
}
