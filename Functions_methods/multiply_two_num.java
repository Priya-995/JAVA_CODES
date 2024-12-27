import java.util.*;
public class multiply_two_num {
    public static void multiply(int a, int b){
          System.out.println(a*b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        multiply(a,b);
    }
    
}
