// Time complexity: O(nlogn)
import java.util.Arrays;

public class InbuiltSortAscending {
      public static void main(String[] args) {
        Integer arr[]={3,6,7,88,1,2};
        Arrays.sort(arr,0,3); // Sort array from index 0 to 2
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
