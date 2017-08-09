//https://leetcode.com/problems/serialize-and-deserialize-bst/description/
//449. Serialize and Deserialize BST

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
        if(root==null)return "";
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            TreeNode curr=st.pop();
            sb.append(curr.val).append(",");
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        String s=new String(sb);
        return s.substring(0,s.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))return null;
        Queue<Integer> q=new LinkedList<>();
        String[] p=data.split(",");
        for(String x:p){
            q.add(Integer.parseInt(x));
        }
        return helper(q);
    }
    
    public TreeNode helper(Queue<Integer> q){
        if(q.isEmpty())return null;
        Queue<Integer> sq=new LinkedList<>();
        TreeNode root=new TreeNode(q.remove());
        while(!q.isEmpty()&&q.peek()<root.val)sq.add(q.remove());        
        root.left=helper(sq);
        root.right=helper(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));