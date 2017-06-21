//https://leetcode.com/problems/subtree-of-another-tree/#/description
//572. Subtree of Another Tree 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 // Approach1: Iterative version
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(s);
        boolean res=false;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr.val==t.val){
              if(isSameTree(curr,t))return res;
            }
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }return false;
    }
    
    
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        Stack<TreeNode> q1=new Stack<>();
        Stack<TreeNode> q2=new Stack<>();
        q1.push(p);
        q2.push(q);
        while(!q1.isEmpty()&&!q2.isEmpty()){
            TreeNode curr1=q1.pop();
            TreeNode curr2=q2.pop();
            if(curr1.val!=curr2.val)return false;
            
            if(curr1.left!=null)q1.push(curr1.left);
            if(curr2.left!=null)q2.push(curr2.left);
            
            if(q1.size()!=q2.size())return false;
            
            if(curr1.right!=null)q1.push(curr1.right);
            if(curr2.right!=null)q2.push(curr2.right);
        }
        return (q1.isEmpty()&&q2.isEmpty())?true:false;
    }
}

//Approach 2; Recursive version
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null||t==null)return false;
        if(s==null||t==null)return false;
        if(isSameTree(s,t))return true;
        else{
            return isSubtree(s.left,t)||isSubtree(s.right,t);
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        
    }
}