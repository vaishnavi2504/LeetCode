public class Solution {

	//Longest Common subsequence
	public static int lcs(char[] a, char[] b){
		int[][] t=new int[a.length+1][b.length+1];		
		for(int i=1;i<t.length;i++){
			for(int j=1;j<t[i].length;j++){				
				if(a[i-1]==b[j-1]){
					//Pick up the diagonal element and add 1
					t[i][j]=t[i-1][j-1]+1;
				}else{
					//Pick max of left and top
					t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
				}				
			}			
		}		
		return t[a.length][b.length];
	}
	
	public static void main(String[] args) {
		String a1="abcdafpq";
		String b1="acbcfpqlx";
		System.out.println(lcs(a1.toCharArray(),b1.toCharArray()));
		
	}
}
	