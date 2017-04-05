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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(!q.isEmpty()){
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                TreeNode curr=q.remove();
                res=curr.val;
                if(curr.right!=null)q.add(curr.right);
                if(curr.left!=null)q.add(curr.left);
                
            }
        }return res;
    }
}