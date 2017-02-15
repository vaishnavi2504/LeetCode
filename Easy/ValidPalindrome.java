//https://leetcode.com/problems/valid-palindrome/

public class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c))sb.append(c);
        }
        if(sb.toString().equals(sb.reverse().toString()))return true;
        return false;
        
    }
}
