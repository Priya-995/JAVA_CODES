

public class Insertion_sort {
    public static void printArr(int arr[]){
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]={7,2,9,1,3};
        for(int i=1;i<arr.length;i++){
          int current=arr[i];
          int j=i-1;
          while(j>=0&&current<arr[j]){
           arr[j+1]=arr[j];
            j--;
          }
          //placement
          arr[j]=current;

        }
    }
    
}
