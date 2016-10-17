//https://leetcode.com/problems/min-stack/



public class MinStack {
    
    Stack<Integer> st=new Stack<>();
        int min=Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    //Make sure that the min has the updated minimum value    
    public void push(int x) {
        if(x<=min){
            st.push(min);
            min=x;
        }
        st.push(x);
    }
    
    //When you're popping, if your popping min then make sure to update
    //Note the second min will be right to the min being popped
    public void pop() {
        if(st.peek()==min){
            st.pop();
            min=st.pop();
        }
        else st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}
