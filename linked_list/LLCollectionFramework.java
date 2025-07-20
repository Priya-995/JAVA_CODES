import java.util.LinkedList;
public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        // add
        ll.add(4);
        ll.add(6);
        ll.addFirst(9);
        ll.addLast(10);
        // remove
        ll.removeFirst();
        // print
        System.out.println(ll);


    }
}
