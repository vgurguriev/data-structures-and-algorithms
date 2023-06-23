package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 11, 13, 15};
        System.out.println(binarySearch(arr, 11));
    }

    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (high + low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
