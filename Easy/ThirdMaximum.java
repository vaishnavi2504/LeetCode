//https://leetcode.com/problems/third-maximum-number/

public class Solution {
    public int thirdMax(int[] arr) {        
       Map<Integer,Integer> tm = new TreeMap<>();
       for(int x:arr){
           if(!tm.containsKey(x))tm.put(x,1);
       }       
       if(tm.size()==1)return (int)tm.keySet().toArray()[0];
       if(tm.size()==2)return (int)tm.keySet().toArray()[1];
       else return (int)tm.keySet().toArray()[tm.size()-3];
       
    }
}
