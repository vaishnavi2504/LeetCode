//https://leetcode.com/problems/top-k-frequent-elements/?tab=Description
//3 approaches

//Approach1: using custom comparator for priorityQueue
public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(!hm.containsKey(x))hm.put(x,1);
            else hm.put(x,hm.get(x)+1);
        }
       
         PriorityQueue<HashMap.Entry<Integer, Integer>> pq=new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
	                public int compare(Map.Entry<Integer, Integer> w1, Map.Entry<Integer, Integer> w2) {                    
	                    return w2.getValue().compareTo(w1.getValue());  
	                }      
	    });  	  
        
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            pq.offer(e);
        }
        List<Integer> res=new ArrayList<>();
        int count=0;
        while(count<k){
            res.add(pq.poll().getKey());
            count++;
        }
        return res;
}

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


//Approach 2- using PQ 

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
       Set<Integer> st=new HashSet<>();
       List<Integer> res=new ArrayList<Integer>();
       //Populate hashMap
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int x: nums){
           if(!hm.containsKey(x))hm.put(x,1);
            else hm.put(x,hm.get(x)+1);
       }
       
       //Use set to store all possible values
       for(int x:hm.keySet())st.add(hm.get(x));
       
       PriorityQueue < Integer >  pq = new PriorityQueue < Integer >(Collections.reverseOrder());
       Iterator<Integer> stit=st.iterator();
       
       while(stit.hasNext()){
           pq.offer(stit.next());
       }
       
       while(pq.peek()!=null){
           List<Integer> al=keyFromVal(hm,(int)pq.poll());
           Iterator<Integer> it1=al.iterator();
           while(it1.hasNext()){
               res.add(it1.next());
               if(res.size()==k)return res;
           }
       }
       return res;
       
    }
    
    //fetches key from value
    public List<Integer> keyFromVal(HashMap<Integer,Integer> hm, int x){
      List<Integer> res=new ArrayList<>();
        for(int y:hm.keySet()){
            if(x==hm.get(y)){
                res.add((int)(y));
            }
        }return res;
    }
  
}
