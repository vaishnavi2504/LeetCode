//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/#/description
//114. Flatten Binary Tree to Linked List

public class Solution {
    public void flatten(TreeNode root) {
        if(root==null)return;
        //save left and right sub trees of root in a temp variable
        TreeNode l=root.left;
        TreeNode r=root.right;
        //set left pointer to null
        root.left=null;
        
        //flatten left and right recursively
        flatten(l);
        flatten(r);
        
        root.right=l;
        //Find the tail of the flattened left sub tree and to it's right stick flattened right sub tree
        TreeNode temp=root;
        while(temp.right!=null)temp=temp.right;
        temp.right=r;
        
    }
}