/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // https://leetcode.com/problems/remove-linked-list-elements/
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //Empty list
        if(head==null)return null;
        
        //Discover head node
        while(head!=null&&head.val==val)head=head.next;
        // If the entire list contains val elements
        if(head==null)return null;
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==val)temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head;
        
    }
}
