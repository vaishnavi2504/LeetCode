
//https://leetcode.com/problems/find-largest-value-in-each-tree-row/#/description
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int i=0;i<levelSize;i++){
                TreeNode curr=q.remove();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                pq.offer(curr.val);
            }
            res.add(pq.remove());
        }
        return res;
    }
}