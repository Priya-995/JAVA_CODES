import java.util.HashSet;
import java.util.Scanner;

public class DistinctYear {
     public static int findNextDisYear(int y) {
        // Start checking from the next year
        int year = y + 1;

        while (true) {
            // Convert the year to a string
            String yearString = Integer.toString(year);
            
            // Use a HashSet to store the digits of the year
            HashSet<Character> digits = new HashSet<>();
            
            // Check each character (digit) in the year string
            for (char d : yearString.toCharArray()) {
                digits.add(d);  // Add the digit to the set
            }

            // If the size of the set is equal to the length of the year string, digits are distinct
            if (digits.size() == yearString.length()) {
                return year;  // Return the year if all digits are distinct
            }

            // Otherwise, move to the next year
            year++;
        }
    }

    public static void main(String[] args) {
        // Read input from the user
       Scanner sc=new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();

        // Find and print the next year with distinct digits
        System.out.println(findNextDisYear(y));
    }
    
}
