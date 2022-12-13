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

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    private class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(1);
        dll.insertFirst(2);

        dll.printReversed();
        dll.print();
    }

    public void print() {
        if (head == null) {
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void printReversed() {
        if (head == null) {
            return;
        }

        ListNode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }

        System.out.println("null");
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }

        tail = newNode;
        length++;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);

        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }
}
