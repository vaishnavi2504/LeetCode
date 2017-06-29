//https://leetcode.com/problems/rotate-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        
        int numNodes=0,count=0;
        ListNode temp=head;
        while(temp!=null){
            numNodes++;
            temp=temp.next;
        }
        k=(k%numNodes);
        if(k==0)return head;
        ListNode oldHead=head;
        temp=head;
        while(count!=(numNodes-k-1)){
            count++;
            temp=temp.next;
        }
        
        head=temp.next;
        temp.next=null;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=oldHead;
        return head;        
        
    }
}
