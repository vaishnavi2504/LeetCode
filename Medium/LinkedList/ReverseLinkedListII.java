//https://leetcode.com/problems/reverse-linked-list-ii/?tab=Description

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    if(head == null) return null;
    //Handles corner case. if m=1 and m=length of list then entire list needs to be reversed
    ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
    dummy.next = head;
    ListNode pre1 = dummy; // make a pointer pre as a marker for the node before reversing
    for(int i = 0; i<m-1; i++) pre1 = pre1.next;
    ListNode start=pre1.next,pre=null,nxt=null;
    ListNode temp=start;
     for(int i=0; i<=n-m; i++){
         nxt=start.next;
         start.next=pre;
         pre=start;
         start=nxt;
     }     
     temp.next=start;
     pre1.next=pre;
     return dummy.next;        
    }
}

