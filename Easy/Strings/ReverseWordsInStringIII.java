//Reverse Words in a String III

//Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description

public class Solution {
    public String reverseWords(String s) {
        Map<String,String> map=new LinkedHashMap<>();
        String[] parts=s.split(" ");
        for(String x :parts){
            if(!map.containsKey(x)){
                String rev=new StringBuilder(x).reverse().toString();
                map.put(x,rev);
            }
        }
        int i=0;
        StringBuilder sb=new StringBuilder();
        for(String x: parts){
            sb.append(map.get(x));
            if(i!=parts.length-1)sb.append(" ");
            i++;
        }
        return new String(sb);
    }
}