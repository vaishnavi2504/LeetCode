//https://leetcode.com/problems/compare-version-numbers/#/description
//165. Compare Version Numbers

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] part1=version1.split("\\.");
        String[] part2=version2.split("\\.");
        int l=Math.max(part1.length,part2.length);
        int a=0,b=0;
        for(int i=0;i<l;){
            a=(i<part1.length)?Integer.parseInt(part1[i]):0;
            b=(i<part2.length)?Integer.parseInt(part2[i]):0;
            if(a>b)return 1;
            else if(a<b)return -1;
            else i++;
        }
        return 0;
    }
}