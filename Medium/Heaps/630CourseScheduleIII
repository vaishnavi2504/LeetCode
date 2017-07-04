//https://leetcode.com/problems/course-schedule-iii/#/description
//630. Course Schedule III

public class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int start=0;
        for(int[] x:courses){
            start+=x[0];
            pq.offer(x[0]);
            if(start>x[1]){
                start-=pq.poll();
            }
        }
        return pq.size();
    }
}