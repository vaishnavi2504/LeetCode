//https://leetcode.com/problems/largest-number/?tab=Description
//Use comparator

public class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        int i=0;
        for(i=0;i<nums.length;){
            if(nums[i]==0)i++;
            else break;
        }
        if(i==nums.length)return "0";
        i=0;
        for(int x:nums)str[i++]=x+"";
        
        /**
         * Consider an array of numbers 3, 12,10
         * the below comparator first picks up 2 numbers 3, 12-. possible strings 312 and 123. returns 312- array w'd be 3, 12, 10
         * then picks up 12, 10  returns 1210-.reulting array would be 3 ,12,10
         * Final sorted array would have 3 ,12,10 implying 31210 is the largest possible number
         * */
        Comparator<String> cmp=new Comparator<String>(){
            public int compare(String s1, String s2){
                String a=s1+s2;
                String b=s2+s1;
                return b.compareTo(a);
            }
        };
        
        Arrays.sort(str,cmp);
        StringBuilder sb=new StringBuilder();
        for(String a:str){
            sb.append(a);
        }
        return sb.toString();
        
    }
}