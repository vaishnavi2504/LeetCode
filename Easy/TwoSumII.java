// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[] res= new int[2];
        
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(target-a[i])){
                res[0]=hm.get(target-a[i]);
                res[1]=i+1;
            }
            else hm.put(a[i],i+1);
            
        }
       return res; 
    }
}
