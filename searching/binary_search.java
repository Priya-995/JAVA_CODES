// complexity => O(logn)
public class binary_search {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int si=0;
            int li=n-1;
        while(si<=li){
            int mid=si+(li-si)/2;
            if(target==nums[mid]){
              return mid;
            }
            else if(target>nums[mid]){
                si=mid+1;
            }
            else{
                li=mid-1;
            }
        }
        return -1;
    }
}
