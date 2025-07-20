public class ZigZagLL {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {   // constructor
            this.data = data;
            this.next = null;
        }

    }
    public static Node tail;
    public static Node head;
    public static int size;

    public void addFirst(int data) {   // O(1)
        // step1: create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 : newNode next= head
        newNode.next = head; //link
        // step3: head=newNode
        head = newNode;
    }

    public void addLast(int data) {   //O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {    // O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {  // add on mid
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // temp-> prev ; i=idx-1

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int deleteFirst() {   // O(1)
        // Special cases
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast() {   // O(n)
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;

        tail = temp;
        size--;
        return val;
    }
     public void zigZag(){
        // step1: find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        // Step 2: reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            //update
            prev=curr;
            curr=next;
        }
        // Assignment -> values
        Node leftHead=head;
        Node rightHead=prev;
        Node nextL,nextR;

        //step3: alternative merge : zigZag
        while(leftHead!=null&&rightHead!=null){
            nextL=leftHead.next;
            leftHead.next=rightHead;
            nextR=rightHead.next;
            rightHead.next=nextL;
            //update
            leftHead=nextL;
            rightHead=nextR;
        }

     }

   

   
    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL(); // functions of this object can be static or non-static
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addFirst(1);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();

    }
}
