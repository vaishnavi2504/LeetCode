//https://leetcode.com/problems/valid-perfect-square/

public class Solution {
    
    public int mySqrt(int n){
        //Use binary search
        int l=1,h=x,mid=0;
        while(l<=h){
            mid=(l+h)/2;
            long chk=mid*mid;
            if(chk==n)return mid;
            else if(chk>mid){
                l=mid-1;
            }else{
                h=mid+1;
            }
        }
    }
    public boolean isPerfectSquare(int num) {        
        int x=mysqrt(num);
        if(x*x==num)return true;
        else return false;
    }
}
