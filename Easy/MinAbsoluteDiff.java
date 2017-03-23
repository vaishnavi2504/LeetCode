//https://leetcode.com/problems/minimum-absolute-difference-in-bst/#/description

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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        inOrder(root,al);
        
        Iterator<Integer> it=al.iterator();
        int num1=0,num2=0,diff=Integer.MAX_VALUE;
        boolean flag=false;
        
        if(it.hasNext())num1=it.next();
        if(it.hasNext())num2=it.next();
        diff=Math.min(diff,num2-num1);
        
        while(it.hasNext()){
            num1=num2;
            num2=it.next();
            diff=Math.min(diff,num2-num1);
        }
        return diff;
        
    }
    
    public void inOrder(TreeNode root,List<Integer> al){
        if(root==null)return;
        inOrder(root.left,al);
        al.add(root.val);
        inOrder(root.right,al);
    }
}