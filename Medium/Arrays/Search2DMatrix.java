//https://leetcode.com/problems/search-a-2d-matrix/

//O(m+n) solution

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        int rnum=0,cnum=matrix[0].length-1,nr=matrix.length,nc=matrix[0].length;
        while(rnum<nr&&cnum>=0){
            if(target==matrix[rnum][cnum])return true;
            else if(matrix[rnum][cnum]>target){
                cnum--;
            }else{
                rnum++;
            }
        }
        return false;
    }
}
