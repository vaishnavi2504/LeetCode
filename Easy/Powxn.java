//https://leetcode.com/problems/powx-n/

public class Solution {
    public double myPow(double x, int n) {
        if(x==1)return 1;
        
        if(x==-1){
            if(n%2==0)return 1;
            else return -1;
        }
        if((n>=Integer.MAX_VALUE||n<=Integer.MIN_VALUE)&&n!=1)return 0;
        if(n==0)return 1;
        
        //Positive power
        else if(n>0){
            if(n==1)return x;
            double res;
            res=myPow(x,n/2);
            
            if(n%2!=0)return res*res*x;
            else return res*res;
        }
        //Negative Power
        else{
            n=Math.abs(n);
            if(n==1)return (double)(1/x);
            double res;
            res=myPow(x,n/2);
            
            if(n%2!=0)return (1/res)*(1/res)*((double)1/x);
            else return (1/res)*(1/res);
        }
        
    }
}
