package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 7, 1, 11, 20, 15};
        insertionSort(arr);
        print(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr, that are greater than key, to the right
            while (j >= 0 && arr[j] > key) {
                // shift arr[j] to the right
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key into the correct position
            arr[j + 1] = key;
        }
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
