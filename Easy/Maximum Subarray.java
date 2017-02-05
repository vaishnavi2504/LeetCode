//https://leetcode.com/problems/maximum-subarray/

public class Solution {
    public int maxSubArray(int[] nums) {
        //The idea is to keep track of the sum of sub array whose sum is positive
        //as soon as the sum becomes negative reset the leftsum to 0
        
        int maxSum=Integer.MIN_VALUE;
        int leftpos=0;
        for(int i=0;i<nums.length;i++){
            maxSum=Math.max(maxSum,leftpos+nums[i]);
            leftpos=Math.max(0,leftpos+nums[i]);
        }
        return maxSum;
    }
}
