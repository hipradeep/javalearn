package dsanotes.datastructures.binarytree;

public class BinaryTree {

    static Node root;

    public static void main(String[] args) {

        binaryTree();
        //Traversal
        System.out.println("InOrder");
        printInorder(root);
        System.out.println("\nPreOrder");
        printPreorder(root);
        System.out.println("\nPostOrder");
        printPostorder(root);

    }

    private static void binaryTree() {
        root = new Node(5);

        root.left = new Node(6);
        root.right = new Node(7);

        /*
         *            5
         *         /    \
         *        6      7
         *      /  \   /  \
         *     N    N N    N
         * */

        root.left.left = new Node(10);
        root.left.right = new Node(11);

        /*
         *            5
         *         /     \
         *        6       7
         *      /   \    /  \
         *     10   11  N    N
         *   /   \
         *  N    N
         *
         * */

        root.right.left = new Node(12);
        root.right.right = new Node(13);

        /*
         *             5
         *         /       \
         *        6         7
         *      /   \       /  \
         *    10    11     12   13
         *  /  \   /  \   /  \   /  \
         * N    N N    N N    N N    N
         *
         * */
    }

    static void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);

    }

    static void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    static void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.data + " ");
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
}
