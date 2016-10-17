/**
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
  80. Remove Duplicates from Sorted Array II  QuestionEditorial Solution  My Submissions
Total Accepted: 90643
Total Submissions: 264947
Difficulty: Medium
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
**/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int x:nums){
            if(i<2||x>nums[i-2])nums[i++]=x;
        }
        return i;
    }
}
