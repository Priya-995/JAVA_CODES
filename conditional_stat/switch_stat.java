
import java.util.*;
public class switch_stat {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two number: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      // Displaying menu options
      System.out.println("Choose an operator: ");
      System.out.println("1. Addition (+)");
      System.out.println("2. Subtraction (-)");
      System.out.println("3. Multiplication (*)");
      System.out.println("4. Modulus (%)");
      System.out.println("5. Division (/)");
      int operator = sc.nextInt();
      switch (operator) {
         case 1:
            System.out.println(a + b);
         break;
         case 2:
            System.out.println(a - b);
         break;
         case 3:
            System.out.println(a * b);
         break;
         case 4:
            if (b == 0) {
               System.out.println("Invalid division");
            } 
            else {
               System.out.println(a % b);
            }
         break;
         case 5:
          if (b == 0) {
            System.out.println("Invalid division");
            } 
          else {
            System.out.println(a / b);
            }
         break;
         default: System.out.println("Invalid operator");
      }
   }
}
 
 