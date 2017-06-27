public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0),currmin=0,currmax=0;
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int res=Integer.MIN_VALUE;
        
        for(int i=1;i<arrays.size();i++){
            currmin=arrays.get(i).get(0);
            currmax=arrays.get(i).get(arrays.get(i).size()-1);
            res=Math.max(res,Math.abs(min-currmax));
            res=Math.max(res,Math.abs(max-currmin));
            max=Math.max(max,currmax);
            min=Math.min(min,currmin);
        }
        
        return res;
    }
}