public class MaxSubArraySum2 {
    public static void maxSubArray(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int[] prefix= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
               }
            }
        }
        System.out.println("Maximun subArray Sum:" +maxSum);
    }
    public static void main(String[] args) {
        int arr[]={12,3,4,5};
        maxSubArray(arr);
        
    }
}
