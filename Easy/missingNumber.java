//https://leetcode.com/problems/missing-number/
// 2 methods
public class Solution {
    //Not linnear because of Arrays.sort
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        //0 missing
        if(nums[0]==1)return 0;
        //n missing
        if(nums[n-1]!=n)return n;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]!=1)return (nums[i]+nums[i-1])/2;
        }
        return -1;
    }
    
    //Method2 , no sort. linnear time
    public int missingNumber(int[] a) {
        int n=a.length;
        int sum=((n)*(n+1))/2;
        for(int i=0;i<a.length;i++){
            sum-=a[i];
        }
        return sum;
    }
}
