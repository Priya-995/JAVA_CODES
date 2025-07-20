import java.util.Deque;
import java.util.LinkedList;

public class ImplementStackUsingDeque {
     static class Stack{
        Deque<Integer> dq= new LinkedList<>();
        //isEmpty
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        //add
        public void push(int data){
            dq.addLast(data);

        }
        //remove
        public int pop(){
            return dq.removeLast();

        }
        //peek
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack q= new Stack();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.pop();
       } 
    }
}
