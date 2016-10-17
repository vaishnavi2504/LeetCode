//https://leetcode.com/problems/symmetric-tree/

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
    
    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))return true;
        else return isSymmetricHelper(root.left,root.right);
    }
    
    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left==null||right==null)return left==right;
        else if(left.val!=right.val)return false;
        else return isSymmetricHelper(left.left,right.right)&&isSymmetricHelper(left.right,right.left);
    }
}
