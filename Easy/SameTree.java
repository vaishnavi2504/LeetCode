//https://leetcode.com/problems/same-tree/
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(q==null&&p!=null)return false;
        if(p==null&&q!=null)return false;
        if(p.val!=q.val)return false;
        
        else return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        
    }
}
