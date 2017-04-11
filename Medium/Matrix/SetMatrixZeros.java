public class Solution {
    
    public void set(int[][] matrix, int r, int c){
        for(int k=0;k<matrix[0].length;k++){
            matrix[r][k]=0;
        }
        for(int k=0;k<matrix.length;k++){
            matrix[k][c]=0;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        Queue<Integer> col=new LinkedList<>();
        Queue<Integer> row=new LinkedList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    col.add(j);
                    row.add(i);
                }
            }
        }
        while(!col.isEmpty()){
            set(matrix,row.remove(),col.remove());
        }
    }
}