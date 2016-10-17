//https://leetcode.com/problems/product-of-array-except-self/

public class Solution {
    public int[] productExceptSelf(int[] a) {
        int prod=1;
        int z=0;
        int[] res=new int[a.length];
        for(int x:a){
            if(x!=0)prod*=x;
            else z++;
        }
        for(int i=0;i<a.length;i++){
            if(z==0){
                res[i]=prod/a[i];
            }
            else if(z==1){
                if(a[i]!=0)res[i]=0;
                else res[i]=prod;
            }
            else{
                res[i]=0;
            }
        }
        return res;
    }
}
