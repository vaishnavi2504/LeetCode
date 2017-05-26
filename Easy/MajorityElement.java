//Linnear time solution using Boyer Moore algorithm
public class Solution {
    public int majorityElement(int[] nums) {
        int cand=0,count=0;
        for(int x:nums){
            if(count==0)cand=x;
            if(cand==x)count++;
            else count--;
        }return cand;
    }
}


	
