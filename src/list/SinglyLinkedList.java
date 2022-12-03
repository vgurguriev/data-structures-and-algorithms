package list;

import java.util.EnumSet;
import java.util.List;

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
        SinglyLinkedList ssl = new SinglyLinkedList();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(6);

        // connect them to form a chain
        ssl.head = head;
        head.next = second; // 1 --> 2
        second.next = third; // 1 --> 2 --> 3
        third.next = fourth; // 1 --> 2 --> 3 --> 4 --> null
        ssl.print();
        System.out.println();
        ssl.deleteNode(8);
        ssl.print();
    }


    public void insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            return;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }

        newNode.next = current;
        temp.next = newNode;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count = 0;

        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
            }

            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }

    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;


        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public boolean find(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }

        ListNode current = head;

        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public ListNode delete(int position) {
        if (position == 1) {
            ListNode temp = head;
            head = head.next;
            return temp;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;

            return current;
        }
    }

    public void deleteNode(int value) {
        ListNode current = head;
        ListNode temp = null;

        if (current.data == value) {
            head = current.next;
            return;
        }

        while (current != null && current.data != value) {
            temp = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        temp.next = current.next;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            ListNode temp = head;
            head = null;
            return temp;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;

    }

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;

        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void insertLast(int value) {

        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = newNode;

        while (null != current.next) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
