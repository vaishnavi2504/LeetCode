public class Solution {
    public String complexNumberMultiply(String s1, String s2) {
        int a=0,b=0,c=0,d=0;
        boolean flag=true;
        //problem reduces to (a+bi)*(c+di)=(ac-bd)+(ad+bc)i
        String[] arr=s1.split("\\+");
         for (int i=0;i<arr.length;i++) {
	            if(i==0)a =(int) Integer.valueOf(arr[i]);	                
	            else b =(int) Integer.valueOf(arr[i].substring(0,arr[i].length()-1));
	     }	     
         String[] arr2=s2.split("\\+");
         for (int i=0;i<arr.length;i++) {
	            if(i==0)c =(int) Integer.valueOf(arr2[i]);	                
	            else d =(int) Integer.valueOf(arr2[i].substring(0,arr2[i].length()-1));
	     }
        
        int realPart=((a*c)-(b*d));
        int compPart=((a*d)+(b*c));
        
        String ans=realPart+"+"+compPart+"i";
        return ans;
    }
}