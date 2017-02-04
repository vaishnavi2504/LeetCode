//https://leetcode.com/problems/move-zeroes/
// Has 2 approaches

//Approach1- efficient
public class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n;){
            if(nums[i]!=0){
                nums[idx++]=nums[i++];
            }
            else
            i++;
        }
        while(idx!=n){
            nums[idx++]=0;
        }        
    }
    //Approach 2- involves swapping
    public void moveZeroes(int[] a) {
        int n=a.length;       
        int i=0,j=1;
        for(;i<n&&j<n;){
             if(a[i]==0&&a[j]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j++]=temp;
                i++;
             }
             else if(a[i]==0&&a[j]==0)j++;
             else{
                i++;
                j++;
             }
        }
    }
}
