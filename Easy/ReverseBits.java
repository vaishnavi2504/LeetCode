//https://leetcode.com/problems/reverse-bits/

public class Solution {
    // you need treat n as an unsigned value
    
    //Converts binary string to int
     public  long binToint(String s){
    		long ans=0;
    		for(int i=0;i<s.length();i++){
    			int c=(int)s.charAt(i)-'0';
    			ans+=c*(long)Math.pow(2, s.length()-i-1);
    		}
    		return ans;
	 }
	 
	 //converts int to binary string
	 //and then reverses the string
	 public String reverse(int n) {
	        StringBuilder sb=new StringBuilder();
	        int count=0;
	        while(n!=0){
	            count=n&1;
	            sb.append(count);
	            n=n>>>1;
	        }
	        int l=sb.length();
	        for(int i=0;i<32-l;i++)sb.append("0");
	        return new String(sb);
	   }
	 
	 //converts int to binary , then reverses the binary & return corresponding int
     public int reverseBits(int n) {
          String s=  reverse(n);
            return (int)binToint(s);
    }
}
