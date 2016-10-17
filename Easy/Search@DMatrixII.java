/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
Link https://leetcode.com/problems/search-a-2d-matrix-ii/
*/
public class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        if(m==null||m.length<1)return false;
        int nr=m.length;
        int nc=m[0].length;
        if(nr==1&&nc==1){
            if(target==m[0][0])return true;
            else return false;
        }
        int r=0;
        int c=nc-1;
        while(r<nr&&c>=0){
            if(target==m[r][c])return true;
            // move 1 row down
            else if(target>m[r][c]){
                r++;
            }
             //move left one column
            else{
                c--;
            }
        }
        return false;
        
    }
}
