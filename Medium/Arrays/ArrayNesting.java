//https://leetcode.com/problems/array-nesting/#/description
//565. Array Nesting

public class Solution {
    public int findNestedLength(int[] nums, int s){
        int count=0;
        int n=0;
        while((nums[s])!=-1){
            n=nums[s];
            nums[s]=-1;//Mark as visited
            s=n;
            count++;
        }return count;
    }
    
    public int arrayNesting(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int x=findNestedLength(nums,i);
            max=Math.max(max,x);
        }return max;
    }
}