//https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        boolean isCycle=false;
        if(head==null||head.next==null)return null;
        //To detect if the linked list has a cycle
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                isCycle=true;
                break;
            }
        }
        if(!isCycle)return null;
        fast=head;
        //To detect the node from which the cycle starts
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        //Node where the cycle begins
        return fast;
        
    }
}
