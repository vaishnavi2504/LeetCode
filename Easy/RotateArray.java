//https://leetcode.com/problems/rotate-array/#/description

//Approach2 Extra memory
public class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=nums.clone();
        k=k%n;
        
        int n=nums.length,i=n-k,j=0;
        for(;i<n;j++)nums[j]=temp[i++];
        i=0;
        for(;j<n;j++)nums[j]=temp[i++];
    }
}


//Approach1 in place using reverse() method
public class Solution {    
    public void reverseArray(int[] a, int s, int e){
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
}