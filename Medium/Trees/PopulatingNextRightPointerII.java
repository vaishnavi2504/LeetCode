//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/#/description
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)return;
        Queue<TreeLinkNode> q=new LinkedList<>();
        q.add(root);
        TreeLinkNode nxt=null;
        while(!q.isEmpty()){
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                TreeLinkNode curr=q.remove();
                nxt=(i<qsize-1)?q.peek():null;
                curr.next=nxt;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
    }
}