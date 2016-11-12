//https://leetcode.com/problems/missing-number/

public class Solution {
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
}
