package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 7, 1, 11, 20, 15};
        selectionSort(arr);
        print(arr);
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // find the minimum element in the unsorted array
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // if the current element is less than the minimum element
                    minIndex = j; // update the minimum element
                }
            }

            // swap the minimum element with the first element
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int minIndex, int k) {
        // swap arr[minIndex] and arr[k]
        int temp = arr[minIndex];
        arr[minIndex] = arr[k];
        arr[k] = temp;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
