//One pass , 1 count array solution

public class Solution {
    public String getHint(String secret, String guess) {
        char[] se=secret.toCharArray();   
        char[] gu=guess.toCharArray();
      
        int[] map1=new int[10];
        int bull=0,cow=0;
        for(int i=0;i<se.length;i++){
            if(se[i]==gu[i])bull++;
            else{
                if(map1[se[i]-'0']<0)cow++;
                if(map1[gu[i]-'0']>0)cow++;
                
                map1[se[i]-'0']++;
                map1[gu[i]-'0']--;
            }
        }
        String res=bull+"A"+cow+"B";
        return res;
    }
}