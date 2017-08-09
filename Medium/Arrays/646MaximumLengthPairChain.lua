//https://leetcode.com/contest/leetcode-weekly-contest-42/problems/maximum-length-of-pair-chain/
//646. Maximum Length of Pair Chain

public class Solution {
    public int findLongestChain(int[][] pairs) {
        int res=1;
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int e=pairs[0][1],s=pairs[1][0];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>e){
                res++;
                e=pairs[i][1];
            }
        }return res;
    }
}