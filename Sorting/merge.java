// Time Complexity: O(nlogn)
//Space complexity: O(n)
public class merge {
    public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void mergeSort(int[] arr,int si,int ei){
    //Base case
    if(si>=ei)
      return;

      //mid
      int mid=si+(ei-si)/2;  //or (si+ei)/2
      mergeSort(arr, si, mid); // left end
      mergeSort(arr, mid+1, ei);   //right end
      merge(arr,si,mid,ei);
  }
  //merge method to merge the sorted parts
  public static void merge(int[] arr,int si,int mid,int ei){
    int[] temp=new int[ei-si+1];
   int i=si; //idx for 1st sorted part
   int j=mid+1; //idx for 2nd sorted part
   int k=0;   //idx for temp
   while(i<=mid&&j<=ei){
    if(arr[i]>arr[j]){
      temp[k]=arr[j];
      j++;
    }
    else{
      temp[k]=arr[i];
      i++;
    }
    
    k++;

   }
   //for leftover elements of 1st sorted part
   while(i<=mid){
      temp[k++]=arr[i++];
   }
   // for leftover elements of 2nd sorted part
   while(j<=ei){
    temp[k++]=arr[j++];
   }
   // copy temp array to original array
   for( k=0,i=si;k<temp.length;k++,i++){
       arr[i]=temp[k];
   }

  }
  public static void main(String[] args) {
    int[] arr={2,3,9,-1,8};
    int ei=arr.length-1;
   mergeSort(arr,0,ei);
   printArray(arr);
  } 
}
