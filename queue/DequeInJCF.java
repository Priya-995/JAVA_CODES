
import java.util.Deque;
import java.util.LinkedList;

public class DequeInJCF {
    public static void main(String[] args) {
       Deque<Integer> dq=new LinkedList<>();  // ArrayDeque
       dq.addFirst(1);
       dq.addFirst(2);
       System.out.println(dq);
       System.out.println("First ele="+dq.getFirst());
        System.out.println("last ele="+dq.getLast());
        dq.removeLast();
         System.out.println(dq);


                                

    }
    
}
