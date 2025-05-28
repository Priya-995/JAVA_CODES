// complexity O(n+k) ;k=> range
public class CountingSort {
    public static void countingSort(int[] arr){
        // to calculate range: we find the largest no. in array
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          largest=Math.max(largest,arr[i]);
        }
        int[] count= new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,9,5,6,8};
        countingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        
    }
}
