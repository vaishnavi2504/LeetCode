//https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {
    // Push element x onto stack.
    Queue<Integer> q1=new LinkedList<>();
    
    public void push(int x) {
        q1.add(x);
        //remove and Add all the elements except the last element which shows up in the front
        for(int i=1;i<q1.size();i++)q1.add(q1.remove());
    }

    // Removes the element on top of the stack.
    public void pop() {
        
        if(!q1.isEmpty())q1.remove();
        
    }

    // Get the top element.
    public int top() {
        if(!q1.isEmpty())return q1.peek();
        else return -1;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
