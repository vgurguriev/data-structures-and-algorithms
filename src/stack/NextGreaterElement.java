package stack;

import java.util.Stack;

public class NextGreaterElement {
    // Find next greater element to the right
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 3, 4, 8, 1};

        int[] result = nextGreaterElement(arr);

        for (int r : result) {
            System.out.print(r + " ");
        }

    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.empty()) {
                while (!stack.empty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }

            if (stack.empty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }
}
