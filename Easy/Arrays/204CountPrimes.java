public class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1||n==2)return 0;        
        boolean[] st=new boolean[n+1];
        for(int i=2;i<=n;i++)st[i]=true;
        int num=2,ans=0;
        for(int p=2;p*p<=n;p++){      
            if(st[p]==true){
                //Mark all the integral multiples of p that are within n as not prime
                for(int i = p*2; i <= n; i += p)st[i]=false;
            }            
        }
        //Scan the boolean Array to check for prime numbers
        for(int i=2;i<=n;i++){
            ans+=(st[i]==true)?1:0;
        }        
        return (st[n]==true)?ans-1:ans;        
    }
}