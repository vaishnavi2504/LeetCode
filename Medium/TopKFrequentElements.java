public class Solution {
    
    public static List getKey(Map hm, int v){
		 List<Integer> al=new ArrayList<>();
	        for(Object x:hm.keySet()){
	            if(hm.get(x).equals(v))al.add((int)x);
	        }
	        return al;
	 }
	 
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(!hm.containsKey(x))hm.put(x,1);
            else hm.put(x,hm.get(x)+1);
        }
        
        int[] val=new int[hm.size()];
	        int i=0;
	        for(int x:hm.values()){
	        	val[i++]=x;
	        }
	        Arrays.sort(val);
	        
	        int j=val.length-1;
	        int ans=0;
	        while(k!=0){
	        	List<Integer> res1=new ArrayList<Integer>();	        	
	        	res1=getKey(hm,val[j--]);
	        	Iterator it=res1.iterator();
	        	while(it.hasNext()){
	        		res.add((int)it.next());
	        		k--;
	        	}
	        }
       return res; 
    }
}
