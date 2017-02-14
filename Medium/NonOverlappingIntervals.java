//https://leetcode.com/problems/non-overlapping-intervals/

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
    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0)  return 0;
        Arrays.sort(intervals,new myComparator());
        int e=intervals[0].end;
        int count=0;
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<e)count++;
            //update the end time to the current end time if the interval is considered
            else e=intervals[i].end;
        }
        return count;
    }
    
}

//Custo comparator
class myComparator implements Comparator<Interval> {
    public int compare(Interval a, Interval b) {
            return a.end - b.end;
    }
}
