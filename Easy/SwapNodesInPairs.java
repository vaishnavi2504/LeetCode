/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //https://leetcode.com/problems/swap-nodes-in-pairs/
 
public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null||head.next==null)return head;
        ListNode n=head.next;
        head.next=swapPairs(n.next);
        n.next=head;
        return n;
        
    }
}
