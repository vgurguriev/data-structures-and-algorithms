package priority_queue;

public class MaxPriorityQueue {
    private Integer[] heap;
    private int size;

    public MaxPriorityQueue(int capacity) {
        heap = new Integer[capacity + 1]; // index 0 is empty
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insert(int data) {
        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }
        size++;
        heap[size] = data;
        swim(size);
    }

    public int deleteMax() {
        if (isEmpty()) {
            return -1;
        }
        int max = heap[1];
        swap(1, size);
        heap[size + 1] = null;
        size--;
        sink(1);
        if (size > 0 && size == (heap.length - 1) / 4) {
            resize(heap.length / 2);
        }
        return max;
    }

    private void sink(int i) {
        while (2 * i <= size) {
            int j = 2 * i;
            if (j < size && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[i] >= heap[j]) {
                break;
            }
            swap(i, j);
            i = j;
        }
    }

    private void resize(int size) {
        Integer[] temp = new Integer[size];
        for (int i = 1; i <= this.size; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    private void swim(int size) {
        while (size > 1 && heap[size / 2] < heap[size]) {
            swap(size / 2, size);
            size /= 2;
        }
    }

    private void swap(int i, int j) {
        Integer temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        MaxPriorityQueue mpq = new MaxPriorityQueue(3);
        mpq.insert(10);
        mpq.insert(8);
        mpq.insert(6);
        mpq.insert(4);
        System.out.println(mpq.size());
        mpq.deleteMax();
        System.out.println(mpq.size());
        mpq.deleteMax();
    }
}
