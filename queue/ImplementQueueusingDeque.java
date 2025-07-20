
import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueueusingDeque {
    static class Queue{
        Deque<Integer> dq= new LinkedList<>();
        //isEmpty
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        //add
        public void add(int data){
            dq.addLast(data);

        }
        //remove
        public int remove(){
            return dq.removeFirst();

        }
        //peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
    }
}
