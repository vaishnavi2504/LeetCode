//https://leetcode.com/problems/number-of-segments-in-a-string/

public class Solution {
    public int countSegments(String s) {
        String[] tok=("x "+s).split(" +");
        return tok.length-1;
    }
}
