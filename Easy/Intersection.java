//https://leetcode.com/problems/intersection-of-two-arrays/

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>st1=new HashSet<Integer>();
        Set<Integer>intrst=new HashSet<Integer>();
      for(int x:nums1)st1.add(x);
      for(int x:nums2){
          if(st1.contains(x))intrst.add(x);
      }
      
      int[] res=new int[intrst.size()];
      int i=0;
      for(int y:intrst)res[i++]=y;
      return res;
    }
}
