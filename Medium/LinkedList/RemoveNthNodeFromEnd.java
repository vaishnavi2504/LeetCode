//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy=new ListNode(0);
        ListNode fast=dummy,slow=dummy;
        slow.next=head;
       
        for(int i=0;i<=n;i++)fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
      
        if(slow.next!=null)slow.next=slow.next.next;
        return dummy.next;
        
    }
}
