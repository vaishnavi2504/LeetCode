//https://leetcode.com/problems/perfect-number/#/description
//507. Perfect Number

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)return false;
        int x=num;
        Set<Integer> st=new HashSet<>();
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){       
                x-=i;
                x-=(num/i);
            }
        }
        //To account for 1
        x--;        
        return x==0;
    }
}