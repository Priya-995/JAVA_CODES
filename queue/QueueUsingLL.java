public class QueueUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        //isEmpty
        public boolean isEmpty(){
            return head==null&&tail==null;
        }
        // Enqueue -> O(n)
        public void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=tail=newNode;

            }
            tail.next=newNode;
            tail=newNode;
        }
        // Dequeue -> O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=head.data;
            // single element
            if(tail==head){
                head=tail=null;
            }
            else{
            head=head.next;
            }
            return front;
        }
         public int peek(){   // peek => O(1)
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=head.data;
           
            return front;
        }


    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

        
    }
}
