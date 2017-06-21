//https://leetcode.com/problems/find-all-duplicates-in-an-array/#/description
//Problem 422

//Approach1: O(n) space
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> st=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int x:nums){
            if(!st.add(x))res.add(x);
        }return res;
    }
}

//Approach2: Constact space

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0)nums[idx]=-nums[idx];
            else res.add(Math.abs(nums[i]));
        }return res;
        
    }
}