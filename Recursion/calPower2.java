// stack height = logb
public class calPower2 {
    public static int calPow(int a, int b){
        if(b==0) return 1;
      int x = calPow(a,b/2);
      if(b%2==0)
        return x*x;
      else
        return x*x*a;
      
    }
    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.print(calPow(a,b));
    }
}
