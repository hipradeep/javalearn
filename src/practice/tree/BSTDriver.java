package practice.tree;

import dsanotes.datastructures.bst.BinarySearchTree;

public class BSTDriver {
    public static void main(String[] args) {

        BinarySearchTree1 bt=new BinarySearchTree1();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);
        bt.inorderTraversal(bt.root);

    }
}
class BinarySearchTree1{
    static Node root;

    BinarySearchTree1(){
        root=null;
    }

    void insert(int val){
        Node temp=new Node(val);

        if (root == null){
            root=temp;
        }else {

            Node cNode=root, parent=null;
            while (true){
                parent=cNode;
                if(val<cNode.key){
                    //Left
                    cNode=cNode.left;
                    if (cNode==null){
                        parent.left=temp; return;
                    }

                }else {
                    //right
                    cNode=cNode.right;
                    if (cNode==null){
                        parent.right=temp; return;
                    }
                }
            }

        }
    }
    void inorderTraversal(Node node) {
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

}





class Node{
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}



 class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    public Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    public int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}

