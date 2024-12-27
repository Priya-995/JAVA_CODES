import java.util.*;

public class string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().isEmpty()){
            System.out.println("0");
        }
        else {
            s=s.trim();
            String[] tokens=s.split("[^A-Za-z]+");
            System.out.println(tokens.length);
            for(String t:tokens){
                System.out.println(t);
            }
        }
        // Write your code here.
        scan.close();
    }
}



