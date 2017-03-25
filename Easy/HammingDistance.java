public class Solution {
    
    //checks if ith bit of a number is set
    public  boolean getBit(int n, int i){
		return (((n & (1<<i))!=0));
	}
	
    public int hammingDistance(int x, int y) {
        int count=0;
       for(int i=0;i<32;i++){
			if(getBit(x,i)&&getBit(y,i)||!getBit(x,i)&&!getBit(y,i));
			else count++;			
	   }
        return count;
    }
}