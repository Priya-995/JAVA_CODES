// stack height ==b
public class calPower {
    public static int printPow(int a,int b){
        if(b==0) return 1;
      int pow = printPow(a,b-1);
      int x = a*pow;
      return x;
    }
    public static void main(String[] args) {
        int a=0;
        int b=3;
        System.out.println(printPow(a,b));

    }
}
