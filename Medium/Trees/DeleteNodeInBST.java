//https://leetcode.com/problems/delete-node-in-a-bst/#/description
//450. Delete Node in a BST


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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;
        //search in left
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        //search in right
        else if(root.val<key){
           root.right=deleteNode(root.right,key);
        }
        //We found the node to be deleted
        else{
            //when node has only 1 child
            if(root.left==null)return root.right;
            else if(root.right==null)return root.left;
            
            //When the node has both the children
            //Find the least node in the rightmost sub tree
            else{
                root.val=findMin(root.right).val;
                root.right=deleteNode(root.right,root.val);
            }
        }
        return root;
    }
    
    public TreeNode findMin(TreeNode x){
        while(x.left!=null)x=x.left;
        return x;
    }
}