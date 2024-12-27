class Pallin {
    int val;
    Pallin next;

    Pallin(int x) {
        val = x;
        next = null;
    }
    
    public Pallin reverse(Pallin head){
        Pallin prev = null;
        Pallin curr = head;
        while(curr!=null){
            Pallin next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Pallin findMiddle(Pallin head){
        Pallin hare = head;
        Pallin turtle = head;
        while(hare.next!=null&&hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(Pallin head) {
        if(head==null||head.next==null){
            return true;
        }
        Pallin middle = findMiddle(head);
        Pallin secondHalfStart = reverse(middle.next);
        Pallin firstHalfStart = head;
        while(secondHalfStart!=null){
            if(firstHalfStart.val!=secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
             secondHalfStart = secondHalfStart.next;

        }
        return true;
        
    }
    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 2 -> 1
        Pallin head = new Pallin(1);
        head.next = new Pallin(2);
        head.next.next = new Pallin(2);
        head.next.next.next = new Pallin(1);
        // Create an instance of Pallin to call the isPalindrome method
        Pallin pallinInstance = new Pallin(0); // This instance is not used
        boolean result = pallinInstance.isPalindrome(head);
        
        // Print the result
        System.out.println("Is the linked list a palindrome? " + result);

    }
}