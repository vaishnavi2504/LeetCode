/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //version 1
 //Used O(n) space but works and simpler logic
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null)return;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        ListNode[] arr=new ListNode[len];
        temp=head;
        arr[0]=head;
        for(int i=0;i<len;i++){
            arr[i]=temp;
            temp=temp.next;
        }
        
        //When the length is odd
        if(len%2!=0){
            for(int i=0;i<=len/2;i++){
                if(i==(len/2)){
                    arr[i].next=null;
                    break;
                }else{
                    arr[i].next=arr[len-i-1];
                    arr[len-i-1].next= arr[i+1];
                }
            }
        }
        
        //For even length
        else{
            for(int i=0;i<len/2;i++){
                arr[i].next=arr[len-i-1];
                arr[len-i-1].next= ((len-i-1)!=len/2)? arr[i+1]:null;
            }
        }
        
    }
}