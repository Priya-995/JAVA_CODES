
// Time complexity : O(nlogn)
public class MergeSort {

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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);   // Dummy Node
        Node temp = mergeLL;    // temp moves, mergeLL stays
        // merging logic
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }

        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergeLL.next;

    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: list is empty or has one element
        }

        Node mid = getMid(head);        // Step 1: Find middle node
        Node rightHead = mid.next;  // Step 2: Break the list into two halves
        mid.next = null;            // Left half ends at mid

        Node newLeft = mergeSort(head);        // Step 3: Recursively sort left half
        Node newRight = mergeSort(rightHead);  // Step 4: Recursively sort right half

        return merge(newLeft, newRight);       // Step 5: Merge both sorted halves
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort(); // functions of this object can be static or non-static
        ll.addFirst(2);
        ll.addFirst(10);
        ll.addLast(8);
        ll.addFirst(7);
        ll.print();
       
        ll.head=ll.mergeSort(ll.head); //it feels like the function is returning a new sorted linked list.
          //But technically in code, it's just returning the head of a newly sorted linked list, where all nodes are already linked.
        ll.print();

    }
}
