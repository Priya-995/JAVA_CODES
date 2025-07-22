import java.util.*;
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bitMask=1;
        System.out.println("Enter the number: \n");
        int n=sc.nextInt();
        if((n&bitMask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
