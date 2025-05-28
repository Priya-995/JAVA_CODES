// Average case Time Complexity : O(nlogn)
// Space Complexity: O(1)
// worst case Time Complexity: O(n^2)
public class quick_sort {
    public static void quickSort(int[] arr,int si, int ei){
    if(si>=ei) return;

    // last element
    int pidx=partition(arr,si,ei);
    quickSort(arr, si, pidx-1); //left
    quickSort(arr, pidx+1, ei);  // right
  }
  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static int partition(int[] arr,int si,int ei){
    int i=si-1; // to make place for els smaller than pivot
    
    int pivot=arr[ei];
    for(int j=si;j<ei;j++){
    if(arr[j]<=pivot){
      i++;
      //swap
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
  }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;

    return i;

  }
  public static void main(String[] args) {
      int arr[]={5,9,-1,4,3};
      quickSort(arr,0,arr.length-1);
      printArray(arr);
  }
}
