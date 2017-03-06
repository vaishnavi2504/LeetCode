
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp=head,curr, dummy=new ListNode(0);
        dummy.next=head;
        curr=head;
        while(temp!=null){
            if(curr.val!=temp.val){
                curr.next=temp;
                curr=curr.next;
            }
            temp=temp.next;
        }
        curr.next=null;
        return dummy.next;
    }
}
