package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 7, 1, 11, 20, 15};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void sort(int[] arr, int i, int j) {
        if (i < j) {
            int pivot = partition(arr, i, j);
            sort(arr, i, pivot - 1);
            sort(arr, pivot + 1, j);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;

        while (i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
