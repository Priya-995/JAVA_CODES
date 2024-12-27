import java.util.*;
public class power {
    public static void pow(int a,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=a;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        pow(a,n);
    }
}
