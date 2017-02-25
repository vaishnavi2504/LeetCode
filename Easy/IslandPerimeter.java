//https://leetcode.com/problems/island-perimeter/?tab=Description

public class Solution {

    public int islandPerimeter(int[][] grid) {
        int neighbourCount=0;
        int islandCount=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    islandCount++;
                    neighbourCount+=rightAndDown(grid,i,j);
                }
            }
        }
        //for each adjacent pair, 2 edges will be chopped off
        return 4*islandCount-2*neighbourCount;        
    }
    
    public int rightAndDown(int[][] grid,int i, int j){
        //checks if an island has a neighbour to it's right and bottom
        int count=0;
        if(i+1<grid.length){
            if(grid[i+1][j]==1)count++;
        }
        if(j+1<grid[0].length){
            if(grid[i][j+1]==1)count++;
        }
        return count;
    }
}
