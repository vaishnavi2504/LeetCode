//https://leetcode.com/problems/fizz-buzz/

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ip="";
            if(i%3!=0&&i%5!=0){
                ip+=i;
                res.add(ip);
            }
            if(i%3==0&&i%5!=0)res.add("Fizz");
            if(i%3!=0&&i%5==0)res.add("Buzz");
            if(i%3==0&&i%5==0) res.add("FizzBuzz");
            
        }
        return res;
        
    }
}
