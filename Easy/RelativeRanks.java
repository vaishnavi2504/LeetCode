//https://leetcode.com/problems/relative-ranks/

public class Solution {
    public String[] findRelativeRanks(int[] a) {
        
        Map<Integer, String> res=new HashMap<>();
        String[] ans=new String[a.length];
        int[] temp=a.clone();
        
        int n=a.length;
        Arrays.sort(temp);
        int ival=4;
        
        if(n>=1)res.put(temp[n-1],"Gold Medal");
        if(n>=2)res.put(temp[n-2],"Silver Medal");
        if(n>=3)res.put(temp[n-3],"Bronze Medal");
        if(n>=4){
              for(int l=n-4;l>=0;l--){
                        res.put(temp[l],ival+"");
                        ival++;
              }
        }
        
        int p=0;
        for(int z: a)ans[p++]=(String)res.get(z);
        return ans;
        
    }
}
