//Binary serach to find first and last occurance of a given element in a sorted array
//Finds the last occurance of the given element
public int binSearchf(int[] a, int target) {
        int n=a.length;
        int l=0,h=n-1,mid=0,found=-1;
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]<target){
                l=mid+1;
            }else if(a[mid]>target){
                h=mid-1;
            }else{//Proceed the search to the right of the found element
                found=mid;
                l=mid+1;
            } 
        }return found;
    }
	
  //Finds the first occurance of the given element
	 public static int binSearchb(int[] a, int target) {
	        int n=a.length;
	        int l=0,h=n-1,mid=0,found=-1;
	        while(l<=h){
	            mid=(l+h)/2;
	            if(a[mid]<target){
	                l=mid+1;
	            }else if(a[mid]>target){
	                h=mid-1;
	            }else{//Proceed the search to the left of the found element
	                found=mid;
	                h=mid-1;
	            } 
	        }return found;
	    }
