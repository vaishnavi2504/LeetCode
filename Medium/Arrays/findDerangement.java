//634. Find the Derangement of An Array
//https://leetcode.com/contest/leetcode-weekly-contest-39/problems/find-the-derangement-of-an-array/

//Recursive relation-- D(n)=(n-1)*(D(n-1)+D(n-2))
public class Solution {
    public int findDerangement(int n) {
        if(n==1)return 0;
        if(n==2)return 1;
        long[] rec=new long[n+1];
        rec[0]=0;
        rec[1]=0;
        rec[2]=1;
		//similar to iterative version of fibonacci series
        for(int i=3;i<=n;i++){
            rec[i]=(long)((i-1)*(rec[i-1]+rec[i-2]))%1000000007;
        }
        return (int)rec[n];
    }
}