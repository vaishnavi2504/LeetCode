//https://leetcode.com/problems/find-bottom-left-tree-value/

public class Solution {
    
     public List<Integer> levelOrderTrav(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        
        q.offer(root);
        while(!q.isEmpty()){
            int numNodes=q.size();
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<numNodes;i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                sub.add(q.peek().val);
                q.remove();
            }
            res.add(sub);
        }
        
        Iterator<List<Integer>> it=res.iterator();
        List<Integer> p=new ArrayList();
        List<Integer> g=new ArrayList();
        p=it.next();
        g=p;
        
        while(p!=null){
            if(it.hasNext()){
                p=it.next();
                g=p;
            }else p=null;
        }
        return g;
    }
    
    
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null&&root.right==null)return root.val;
        List<Integer> lastRow=levelOrderTrav(root);
        System.out.println(lastRow);
        return lastRow.get(0);
        
    }
}
