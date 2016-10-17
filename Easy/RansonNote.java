//https://leetcode.com/problems/ransom-note/

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ra=ransomNote.toCharArray();
        char[] ma=magazine.toCharArray();
        Map<Character,Integer>hm1=new HashMap<Character,Integer>();
        Map<Character,Integer>hm2=new HashMap<Character,Integer>();
        
        for(char x:ra){
            if(!hm1.containsKey(x))hm1.put(x,1);
            else{
                hm1.put(x,hm1.get(x)+1);
            }
        }
        
        for(char x:ma){
            if(!hm2.containsKey(x))hm2.put(x,1);
            else{
                hm2.put(x,hm2.get(x)+1);
            }
        }
        
        for(Character c:hm1.keySet()){
        	if(hm2.containsKey(c)){
        		if((int)hm1.get(c)<=(int)hm2.get(c));
        		else return false;
        	}
            else return false;
        }
        return true;

    }
}
