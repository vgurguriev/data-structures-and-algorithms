package tree;

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

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);
    }
}
