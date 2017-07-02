//https://leetcode.com/contest/leetcode-weekly-contest-39/problems/sum-of-square-numbers/
//633. Sum of Square Numbers

//Two pointer method

public class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0,r=(int)Math.sqrt(c);
        while(l<=r){
            int curr=(l*l)+(r*r);
            if(curr==c)return true;
            else if(curr>c){
                r=r-1;
            }else{
                l=l+1;
            }
        }return false;
    }
}