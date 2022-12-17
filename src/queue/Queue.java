package queue;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public void print() {
        if (isEmpty()) {
            return;
        }

        ListNode current = front;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void add(int value) {
        ListNode temp = new ListNode(value);

        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }

        rear = temp;
        length++;
    }
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(1);

        queue.print();
    }
}
