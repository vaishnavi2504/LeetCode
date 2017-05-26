//https://leetcode.com/problems/add-two-numbers-ii/#/description

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode reverseList(ListNode head){
        ListNode curr=head,prev=null,nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head=prev;
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverseList(l1);
        l2=reverseList(l2);
        int carry=0,sum=0;
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        ListNode curr=null;
        while(l1!=null||l2!=null||carry!=0){
            int val1=(l1==null)?0:l1.val;
            int val2=(l2==null)?0:l2.val;
            sum=val1+val2+carry;
            carry=sum/10;
            curr=new ListNode(sum%10);
            dummy.next=curr;
            dummy=curr;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        return reverseList(head.next);
        
    }
}