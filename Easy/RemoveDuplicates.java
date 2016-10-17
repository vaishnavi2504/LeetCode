
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
        
        ListNode temp=head;
        if(temp==null)return null;
        while(temp.next!=null){
            
            while(temp.val==temp.next.val){
                if(temp.next.next!=null){
                    temp.next=temp.next.next;
                    
                }   
                else{
                    temp.next=null;
                    return head;
                }
            }
           if(temp.next!=null) temp=temp.next;
        }
        return head;
    }
}
