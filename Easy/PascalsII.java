//https://leetcode.com/problems/pascals-triangle-ii/

public class Solution {

  static List<List<Integer>>al=new ArrayList<List<Integer>>();
  public int[] genPascal(List<Integer> arr,int n){
    		int m=arr.size()+1;
    		if(n==1)return null;
    		List<Integer> brr=new ArrayList<Integer>();
    		brr.add(1);
    		for(int i=1;i<m-1;i++){
    			brr.add(arr.get(i)+arr.get(i-1));			
    		}
    		brr.add(1);
    		n--;
    		al.add(brr);
    		return genPascal(brr,n);
	 }
	
  public List<Integer> getRow(int rowIndex) {
        List<Integer>arr=new ArrayList<Integer>();
        al.clear();
        arr.add(1);
        al.add(arr);
        if(rowIndex==0)return arr;
        
        genPascal(arr,rowIndex+1);
        System.out.println(al.size());
        if(rowIndex==al.size())return al.get(rowIndex-1);
        else return al.get(rowIndex);
        
  }
}
