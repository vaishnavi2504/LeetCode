//https://leetcode.com/problems/valid-perfect-square/

public class Solution {
    public boolean isPerfectSquare(int num) {
        
        int x=(int)Math.sqrt(num);
        if(x*x==num)return true;
        else return false;
    }
}
