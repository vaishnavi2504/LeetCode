//https://leetcode.com/problems/continuous-subarray-sum/#/description
//523

//Approach1: Brute Force O(n^2)
public class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int n=a.length;        
        for(int i=0;i<n;i++){
            int sum=a[i];
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                if(k != 0) {
                    if(sum%k ==0) return true;
                } else {
                    if(sum==0) return true;
                }
          
            }
         
        }return false;
    }
}

//Approach 2: O(n) and O(k) space
public class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(k!=0)sum%=k;
            Integer lastSeen=map.get(sum);
            if(lastSeen!=null){
                //To check if length is greater than 1
                if(i-lastSeen>1){
                    return true;
                }
                map.put(sum,i);
            }
        }return false;
    }
}
