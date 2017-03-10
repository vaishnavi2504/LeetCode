/**
 Given a string, determine a character and it's number of continius occurances
 example aaabuua will be a3b1u2a1
**/

public static void stringCompression(String s){
		 int n=s.length();
		 char[] c=s.toCharArray();
		 int count=0;
		 StringBuilder sb=new StringBuilder();
		 int i;
		 for( i=0;i+1<n;){
			 count=1;
			 while(i+1<n&&c[i]==c[i+1]){
				 count++;
				 i++;
			 }
			 sb.append(c[i]);
			 sb.append(count);
			 i++;			 
		 }
		 if(c[n-2]!=c[n-1]){
			 sb.append(c[n-1]);
			 sb.append(1);
		 }		 
		 System.out.println(sb+" "+i);
	}
