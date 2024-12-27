package conditional_stat;

import java.util.*;
public class switch_stat {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two number: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Enter operator: ");
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
 
 