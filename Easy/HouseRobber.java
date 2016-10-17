//DP solution
//[2,1,2,2]-. Op 4 max profit
//https://leetcode.com/problems/house-robber/

public class Solution {
    public int rob(int[] a) {
        int even=0,odd=0;
        for(int i=0;i<a.length;i++){
        
        //for even index pick max of current and prev
            if(i%2==0){
                even=Math.max(a[i]+even,odd);
            }
         //for odd index pick max of current and prev
            else{
                odd=Math.max(odd+a[i],even);
            }
        }
        return Math.max(even,odd);
    }
}
