package arrays;

import java.util.Scanner;

public class SecondMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] arr = fillArray(input);

        int secondMin = findSecondMinNumber(arr);

        System.out.println(secondMin);
    }

    private static int findSecondMinNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    private static int[] fillArray(String input) {

        String[] tokens = input.split("\\s+");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        return arr;
    }
}
