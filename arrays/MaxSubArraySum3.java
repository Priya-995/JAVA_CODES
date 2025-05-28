// Using Kadane's Algorithm:- linear time complexity = O(n)
public class MaxSubArraySum3 {
    public static void kadane(int[] arr){
          int currSum=0;
          int maxSum= Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++){
            currSum= currSum+arr[i];
           
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
            
          }
          System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,-4,-1,-2,-1,-5,-3};
        kadane(arr);
        
    }
    
}
