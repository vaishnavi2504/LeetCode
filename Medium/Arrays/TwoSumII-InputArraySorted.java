https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
//167. Two Sum II - Input array is sorted

//Approach1: lengthy bin search code

public class Solution {
    
    public int binSearch(int[] a, int key, int l, int h){
        int res=-1;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]==key)return mid;
            else if(a[mid]>key){
                h=mid-1;
            }else l=mid+1;
        }return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        for(int i=0;i<numbers.length;i++){
            int sv=binSearch(numbers,target-numbers[i],i+1,numbers.length-1);
            if(sv!=-1){
                res[0]=i+1;
                res[1]=sv+1;
                return res;
            }
        }return res;
    }
}

//Approach 2: using 2 pointers
public class Solution {
    public int[] twoSum(int[] a, int target) {
        int l=0,h=a.length-1;
        int[] res=new int[2];
        while(l<=h){
            long v=a[l]+a[h];
            if(target==v){
                res[0]=l+1;
                res[1]=h+1;
                return res;
            }else if(v>target)h--;
            else l++;
        }return res;
    }
}