//https://leetcode.com/problems/binary-tree-right-side-view/#/description

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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        q.add(root);
        while(!q.isEmpty()){
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                TreeNode curr=q.remove();
                if(i==qsize-1)res.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return res;
    }
}