//https://leetcode.com/problems/add-one-row-to-tree/description/
//623. Add One Row to Tree

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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode curr=new TreeNode(v);
            curr.left=root;
            return curr;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        //collect all nodes at depth d-1 and put them in queue
        for(int i=1;i<d-1;i++){
            int qsize=q.size();
            for(int j=0;j<qsize;j++){
                TreeNode pre=q.poll();
                if(pre.left!=null)q.add(pre.left);
                if(pre.right!=null)q.add(pre.right);
            }            
        }
        while(!q.isEmpty()){
            TreeNode a=q.poll();
            //save left and right in temp before you make reconnections
            TreeNode temp=a.left;
            a.left=new TreeNode(v);
            a.left.left=temp;
            temp=a.right;
            a.right=new TreeNode(v);
            a.right.right=temp;
        }
        return root;
    }
}