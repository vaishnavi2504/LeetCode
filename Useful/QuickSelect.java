//Quick select algorithm to find the kth smallest element in the unsorted array

class QuickSelect{
      void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
      
      //Returns kth smallest element starting from 0
      //n-1th smallest element= 1st largest element
      public int quickSelect(int[] a, int l, int h, int k){
          int pivot=a[h],pIndex=l;
          for(int i=l;i<h;i++){
              if(a[i]<=pivot){
                  swap(a,i,pIndex);
                  pIndex++;
              }
          }
          
          swap(a,pIndex,h);
          if(k==pIndex)return a[pIndex]);
          else if(k>pIndex){
              return quickSelect(a,l,pIndex-1,k);
          }else return quickSelect(a,pIndex+1,h,k);          
        
      }
  
}
