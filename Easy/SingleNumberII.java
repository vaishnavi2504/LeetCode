// Link to the program  https://leetcode.com/problems/single-number-ii/

public class Solution {
    
 
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int x:nums){
            if(!hm.containsKey(x))hm.put(x,1);
            else{
                hm.put(x,hm.get(x)+1);
            }
        }
        for(Object l:hm.keySet()){
            if(hm.get(l)!=3)return (int)l;
        }
        return -1;
    }
}
