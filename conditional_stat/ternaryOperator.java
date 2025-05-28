import java.util.*;
public class ternaryOperator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();
        String result= (marks<50) ? "Fail" : "Pass";
        System.out.println(result);
    }
}
