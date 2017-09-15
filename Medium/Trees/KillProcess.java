//https://leetcode.com/problems/kill-process/#/description
//582. Kill Process

public class Solution {
    
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<ppid.size();i++){
             List<Integer> childList;
            if(!map.containsKey(ppid.get(i))) childList=new ArrayList<>();
            else childList=map.get(ppid.get(i));                
            
            childList.add(pid.get(i));
            map.put(ppid.get(i),childList);
        }
        
        List<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(kill);
        while(!q.isEmpty()){
            int curr=q.remove();
            res.add(curr);
            if(map.get(curr)!=null){
                  for(int y:map.get(curr))q.add(y);
            }
        }
        if(res.size()==0)res.add(kill);
        return res;
    }
}
