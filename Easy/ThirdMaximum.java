//https://leetcode.com/problems/third-maximum-number/
// There are 2 approaches

//Method1 using hash map
public class Solution {
    public int thirdMax(int[] arr) {        
       Map<Integer,Integer> tm = new TreeMap<>();
       for(int x:arr){
           if(!tm.containsKey(x))tm.put(x,1);
       }       
       if(tm.size()==1)return (int)tm.keySet().toArray()[0];
       if(tm.size()==2)return (int)tm.keySet().toArray()[1];
       else return (int)tm.keySet().toArray()[tm.size()-3];
       
    }
}

//method 2 using arrays// Time complx= 3*(O(n))
public int thirdMax(int[] arr) {
       int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE,flag=0;
       
       //fIRST MAX
       for(int x:arr){
           if(x>max1)max1=x;
       }
       
       //Second max
       for(int x:arr){
           if(x>max2&&max1!=x)max2=x;
       }
       
       //third max
       for(int x:arr){
           if(x>=max3&&max1!=x&&max2!=x){
               max3=x;
               if(x==Integer.MIN_VALUE)flag=1;
           }
       }
       
       if(max3!=Integer.MIN_VALUE||flag==1)return max3;
       
       else return max1;
       
}     
