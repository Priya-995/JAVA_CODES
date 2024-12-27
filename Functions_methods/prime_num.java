import java.util.*;
public class prime_num {
    public static void prime(int n){
        int flag =0;
      for(int i=2;i<=n;i++){
        if(n%i==0){
            flag=1;
            break;
        } 
      }
      if(n==1) System.out.println("neither prime nor composite");
      else if(flag==1) System.out.println("not prime no.");
      else System.out.println("prime no.");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        prime(n);
    }
}
