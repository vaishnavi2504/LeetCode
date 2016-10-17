//https://leetcode.com/problems/validate-binary-search-tree/

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
    public boolean isValidBST(TreeNode root) {
        if(isValidBSTHelper(root,Long.MIN_VALUE, Long.MAX_VALUE))return true;
        else return false;
    }
    
    public boolean isValidBSTHelper(TreeNode root,long min, long max){
        if(root==null )return true;
        else if((root.val>min&&root.val<max)){
            return (isValidBSTHelper(root.left,min,root.val))&&
            (isValidBSTHelper(root.right,root.val,max));
        }
        else return false;
    } 
    
    
}
