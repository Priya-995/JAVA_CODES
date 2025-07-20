// All methods takes O(1)  complexity
import java.util.*;

public class QueueUsingJCF {

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();  // or ArrayDeque
        // coz => Queue is a Interface not a class : we cannot form objects of a interface
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        

        
    }
}
