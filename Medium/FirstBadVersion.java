//https://leetcode.com/problems/first-bad-version/?tab=Description

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,h=n;
        int mid=-1;
        while(l<h){
            //to avoid overflow
            mid=(l)+(h-l)/2;
            if(isBadVersion(mid)){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return h;
    }
}