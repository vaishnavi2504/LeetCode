//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
//297. Serialize and Deserialize Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "x,";
        StringBuilder sb=new StringBuilder();
        helper(sb,root);
        String s=new String(sb);
        return s.substring(0,s.length()-1);
    }
    
    public void helper(StringBuilder sb, TreeNode root){
        if(root==null){
            sb.append("x,");
            return;
        }
        sb.append(root.val).append(',');
        helper(sb,root.left);
        helper(sb,root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {        
        Queue<String> q=new LinkedList<>();
        String[] p=data.split(",");
        for(String x:p){
            q.add(x);
        }
        return buildTree(q);
    }
    
    public TreeNode buildTree(Queue<String> q){
        String a=q.remove();
        if(a.equals("x"))return null;
        TreeNode root=new TreeNode(Integer.parseInt(a));
        root.left=buildTree(q);
        root.right=buildTree(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));