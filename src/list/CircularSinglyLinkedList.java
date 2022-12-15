package list;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

        length = 4;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularLinkedList();
        csll.print();
        csll.removeFirst();
        csll.print();
    }

    public void print() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }

        System.out.println(first.data);
    }

    public void insertFirst(int value) {
        ListNode temp = new ListNode(value);

        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }

        last.next = temp;
        length++;
    }

    public void insertLast(int value) {
        ListNode temp = new ListNode(value);

        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }

        length++;
    }

    public ListNode removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Singly Linked List is already empty.");
        }

        ListNode temp = last.next;

        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }

        temp.next = null;
        length--;

        return temp;
    }
}
