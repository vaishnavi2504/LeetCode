//https://leetcode.com/problems/sum-of-left-leaves/#/description
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sumOfLLeaves=0;
        while(!q.isEmpty()){
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                TreeNode curr=q.remove();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                if(curr.left!=null&&curr.left.left==null&&curr.left.right==null){
                    sumOfLLeaves+=curr.left.val;
                }
            }
        }
        return sumOfLLeaves;
    }
}