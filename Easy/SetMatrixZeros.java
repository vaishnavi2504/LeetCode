//https://leetcode.com/problems/set-matrix-zeroes/
//The trick with this question is to ensure that setting an entire row or column to 0 affects next iterations

public class Solution {
    public void setMatrix(int[][] m,int a,int b){
        int nr=m.length;
        int nc=m[0].length;
        
        //If the the element in a cell that you're trying to set has 0 then don't set it to -infinity
        for(int i=0;i<nc;i++){
            if(m[a][i]!=0)m[a][i]=Integer.MIN_VALUE-2;
        }
        for(int j=0;j<nr;j++){
            if(m[j][b]!=0)m[j][b]=Integer.MIN_VALUE-2;
        }
        
    }
    
    public void setZeroes(int[][] matrix) {
        int nr=matrix.length;
        int nc=matrix[0].length;
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(matrix[i][j]==0){
                    setMatrix(matrix,i,j);
                }
            }
        }
        
        //Replace all the -infinity with 0
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(matrix[i][j]==Integer.MIN_VALUE-2){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
