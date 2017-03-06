/**
  86. Partition List  QuestionEditorial Solution  My Submissions
Total Accepted: 78694
Total Submissions: 254836
Difficulty: Medium
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        TreeSet t1 = new TreeSet();
        Queue<Integer> sml =new LinkedList<>();
        Queue<Integer> grt =new LinkedList<>();
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x)sml.offer(temp.val);
            else grt.add(temp.val);
            temp=temp.next;
        }      
        
        temp=head;
        while(!sml.isEmpty()){
            temp.val=sml.remove();
            temp=temp.next;
        }
        
        while(!grt.isEmpty()){
            temp.val=grt.remove();
            temp=temp.next;
        }
        return head;        
        
    }
}
