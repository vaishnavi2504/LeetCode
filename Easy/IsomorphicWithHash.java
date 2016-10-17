//Link to the problem   https://leetcode.com/problems/isomorphic-strings/

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character>hm=new HashMap<Character,Character>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            Character d=t.charAt(i);
            if(!hm.containsKey(c)){
                 if(!hm.containsValue(d))hm.put(c,d);
                 else return false;
                     
                 
            }
            else{
                 Character l=hm.get(c);
                if(!(d.equals(l)))return false;
                else continue;
            }
        }
        return true;
     
    }
}
