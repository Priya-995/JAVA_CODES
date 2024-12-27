import java.util.Scanner;

public class ClockStrings {
    public static boolean intersect(int a, int b, int c, int d) {
       
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }
         return (a < c && c < b && b < d) || (c < a && a < d && d < b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
           
            if (intersect(a, b, c, d)) 
                System.out.println("YES");
            else 
                System.out.println("NO");
            
        }
        
    }
}

