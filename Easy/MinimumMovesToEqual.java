//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

public class Solution {
    //Reduce the whole problem to number of single element reductions to be made to make it equal to the smallest element in the array
    public int minMoves(int[] a) {
        Arrays.sort(a);
        int min=a[0],count=0;
        for(int x:a){
            if(x!=min){
                while(x!=min){
                    x--;
                    count++;
                }
            }
        }
        return count;
    }
}
