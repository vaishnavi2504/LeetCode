/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Comparator<Interval> cmp=new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start-b.start;
            }
        };
        //Sort intervals based on the comparator defined above
        intervals.sort(cmp);
        List<Interval>  res=new ArrayList<Interval>();
        //Corner cases
        if(intervals.size()<=0)return res;
        if(intervals.size()==1){
            res.add(new Interval(intervals.get(0).start,intervals.get(0).end));
            return res;
        }
        
        Iterator<Interval> it=intervals.iterator();
        Interval curr=it.next(),nxt=null;
        int cs=curr.start,ce=curr.end,ns=0,ne=0;
        if(it.hasNext())nxt=it.next();
        
        //Used fail safe iterator
        while(nxt!=null){
            ns=nxt.start;
            ne=nxt.end;
            //Merge 2 intervals
            if(ce>=ns){
                ce=Math.max(ce,ne);
                cs=Math.min(cs,ns);
            }else if(cs==ns&&ce==ne){
                cs=ns;
                ce=ne;
            }
            else{
                Interval sub=new Interval();
                flag=true;
                sub.start=cs;
                sub.end=ce;
                res.add(sub);
                cs=ns;
                ce=ne;
            }
            if(it.hasNext())nxt=it.next();
            else nxt=null;
        }
            Interval sub=new Interval();
            sub.start=cs;
            sub.end=ce;
            res.add(sub);
   
        return res;
    }
}