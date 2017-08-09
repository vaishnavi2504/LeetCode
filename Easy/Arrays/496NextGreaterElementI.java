//
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        //To store decreasing seq
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(st.isEmpty()||st.peek()>x)st.push(x);
            //When decreasing seq is broken, pop the top of stack and put top->curr to map
            else map.put(st.pop(),x);
        }
        
        for(int i=0;i<findNums.length;i++){
            Integer y=map.get(findNums[i]);
            findNums[i]=(y==null)?-1:y;
        }
        return findNums;
    }
}