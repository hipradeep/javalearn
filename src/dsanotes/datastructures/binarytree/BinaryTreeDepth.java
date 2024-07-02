package dsanotes.datastructures.binarytree;

public class BinaryTreeDepth extends BinaryTree {

    public static void main(String[] args) {
        binaryTree();
        int d= depthOfTree(root);
        System.out.println(d);
    }

    private static int depthOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1+Math.max(depthOfTree(root.left), depthOfTree(root.right));
    }

}
