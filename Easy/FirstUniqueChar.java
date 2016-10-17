//https://leetcode.com/problems/first-unique-character-in-a-string/

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer>hm=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hm.containsKey(c))hm.put(c,1);
            else hm.put(c,hm.get(c)+1);
        }
        for(int i=0;i<s.length();){
            char c=s.charAt(i);
            if(hm.get(c)>1)i++;
            else return i;
        }
        return -1;
  }
}
