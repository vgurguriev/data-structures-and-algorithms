package stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        char[] arr = new char[]{'{', '(', ')', '}'};
        char[] arr1 = new char[]{'}', '(', ')', '}'};
        char[] arr2 = new char[]{'{', '(', ')'};

        System.out.println(isValid(arr1));

    }

    private static boolean isValid(char[] arr) {
        Stack<Character> stack = new Stack<>();

        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                            (c == '}' && top == '{') ||
                            (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
