package list;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(); // head is null
        sll.head = new ListNode(1);

        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // connect them to form a chain

        sll.head.next = second; // 1 --> 2
        second.next = third; // 1 --> 2 --> 3
        third.next = fourth; // 1 --> 2 --> 3 --> 4 --> null

    }

    public void print() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }

        int count = 0;

        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }



}
