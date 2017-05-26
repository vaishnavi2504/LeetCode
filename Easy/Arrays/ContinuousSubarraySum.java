//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/#/description

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp=nums.clone();
        int count=0,n=nums.length;
        if(n==1)return 0;
        Arrays.sort(nums);
        int l=0,r=n-1;
        while(l<r&&l<n&&nums[l]==temp[l])l++;
        while(l<r&&r>=0&&nums[r]==temp[r])r--;
        if(l==r)return 0;
        return r-l+1;
    }
}