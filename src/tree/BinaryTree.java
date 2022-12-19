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
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;

        first.left = second;
        first.right = third;
        second.left = fourth;
    }

    public void preOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void preOrder(TreeNode root) {
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
        if (root == null) {
            return;
        }

        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.inOrderRecursive(binaryTree.root);
    }
}
