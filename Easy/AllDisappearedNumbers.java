// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

//@ methods to solve
//Method 1 - Verbose with corner cases handles seperately
// Check for method 2 from line 45

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        Arrays.sort(a);
        List<Integer> res=new ArrayList<Integer>();
        int chk=0,n=a.length;
        
        //empty array
        if(n==0)return res;
        
        //if the first number is not 1
        if(a[0]!=1){
            chk=1;
            while(chk<a[0])res.add(chk++);
        }
        
        //Missing numbers in between
        for(int i=0;i+1<a.length;){
            if(a[i+1]-a[i]<=1)i++;
            else{
                chk=a[i]+1;
                while(chk<a[i+1]){
                    res.add(chk);
                    chk++;
                }
                i++;
            }
            
        }
        
        //If the last number is not n
        if(a[n-1]!=n){
            chk=a[n-1];
            while(chk<n)res.add(++chk);
        }
        return res;
    }
}

//Method 2: traverses the entire array and places the negative of the seen number at the index of the number
//Traverses the array once again: indices with arrray contents greater than 1 is added to the list
//No need to sort the array, so pretty efficient

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        
        List<Integer> res=new ArrayList<Integer>();
        int max=a.length;
     
        for(int i=0;i<max;i++){
            int val=Math.abs(a[i])-1;
            if(a[val] > 0)a[val]=-a[val];
        }
        
        for(int i=0;i<max;i++){
            if(a[i]>0)res.add(i+1);
        }
        return res;
    }
}
