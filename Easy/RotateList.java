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
        if(head==null)return null;
        if(head==null||head.next==null||k==0)return head;
        ListNode dummy=new ListNode(0);
        ListNode temp=head;
        int n=1;
        //traverse till end to compute length
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        
        if(k>=n){
            k=k%n;
            if(k==0)return head;
            
        }
        
            //connect last node to the actual head
            temp.next=head;
            
            int chk=1;
            ListNode temp1=head;
            //traverse till the node where you have to break the connection
            while(chk!=(n-k)%n){
                chk++;
                temp1=temp1.next;
            }
            
            dummy.next=temp1.next;
            temp1.next=null;
            return dummy.next;
         
        
    }
        
}
