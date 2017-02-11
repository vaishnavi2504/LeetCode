//https://leetcode.com/problems/summary-ranges/

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0,j=1,chk=0;
        int n=nums.length;
        List<String> res=new ArrayList<>();
        if(n==0)return res;
        if(n==1){
            res.add(nums[0]+"");
            return res;
        }
        for(;i<n;){
            StringBuilder s=new StringBuilder();
            s.append(nums[i]);
            if(i==n-1){
            	if(i==chk)return res;
            	else{
            		String x=nums[i]+"";
                    res.add(x);
                    return res;
            	}
            }
            while(j<n&&-nums[j-1]+nums[j]==1){
                j++;
            }
            //To ensure that the uppper and lower bound are not same
            //If they're same then we append only nums[i]
            if(i!=j-1){
                s.append("->");
                s.append(nums[j-1]);
                //chk wil later be used to check if j has reached the last postion in the array
                chk=j-1;
            }
            
            res.add(s.toString());
            i=j;
            if(j+1<nums.length)j++;
        }
        
        return res;
        
    }
}
