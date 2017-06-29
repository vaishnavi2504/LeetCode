public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        //xor at the end of the loop will have the xor of 2 distinct numbers
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        //Identify the bit that is set in xor                   
        //Takes care of negative numbers too
        //Basically checks the first set bit from right
        xor &=-xor;
        //if an ith bit of xor of a and b is set then it implies ith bit in a is 1 or b is 1 but not both
        //so we divide the array into 2 groups, group1 contains a nad group 2 contains b
        int[] rets={0,0};
        for(int x:nums){
            if((x&xor)==0)rets[0]^=x;
            else rets[1] ^= x;
        }        
        return rets;
    }
}