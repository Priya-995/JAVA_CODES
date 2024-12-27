import java.util.*;
public class factorial {
    public static int fact(int n){
        int fac = 1;
        for(int i=n;i>=1;i--){
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));
    }
}
