package list;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public boolean isEmpty() {
            return length == 0;
        }

        public int length() {
            return length;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void printReversed() {
        if (head == null) {
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data + " --> ");
            temp = temp.previous;
        }

        System.out.println("null");
    }

    public void insertLast(int value) {

    }
}
