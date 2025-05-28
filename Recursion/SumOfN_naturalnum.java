// Time complexity: O(n)  -> because of n stack calls
// Space Complexity: O(n) 
class SumOfN_naturalnum{
    public static int printSum(int n){
        if(n==1) return 1;
        return n+printSum(n-1);
         
      }
      public static void main(String[] args) {
          int num=6;
         System.out.println( printSum(num));
      }
}