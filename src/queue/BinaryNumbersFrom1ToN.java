package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] result = generateBinaryNumbers(n);

        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String[] generateBinaryNumbers(int n) {
        String[] result = new String[n];
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < n; i++) {
            result[i] = queue.poll();

            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            queue.offer(n1);
            queue.offer(n2);
        }

        return result;
    }
}
