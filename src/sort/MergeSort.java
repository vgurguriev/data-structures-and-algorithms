package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 7, 1, 11, 20, 15};
        int[] temp = new int[arr.length];
        sort(arr,temp, 0, arr.length - 1);
        print(arr);
    }

    private static void sort(int[] arr, int[] temp, int low, int high ) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, temp, low, mid); // sort left half
            sort(arr, temp, mid + 1, high); // sort right half
            merge(arr, temp, low, mid, high); // merge them
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // copy arr to temp
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low; // index of the left sub array
        int j = mid + 1; // index of the right sub array
        int k = low; // index of the merged sub array

        // merge the two sub arrays
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // copy the rest of the left sub array into the target array
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
