//https://leetcode.com/problems/pascals-triangle/

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
	
    public List<List<Integer>> generate(int numRows) {
        List<Integer>arr=new ArrayList<Integer>();
        al.clear();
        if(numRows==0)return al;
        arr.add(1);
        al.add(arr);
        genPascal(arr,numRows);
        return al;
    }
}
