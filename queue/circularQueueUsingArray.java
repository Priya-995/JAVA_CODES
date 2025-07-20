

public class circularQueueUsingArray {
    static class Queue{
        int[] arr;
        int front;
        int rear;
        int size;
        Queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }
        // isEmpty
        public boolean isEmpty(){
            return (rear==-1)&&(front==-1);
        }
        //isFull
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        //add elemnt
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            // add frst element
             if(front==-1){
                front++;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        // remove element
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
             int result=arr[front];
             // last elemnt delete
            if(rear==front){
                rear=front=-1;
            }
           else{
            front=(front+1)%size;
           }
            return result;
        }
        public int peek(){
              if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
             int result=arr[front];
             return result;
        }

        }
    
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

        
    }
}
