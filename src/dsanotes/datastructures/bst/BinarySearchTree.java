package dsanotes.datastructures.bst;

public class BinarySearchTree {
    static Node root;

    BinarySearchTree() {
        root = null;
    }

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    //insert() will add new node to the binary search  tree
    public void insert(int data) {
        //Create a new node
        Node newNode = new Node(data);
        //Check whether tree is empty
        if (root == null) {
            root = newNode;
            return;
        } else {
            //current node point to root of the tree
            Node current = root, parent = null;
            while (true) {
                //parent keep track of the parent node of current node.
                parent = current;
                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                    //If data is greater than current's data, node will be inserted to the right of tree
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        } else {
            //value is less than node's data then, search the value in left subtree

            if (value < node.key) node.left = deleteNode(node.left, value);
                //value is greater than node's data then, search the value in right subtree
            else if (value > node.key) node.right = deleteNode(node.right, value);
                //If value is equal to node's data that is, we have found the node to be deleted
            else {
                //If node to be deleted has no child then, set the node to null
                if (node.left == null && node.right == null) node = null;
                    //If node to be deleted has only one right child
                else if (node.left == null) {
                    node = node.right;
                }
                //If node to be deleted has only one left child
                else if (node.right == null) {
                    node = node.left;
                }
                //If node to be deleted has two children node
                else {
                    //then find the minimum node from right subtree
                    Node temp = minNode(node.right);
                    //Exchange the data between node and temp
                    node.key = temp.key;
                    //Delete the node duplicate node from right subtree
                    node.right = deleteNode(node.right, temp.key);
                }
            }
            return node;
        }
    }

    Node minNode(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return new Node(minv);
    }

    //inorder() will perform inorder traversal on binary search tree

    public void inorderTraversal(Node node) {
        //Check whether tree is empty
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (node.left != null) inorderTraversal(node.left);

            System.out.print(node.key + " ");

            if (node.right != null) inorderTraversal(node.right);
        }

    }

    public static void main(String[] args) {

        BinarySearchTree bt = new BinarySearchTree();
        //Add nodes to the binary tree

        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);

        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree

        bt.inorderTraversal(bt.root);

        Node deletedNode = null;
        //Deletes node 90 which has no child
        deletedNode = bt.deleteNode(bt.root, 90);
        System.out.println("\nBinary search tree after deleting node 90:");
        bt.inorderTraversal(bt.root);
        //Deletes node 30 which has one child
        deletedNode = bt.deleteNode(bt.root, 30);
        System.out.println("\nBinary search tree after deleting node 30:");
        bt.inorderTraversal(bt.root);
        //Deletes node 50 which has two children
        deletedNode = bt.deleteNode(bt.root, 50);
        System.out.println("\nBinary search tree after deleting node 50:");
        bt.inorderTraversal(bt.root);
    }


}
