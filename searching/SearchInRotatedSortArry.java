// Approach: Divide and Conquer
// Time Complexity: O(nlogn)
//input: Sorted, rotated array with distinct numbers (in ascending order) . It is rotated at a pivot point. Find the index of given element.
public class SearchInRotatedSortArry {
    public static int search(int[] arr,int si, int tar,int ei){
        if(si>ei) return -1;
        //kaam
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //mid is on L1
        if(arr[si]<=arr[mid]){
            //case a: L1 left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, si, tar, mid-1);
            }
            //case b: right
            else{
                return search(arr, mid+1, tar, ei);
            }

        }
        //mid is on L2
        else{
            //case a: L2 right
            if(arr[mid]<=tar&& tar<=arr[ei]){
                return search(arr, mid+1, tar, ei);
            }
            // case b: L2 left
            else{
                return search(arr, si, tar, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2}; // this is a rotated sorted array at a pivot point
        int tar=1;
        System.out.println(search(arr,0,tar,arr.length-1));
    }
}
