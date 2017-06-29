//https://leetcode.com/problems/search-for-a-range/

public class Solution {
    
    public int binSerach(int[] nums,int l, int h, int key){
        if(l>h)return -1;
        int mid=(l+h)/2;
        if(nums[mid]==key)return mid;
        else if(nums[mid]>key){
            return binSerach(nums,l,mid-1,key);
        }else{
            return binSerach(nums,mid+1,h,key);
        }
    }
    
    public int[] searchRange(int[] nums, int target) {
        int ans= binSerach(nums,0,nums.length-1,target);
        int[] res=new int[2];
        int s=ans,e=ans;
        if(ans==-1){
            res[0]=-1;
            res[1]=-1;
        }else{
            while(s>=0&&nums[s]==target)s--;
            while(e<nums.length&&nums[e]==target)e++;
            res[0]=s+1;
            res[1]=e-1;
        }
        return res;
    }
}
