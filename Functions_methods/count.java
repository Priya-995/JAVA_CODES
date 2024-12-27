import java.util.*;
public class count {
    public static void main(String[] args) {
        int posCount=0;
        int negCount=0;
        int zeroCount = 0;
        
        while (true) {
            System.out.println("Enter a no.(or 'q' to quit): ");
            Scanner sc= new Scanner(System.in);
            String input = sc.next();
            if(input.equalsIgnoreCase("q")){
                break;
            }
            int number = Integer.parseInt(input);
            if(number>0) posCount++;
            else if(number<0) negCount++;
            else zeroCount++;
            
        }
        System.out.println("positive counts:"+ posCount);
        System.out.println("negative counts:"+negCount);
        System.out.println("zero counts:"+zeroCount);
    }
        
    
    
}
