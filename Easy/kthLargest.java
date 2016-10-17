//https://leetcode.com/problems/kth-largest-element-in-an-array/

//Linnear time-- no sorting done

public class Solution {
    public void swap(int[] a , int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public int partition(int[] a, int s, int e,int k){
        int pIndex=s;
        int pivot=e;
        for(int i=s;i<e;i++){
            if(a[i]<a[pivot]){
                swap(a,i,pIndex);
                pIndex++;
            }
        }
        swap(a,pIndex,e);
        if(pIndex==k-1)return a[pIndex];
        else if(pIndex>k-1)return partition(a,s,pIndex-1,k);
        else return partition(a,pIndex+1,e,k);
    }
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        return partition(nums,0,n-1,n-k+1);
    }
}

