public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int l=str.length();
        for(int i=l/2;i>=1;i--){
            //Check if l is a factor of i
            if(l%i==0) {
                int pieces=l/i;
                String sub=str.substring(0,i);
                StringBuilder sb=new StringBuilder();
                //Create multiple copies of the part that you feel might repeat
                for(int j=0;j<pieces;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(str))return true;
            }
        }return false;
        
    }
}
