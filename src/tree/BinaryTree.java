package tree;

import java.util.Stack;

public class BinaryTree {
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        root = first;

        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public void preOrderRecursive(TreeNode root) {
//        start from the top
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void preOrder(TreeNode root) {
//        start from the top
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void inOrderRecursive(TreeNode root) {
        // start from the bottom
        if (root == null) {
            return;
        }

        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    public void inOrder(TreeNode root) {
//        start from the bottom
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.empty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void postOrderRecursive(TreeNode root) {
//        root traversed at the end, first print all children then parent node
        if (root == null) {
            return;
        }

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrder(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");

                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.postOrderRecursive(binaryTree.root);
        binaryTree.postOrder(binaryTree.root);
    }
}
