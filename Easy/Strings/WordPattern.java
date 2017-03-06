//https://leetcode.com/problems/word-pattern/

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words=str.split("\\s+");
        char[] c=pattern.toCharArray();
        if(c.length!=words.length)return false;
        Map<Character,String>hm=new HashMap<Character,String>();
        for(int i=0;i<c.length;i++){
            if(!hm.containsKey(c[i])){
                if(!hm.containsValue(words[i]))
                hm.put(c[i],words[i]);
                else return false;
            }
            else{
                if(hm.get(c[i]).equals(words[i]));
                else return false;
            }
        }
        return true;
        
    }
}
