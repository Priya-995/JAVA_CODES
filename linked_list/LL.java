class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
      Node newNode= new Node(data);
      newNode.next=head;
      head=newNode;
    }
    public void addLast(String data){

        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
           lastNode=lastNode.next;  
        }
        lastNode.next=newNode;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){ 
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void  removeFirst(){
        if(head==null){
            System.out.println("Empty list,nothing to delete");
            return;
        }
        size--;
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list,nothing to delete");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public void reverseIterate(){
        if(head==null||head.next==null){
            return;
        }
      Node prevNode = head;
      Node currNode=head.next;
      while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        //update
        prevNode=currNode;
        currNode=nextNode;
      }
      head.next=null;
      head=prevNode;

    }
    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
       Node newHead= reverseRecursive(head.next);
       head.next.next=head;
      head.next=null;
      return newHead;

    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("7");
        list.addLast("3");
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();

    }
}
