public class Solution {
    
    public int binToint(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            int c=(int)s.charAt(i)-'0';
            res+=c*(int)Math.pow(2,s.length()-1-i);
        }
        return res;
    }
    public int findComplement(int num) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(num!=0){
            count=num&1;
            if(count==1)sb.append("0");
            else sb.append("1");
            num=num>>>1;
        }
         return binToint(new String(sb.reverse()));
        
    }
}
