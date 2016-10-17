//Link to the problem - https://leetcode.com/problems/sort-colors/


public class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        
        for(int x:nums){
            if(x==0)count0++;
            if(x==1)count1++;
            if(x==2) count2++;
        }
        
       if((count1==0&&count2==0)||(count0==0&&count1==0)||(count0==0&&count2==0))
       if(count1==0&&count0!=0&&count2!=0){
           int i;
           for(i=0;i<count0;i++)nums[i]=0;
           for(i=count0;i<count0+count2;i++)nums[i]=2;
       }
       if(count0==0&&count1!=0&&count2!=0){
           int i;
           for(i=0;i<count1;i++)nums[i]=1;
           for(i=count0;i<count1+count2;i++)nums[i]=2;
       }
       if(count2==0&&count1!=0&&count0!=0){
           int i;
           for(i=0;i<count0;i++)nums[i]=0;
           for(i=count0;i<count0+count1;i++)nums[i]=1;
       }
       else{
           int i;
           for(i=0;i<count0;i++)nums[i]=0;
           for(i=count0;i<count0+count1;i++)nums[i]=1;
           for(i=count0+count1;i<count0+count1+count2;i++)nums[i]=2;
       }
       for(int v:nums)
       System.out.print(v+" ");
        
    }
}
