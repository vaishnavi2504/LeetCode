//https://leetcode.com/problems/minimum-size-subarray-sum/

public class Solution {
    public int minSubArrayLen(int s, int[] a) {
        
        int sum=0,min=Integer.MAX_VALUE,i=0,j=0;
        //Idea is to use 2 pointers i and j
        // i points to the last el of sub array whose sum=target sum
        // j points to the first element of the sub array whose sum=target sum
        // we find the min of the length of all the sub strings
       
        while(i<a.length){
            sum+=a[i++];
            //when sum==s . we've identified the sub array
            //when sum>s we try to get rid of the elements from the beginning
            while(sum>=s){
                min=Math.min(min,i-j);
                sum-=a[j++];
            }
        }
       //Min never gets updated if the sub array doesn't exists
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
