//https://leetcode.com/problems/search-insert-position/?tab=Description
//used Binary search
public class Solution {
    public int searchInsert(int[] nums, int target) {
            int l=0,h=n-1,mid=0,n=nums.length;
            while(l<=h){
                mid=(l+h)/2;
                if(nums[mid]==target)return mid;
                else if(nums[mid]>target){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            //If the binary search fails then the element doesn't exist so insert to the right of high pointer
            return h+1;
    }
}
