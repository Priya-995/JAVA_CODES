public class LinkedList {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){   // constructor
            this.data=data;
            this.next=null;
        }

    }
    public static Node tail;
    public static Node head;
    public static int size;


    public void addFirst(int data){   // O(1)
      // step1: create new Node
      Node newNode= new Node(data);
      size++;
      if(head==null){
        head=tail=newNode;
        return;
      }
      // step2 : newNode next= head
      newNode.next=head; //link
      // step3: head=newNode
      head=newNode;
    }
    public void addLast(int data){   //O(1)
      Node newNode= new Node(data);
      size++;
      if(head==null){
        head=tail=newNode;
      }
      tail.next=newNode;
      tail=newNode;
    }
    public void print(){    // O(n)
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
      }
      System.out.println("null");
    }

    public void add(int idx,int data){  // add on mid
      if(idx==0){
        addFirst(data);
        return;
      }
      Node newNode= new Node(data);
      size++;
      Node temp=head;
      int i=0;
      while(i<idx-1){
        temp=temp.next;
        i++;
      }
      // temp-> prev ; i=idx-1
      
      newNode.next=temp.next;
      temp.next=newNode;
    }
    public int deleteFirst(){   // O(1)
      // Special cases
      if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
      }
      else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
      }
      int val=head.data;
      head=head.next;
      size--;
      return val;
    }
    public int deleteLast(){   // O(n)
      if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
      }
      else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
      }
      Node temp=head;
      for(int i=0;i<size-2;i++){
        temp=temp.next;
      }
      int val=tail.data;
      temp.next=null;
      
      tail=temp;
      size--;
      return val;
    }
    public int iterativeSearch(int key){  // O(n)
      Node temp=head;
      int i=0;
      while(temp!=null){
        if(temp.data==key){ // key found
         return i;
        }
        temp=temp.next;
        i++;
      }
      // key not found
      return -1;
    }
    // Recursive Search
    // time complexity : O(n)
    // Space complexity : O(n)
    public int helper(Node head,int key){
      if(head==null){ 
        return -1;
      }
      if(head.data==key){
        return 0;
      }
      int idx=helper(head.next, key); 
      if(idx==-1){
        return -1;
      }
      
      return idx+1; 
    }
    public int recursive_search(int key){
      return helper(head,key);
    }
    // Reverse a Linked List -> Iterative approach
    public void reverseLL(){   // O(n)
      Node prev=null;
      Node curr=tail=head;  // Assignment => R to L
      Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

      }
      head=prev;

    }
    public void deleteNthNode(int N){  // O(n)
      int sz=0;
      Node temp=head;
      while(temp!=null){
        sz++;
        temp=temp.next;
        
      }
      if(N==sz){
        head=head.next;
      }
      int i=1;
      Node prev=head;
      while(i<sz-N){
        prev=prev.next;
        i++;
      }
      prev.next=prev.next.next;
      return;
    }
    // Slow-fast approach or turtle hare approach
    // finding mid element
    public Node findMid(Node head){   // helper
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
      }
      return slow;
    }
    // Check plaindrome 
    public boolean check_palindrome(){   // TC => O(n) ; SC=> O(1)
      if(head==null||head.next==null){
        return true;
      }
      // Step 1: find midNode
      Node midNode=findMid(head);
      // step 2: reverse half
      Node prev=null;
      Node curr=midNode;
      Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
         prev=curr;
        curr=next;
       
      }
      Node right=prev; // right half head
      Node left=head;   // leaft half head
      // step 3: check left half & right half
      while(right!=null){
        if(left.data!=right.data){
          return false;
        }
      }
      return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // functions of this object can be static or non-static
        // ll.addFirst(5);
        // ll.addFirst(6);
        // ll.print();
        // ll.addLast(9);
        // ll.addFirst(2);
        // ll.print();
        // ll.add(1,3);
        // ll.print();
        // System.out.println(ll.size);
        // ll.deleteFirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.deleteLast();
        // ll.print();
        // System.out.println(ll.size);
        // ll.addFirst(1);
        //  ll.print();
        //  System.out.println(ll.iterativeSearch(9));
        //  System.out.println(ll.recursive_search(6));
        //  ll.reverseLL();
        //  ll.print();
        //  ll.deleteNthNode(3);
        //  ll.print();
        //  ll.deleteNthNode(2);
        //  ll.deleteFirst();
         ll.addFirst(1);
          ll.addFirst(2);
           ll.addFirst(1);
         ll.print();
         System.out.println(ll.check_palindrome());
         
    }
}
