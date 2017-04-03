public class Solution {

//2 approaches
//Approach 1 using priority Queue
public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm=new HashMap<>();        
        for(char c:s.toCharArray()){
            if(!hm.containsKey(c))hm.put(c,1);
            else hm.put(c,hm.get(c)+1);
        }        
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(new Comparator<Map.Entry<Character,Integer>>(){
                public int compare(Map.Entry<Character,Integer> w1, Map.Entry<Character,Integer> w2){
                    return w2.getValue().compareTo(w1.getValue());
                }
        });
        
        //Populate the priority Queue based on tthe count in string
        for(Map.Entry<Character,Integer> m:hm.entrySet())  pq.add(m);
        
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            sb.append(pq.remove().getKey());
        }
        System.out.println(sb);
        
        StringBuilder sb1=new StringBuilder();
        for(char c:sb.toString().toCharArray()){
            int count=hm.get(c);
            while(count>0){
                sb1.append(c);
                count--;
            }
        }
        return sb1.toString();
    }
}
    
    //Method to sort the hashmap by values in decreasing order
     public LinkedHashMap<Character, Integer> sortHashMapByValues(HashMap<Character, Integer> passedMap) {
        List<Character> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues,Collections.reverseOrder());
        Collections.sort(mapKeys);

          LinkedHashMap<Character, Integer> sortedMap =new LinkedHashMap<>();
          Iterator<Integer> valueIt = mapValues.iterator();
           while (valueIt.hasNext()) {
               Integer val = valueIt.next();
               Iterator<Character> keyIt = mapKeys.iterator();
               while (keyIt.hasNext()) {
                    Character key = keyIt.next();
                    Integer comp1 = passedMap.get(key);
                    Integer comp2 = val;
                    if (comp1.equals(comp2)) {
                                  keyIt.remove();
                                  sortedMap.put(key, val);
                                  break;
                    }
               }
         }
        return sortedMap;
    }
    
    public Map<Character,Integer> constructMap(String s){
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hm.containsKey(c))hm.put(c,1);
            else hm.put(c,hm.get(c)+1);
        }
        return hm;
    }
    
    public String frequencySort(String s) {
        Map<Character,Integer> hm=constructMap(s);
        LinkedHashMap<Character, Integer>ans=sortHashMapByValues((HashMap<Character, Integer>) hm);
        StringBuilder sb = new StringBuilder();
        Set<Character>al=new HashSet<>();
        al=ans.keySet();
        Iterator<Character> it=al.iterator();
        while(it.hasNext()){
          char c=it.next();
          int rep=ans.get(c);
          for(int i=0;i<rep;i++)sb.append(c);
        }
        String res=new String(sb);
        return res;
    }
}
