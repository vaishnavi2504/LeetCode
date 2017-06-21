//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/#/description
// 109. Convert Sorted List to Binary Search Tree

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

	public TreeNode sortedListToBST(ListNode head) {
		return helper(head,null);
    }
    
	//finds middlemost node in a linkedlist
    public ListNode midNode(ListNode head, ListNode tail){
        ListNode fast=head,slow=head;
        while(fast!=tail&&fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }return slow;
    }    
    
    public TreeNode helper(ListNode head, ListNode tail){
        if(head==tail)return null;
        else{
            ListNode mid=midNode(head,tail);
            TreeNode root=new TreeNode(mid.val);
            root.left=helper(head,mid);
            root.right=helper(mid.next,tail);
            return root;
        }        
        
    }
}