// Time complexity: O(n)
// Space complexity: O(n)
public class calPower{
  public static int calPower(int x, int n){
   if(n==0) return 1;
   return x*calPower(x, n-1);


  }
  public static int calPowerOptimized(int x,int n){
   if(n==0) return 1;
   int halfPower=calPower(x, n/2);
   int halfPowerSq=halfPower*halfPower;
   if(n%2!=0){
    halfPowerSq=x*halfPowerSq;
     
   }
   return halfPowerSq;

  }
  public static void main(String[] args) {
    System.out.println(calPower(2,5));
    System.out.println(calPowerOptimized(2,6));
  }
}