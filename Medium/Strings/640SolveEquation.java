

public class Solution {
    //Algorithm: split string into lhs and rhs
    // identify co-eff of x and const in both lhs and rhs
    //coeffx(lhs)-coeff(rhs)=const(rhs)-const(lhs)
    //final ans x=(const from prev step)/co-eff from prev step
    // Check for corner cases
    //Use lookbehind regex to retain previous delimeter sign 
    //exp.split("(?=[-+])"); splits based on + or -, and retains delimeter as part of split
    
    public String solveEquation(String equation) {
        String res=" ";
        String[] parts=equation.split("=");
        
        int[] lhs=process(parts[0]);
        int[] rhs=process(parts[1]);
        int coef=lhs[0]-rhs[0];
        int num=rhs[1]-lhs[1];
        
        if(coef==0&&num==0)return "Infinite solutions";
        else if(coef==0&&num!=0)return "No solution";
        else return ("x=")+(num/coef);              
    }
    
    //Processes lhs and rhs part of the expression
    public int[] process(String exp){
        int[] res=new int[2];
        String[] tokens = exp.split("(?=[-+])");
        for(String a:tokens){
            if(a.equals("x")||a.equals("+x"))res[0]+=1;
            else if(a.equals("-x"))res[0]-=1;
            else if(a.contains("x"))res[0]+=Integer.parseInt(a.substring(0,a.indexOf("x")));
            else res[1]+=Integer.parseInt(a.substring(0,a.length()));            
        }return res;
    }
}