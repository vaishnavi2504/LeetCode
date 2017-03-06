//https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode prev=new ListNode(0);
         ListNode head=prev;
        int carry=0,sum=0;
        while(l1!=null||l2!=null||carry!=0){
            ListNode cur=new ListNode(0);
            sum=((l1==null)?0:l1.val)+((l2==null)?0:l2.val)+carry;
            cur.val=sum%10;
            carry=sum/10;
            prev.next=cur;
            prev=cur;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        return head.next;
        
    }
}
