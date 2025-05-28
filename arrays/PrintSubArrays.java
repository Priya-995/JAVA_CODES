
// (n(n+1))/2
public class PrintSubArrays {
    public static void subarray(int[] arr){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
       System.out.println("Total subarrays:"+ts);
    }
    public static void main(String[] args) {
        int[] arr= {3,4,5,6,7};
        subarray(arr);
        
    }
}
