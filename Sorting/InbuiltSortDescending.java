// Time complexity: O(nlogn)
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortDescending {
    public static void main(String[] args) {
        Integer arr[]={3,6,7,88};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
