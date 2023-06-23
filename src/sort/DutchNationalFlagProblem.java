package sort;

public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0, 2, 1, 0, 2, 1, 0};
        sort(arr);
        print(arr);
    }

    private static void sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
