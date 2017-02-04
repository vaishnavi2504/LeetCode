//https://leetcode.com/problems/find-peak-element/


public class Solution {
    public int findPeakElement(int[] a) {
        int n=a.length;
        //corner cases
        if(n==1)return 0;
        if(a[0]>a[1])return 0;
        if(a[n-1]>a[n-2])return n-1;
        //Other cases
        else{
            for(int i=0;i+2<n;){
                if(a[i+1]>a[i]){
                    if(a[i+1]>a[i+2])return i+1;
                }i++;
            }
        }
        return -1;
    }
}
