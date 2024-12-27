//1470.  leetcode (shuffle the array)
public class shuffle_arr {
    public int[] shuffle(int[] nums, int n) {
        int first=0;
        int second=n;
        int[] arr=new int[2*n];
        for(int i=0;i<n;i++){
           arr[first]=nums[i];
           arr[first+1]=nums[second];
           second++;
           first+=2;


        }
        return arr;
    }
}
