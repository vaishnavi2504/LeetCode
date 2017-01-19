//https://leetcode.com/problems/max-consecutive-ones/

public class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int len=1,max=0,n=a.length,i=0;
        if(n==1&&a[0]!=1)return 0;
        while(i<n){
            //As long as you have the consecutive 1s sequence
            while(a[i]==1){
                if(i+1<n&&a[i+1]==1){
                     len++;
                     i++;
                }else{
                     if(len>max)max=len;
                     len=1;//Reset len value which holds the length of current consecutive 1s
                     if(i+2<n) i=i+2;
                     else return max;
                }
            }
            i++;//Increement i until you find an array element with value 1
        }
        return max;   
    }
}
