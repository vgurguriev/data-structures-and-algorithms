package sort;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = merge(arr1, arr2);
        print(arr3);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0; // index of arr1
        int j = 0; // index of arr2
        int k = 0; // index of arr3

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) { // if the current element of arr1 is less than the current element of arr2
                arr3[k] = arr1[i]; // copy the current element of arr1 to arr3
                i++; // increment i
            } else { // if the current element of arr2 is less than or equal to the current element of arr1
                arr3[k] = arr2[j]; // copy the current element of arr2 to arr3
                j++; // increment j
            }
            k++; // increment k
        }

        // copy the remaining elements of arr1 to arr3
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // copy the remaining elements of arr2 to arr3
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

    private static void print(int[] arr3) {
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
