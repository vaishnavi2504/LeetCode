/*
  https://leetcode.com/problems/minimum-size-subarray-sum/
  Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
*/

public class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int nr=m.length;
        int nc=m[0].length;
        if(nr<1||m==null)return false;
        if(nr==1&&nc==1){
            if(m[0][0]==target)return true;
            else return false;
        }
        int r=0;
        int c=nc-1;
        while(r<nr&&c>=0){
            if(m[r][c]==target)return true;
            else if(m[r][c]<target){
                r++;
            }
            else c--;
        }
        return false;
        
    }
}
