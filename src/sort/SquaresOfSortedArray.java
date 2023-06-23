package sort;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        print(squaresOfSortedArray(arr));
    }

    private static int[] squaresOfSortedArray(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;

        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
            k--;
        }
        return result;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
