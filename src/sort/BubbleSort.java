package sort;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 7, 1, 11, 20, 15};
        bubbleSort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // if the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // if no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
