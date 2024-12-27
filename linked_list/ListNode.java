
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode remove_nthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        int indexToSearch = size - n;
        ListNode prev = head;
        for (int i = 1; i < indexToSearch; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode listNode = new ListNode(0);

        // Remove the 2nd node from the end
        ListNode modifiedHead = listNode.remove_nthFromEnd(head, 2);

        // Print the modified linked list
        printList(modifiedHead);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
