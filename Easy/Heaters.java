// https://leetcode.com/problems/heaters/

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        //Find the position of the nearest heater for each house
        //Then find the max distance from the nearest heater to each house
        int j=0,res=0;
        for(int i=0;i<houses.length;i++){
            while(j<heaters.length-1&&Math.abs(houses[i]-heaters[j])>=Math.abs(houses[i]-heaters[j+1])){
                j++;
            }
            res=Math.max(res,Math.abs(houses[i]-heaters[j]));
        }        
        return res;
    }
}
