//https://leetcode.com/problems/power-of-four/

public class Solution {
    public boolean isPowerOfFour(int num) {
        for(int i=0;i<16;i++){
            if((int)(Math.pow(4,i))==num)return true;
            if((int)Math.pow(4,i)>num)return false;
        }
        return false;
    }
}
