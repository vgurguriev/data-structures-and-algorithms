package arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 8, 6, 3, 7};

        int result = findMissing(arr);

        System.out.println(result);
    }

    private static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }

        return sum;
    }
}
