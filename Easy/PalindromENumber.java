//https://leetcode.com/problems/palindrome-number/

//Handles overflow condition

public class Solution {
    public boolean isPalindrome(int x) {
        int rev=rev(x);
        return (x==rev);
    }
    
    public int rev(int x){
	        int ans=0;
	        while(x>0){
	            ans=ans*10+x%10;
	            x=x/10;
	        }
	  return ans;
	}
}
