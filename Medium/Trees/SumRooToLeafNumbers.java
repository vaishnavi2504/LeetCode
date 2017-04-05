//https://leetcode.com/problems/sum-root-to-leaf-numbers/#/description
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
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        String path="";
        int sum=0;
        List<Integer> al=new ArrayList<>();
        enumerate(root,path,al);
        for(int x:al)sum+=x;
        return sum;
    }
    
    public void enumerate(TreeNode root, String path, List<Integer>al){
        if(root.left==null&&root.right==null){
            path=path+root.val;
            al.add(Integer.valueOf(path));
        }
        if(root.left!=null)enumerate(root.left,path+root.val,al);
        if(root.right!=null)enumerate(root.right,path+root.val,al);
    }
}