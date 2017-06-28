// 82. Remove Duplicates from Sorted List II
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/#/description

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
        if(head==null)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode temp=head;
        while(temp!=null){
            while(temp.next!=null&&temp.val==temp.next.val)temp=temp.next;
            if(prev.next==temp){
                prev=prev.next;
            }else{
                prev.next=temp.next;
            }
            temp=temp.next;
        }
        return dummy.next;
        
    }
}
