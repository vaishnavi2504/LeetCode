//Idea is to find min and second min, if the incoming number is greater than both mins then return true;
//else at the end of for loop return false;

// https://leetcode.com/problems/increasing-triplet-subsequence/


public class Solution {
    public boolean increasingTriplet(int[] arr) {
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        
        for(int x:arr){
            if(x<=min)min=x;
            else if(x<=secondMin)secondMin=x;
            else return true;
        }
        return false;
        
    }
}
