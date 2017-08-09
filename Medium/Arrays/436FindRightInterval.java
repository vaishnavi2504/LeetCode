//https://leetcode.com/problems/find-right-interval/description/
//436. Find Right Interval

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
    public int[] findRightInterval(Interval[] intervals) {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        for(int i=0;i<intervals.length;i++){
            map.put(intervals[i].start,i);
        }
        int[] res=new int[intervals.length];
        int i=0;
        for(Interval x:intervals){
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(x.end);
            res[i++]=(entry==null)?-1:entry.getValue();          
        }return res;
        
    }
}