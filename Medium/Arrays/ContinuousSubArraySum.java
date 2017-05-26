//https://leetcode.com/problems/continuous-subarray-sum/#/description
//523
public class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int n=a.length;        
        for(int i=0;i<n;i++){
            int sum=a[i];
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                if(k != 0) {
                    if(sum%k ==0) return true;
                } else {
                    if(sum==0) return true;
                }
          
            }
         
        }return false;
    }
}