import java.util.*;
public class fibonacci {
    public static void fib(int n1,int n2,int n){
        int n3;
        System.out.println("Fibonacci is"+n1+" "+n2);
      for(int i=0;i<n;i++){
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
      }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        fib(0,1,n);
    }
    
}
