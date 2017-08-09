//https://leetcode.com/contest/leetcode-weekly-contest-42/problems/set-mismatch/
//645. Set Mismatch

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0)res[0]=Math.abs(nums[i]);
            else nums[idx]=-nums[idx];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)res[1]=i+1;
        }
        return res;
    }
}