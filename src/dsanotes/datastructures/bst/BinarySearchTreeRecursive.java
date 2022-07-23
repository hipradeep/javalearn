package dsanotes.datastructures.bst;

public class BinarySearchTreeRecursive {

    static Node root;

    BinarySearchTreeRecursive() {
        root = null;
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int data) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    void insert(int key) {
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key)
    {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }
}
