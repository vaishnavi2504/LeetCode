//https://leetcode.com/problems/keyboard-row/



public class Solution {
    public String[] findWords(String[] words) {
        
        //Initializations
        Set<Character> row1=new HashSet<>();
        Set<Character> row2=new HashSet<>();
        Set<Character> row3=new HashSet<>();
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        int f=0,s=0,t=0;
        boolean skip=false;
        
        List<String> res=new ArrayList<>();
        
        //Create a 3 hashsets for each of 3 rows
        for(int i=0;i<r1.length();i++){
            char c=r1.charAt(i);
            row1.add(c);
        }
        
        for(int i=0;i<r2.length();i++){
            char c=r2.charAt(i);
            row2.add(c);
        }
        
        for(int i=0;i<r3.length();i++){
            char c=r3.charAt(i);
            row3.add(c);
        }
        
        for(String a:words){
            skip=false;
            f=0;s=0;t=0;
            String x=a.toLowerCase();
            for(int i=0;i<x.length();i++){
                char c=x.charAt(i);
                if(s==0&&t==0&&row1.contains(c))f=1;
                else if(f==0&&t==0&&row2.contains(c))s=1;
                else if(s==0&&f==0&&row3.contains(c))t=1;
                else if((f==1&&row2.contains(c))||(f==1&&row3.contains(c))||(t==1&&row2.contains(c))||(t==1&&row1.contains(c))){
                    skip=true;
                    break;
                }
                else if((f==1&&row3.contains(c))||(f==1&&row2.contains(c))||(s==1&&row3.contains(c))||(s==1&&row1.contains(c))){
                    skip=true;
                    break;
                }else ;
            }
            if(!skip)res.add(a);
        }
        String[] res1=new String[res.size()];
        int k=0;
        for(String x:res)res1[k++]=x;
        return res1;
        
        
    }
}
