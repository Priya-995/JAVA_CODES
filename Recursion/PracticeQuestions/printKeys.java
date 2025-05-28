import java.util.ArrayList;
import java.util.List;

//Question1:For a given integer arrayofsizeN.You have tofind  allthe occurrences(indices)ofa given element(Key) and print them.Use a recursivefunction to solve this problem.

public class printKeys {
    public static void print_keys(int[] arr,int idx, int key){
        if(idx==arr.length){
            return;
        }
        if(key==arr[idx]){
            System.out.print(idx+" ");
        }
        print_keys(arr, idx+1, key);

    }
    public static List<Integer> get_keys(int[] arr,int idx, int key,List<Integer> result){
         if(idx==arr.length){
            return result;
        }
        if(key==arr[idx]){
           result.add(idx);
        }
        return get_keys(arr, idx+1, key, result);


    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        // print_keys(arr,0,key);
        //optimized
        List<Integer> ans= get_keys(arr,0,key,new ArrayList<>());
        System.out.println(ans);
        
    }
}
