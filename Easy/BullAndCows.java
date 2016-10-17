//https://leetcode.com/problems/bulls-and-cows/

/**
Method1
**/

public class Solution {
    public String getHint(String secret, String guess) {
        char[] a=secret.toCharArray();
        char[] b=guess.toCharArray();
        int bull=0;
        int cow=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                a[i]='a';
                b[i]='a';
                bull++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int u=0;
        int v=0;
        
        for(;u<a.length&&v<b.length;){
            if(a[u]=='a'){
                u++;
                v++;
            }
            else if(a[u]>b[v])v++;
            else if(a[u]<b[v])u++;
            else{
                u++;
                v++;
                cow++;
            }
        }
        
        String res=""+bull+"A"+cow+"B";
        return res;
        
    }
}


//Method 2
public class Solution {
    public String getHint(String secret, String guess) {
        char[] s=secret.toCharArray();
        char[] g=guess.toCharArray();
        int n=g.length;
        int A=0,B=0;
        List<Integer> al1=new ArrayList<Integer>();
        List<Integer> al2=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(s[i]==g[i]){
                A++;
            }
            else{
                al1.add(Integer.parseInt(s[i]+""));
                al2.add(Integer.parseInt(g[i]+""));
            }
    }
    Collections.sort(al1);
		Collections.sort(al2);
    
		//To comapre equal elements from 2 lists
		int i=0,j=0;
		while(i<al1.size()&&j<al2.size()){
			if((int)al1.get(i)==(int)al2.get(j)){
				B++;
				i++;
				j++;
			}
			else if((int)al1.get(i)<(int)al2.get(j))i++;
			else j++;
		}
        String res=""+A+"A"+B+"B";
        return res;
        
    }
}
