// approach one => Brute force approach 
//Complexity => O(n^3)
//The brute force approach is a straightforward method for solving problems by trying all possible solutions and selecting the best one. It doesn't use any shortcuts, optimization, or smart techniques—just raw computation.
public class MaxSubarraySum1 {
    public static void subarray(int[] arr){
       
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum=currSum+arr[k];
                    
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
              
            }
          
        }
       System.out.println("Maximum Subarray Sum:"+ maxSum);
    }
    public static void main(String[] args) {
        int[] arr= {3,4,5,6,7};
        subarray(arr);
    }
    
}
