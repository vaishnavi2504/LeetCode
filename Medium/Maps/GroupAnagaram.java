//https://leetcode.com/problems/anagrams/

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            List<String> l=new ArrayList<>();
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String g=new String(c);
            if(!hm.containsKey(g)){
                List<String> h=new ArrayList<>();
                h.add(s);
                hm.put(g,h);
            }
            else{
                List<String> o=hm.get(g);
                o.add(s);
                hm.put(g,o);
            }
            
        }
       for(String j:hm.keySet())res.add(hm.get(j));
        return res;
    }
}
