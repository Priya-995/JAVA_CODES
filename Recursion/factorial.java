public class factorial {
    public static int printFact(int n){
        if(n==0||n==1) return 1;
      int fact_cal=printFact(n-1);
      int fact=fact_cal*n;
      return fact;
    }
    public static void main(String[] args) {
        System.out.println(printFact(4));
    }
}
