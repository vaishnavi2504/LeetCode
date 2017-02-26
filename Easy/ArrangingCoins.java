//https://leetcode.com/problems/arranging-coins/?tab=Description

public class Solution {
    public int arrangeCoins(int n) {
        if(n==0)return 0;
        int count=1;
        for(int i=1;i<n;i++){
            n=n-i;
            if(n>i)count++;
            else return count;
        }return count;
    }
}
