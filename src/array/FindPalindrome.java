package array;

import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] arr = input.toCharArray();
        boolean result = isPalindrome(arr);

        System.out.println(result);
    }

    private static boolean isPalindrome(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
