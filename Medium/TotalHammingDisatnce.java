public class Solution {
    
    public boolean getBit(int n, int i){
        return (((n&(1<<i))!=0));
    }
    
    //For every bit from 1 to 32, examine if ith bit is set for all the numbers in the array
    //if cnt bits are set for a ith bit then it contributes cnt*(n-cnt) to the total hamming distance
    public int totalHammingDistance(int[] nums) {
        int n=nums.length,count=0,cnt;
        for(int k=0;k<32;k++){
            cnt=0;
            for(int i=0;i<n;i++){
                if(getBit(nums[i],k))cnt++;
            }
            count+=(cnt*(n-cnt));
        }
        return count;
    }
}