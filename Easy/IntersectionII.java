//https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      List<Integer>al=new ArrayList<Integer>();
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0;
      
      while(i<nums1.length&&j<nums2.length){
          if(nums1[i]==nums2[j]){
              al.add(nums1[i]);
              i++;
              j++;
          }
          else if(nums1[i]<nums2[j])i++;
          else j++;
      }
      
      int k=0;
      int[] res=new int[al.size()];
      for(int y:al)res[k++]=y;
      return res;
    }
}
