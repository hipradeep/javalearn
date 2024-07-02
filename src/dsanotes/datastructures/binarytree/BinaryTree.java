package dsanotes.datastructures.binarytree;

import java.util.Stack;

public class BinaryTree {

   public static Node root;
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

        binaryTree();
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
        //Traversal
       // System.out.println("InOrder");
       // printInorder(root);  // 10, 6, 11, 5, 12, 7, 13
       // System.out.println("\nPreOrder");
       // printPreorder(root); // 5, 6, 10, 11, 7, 12, 13
       // System.out.println("\nPostOrder");
       // printPostorder(root); //10, 11, 6, 12, 13, 7, 5

        //------------------ Iterative Way------------------------------------------------
        //System.out.println("\nPreOrder - Iteration");
       // iterativePreOrder(root); // 5, 6, 10, 11, 7, 12, 13

       // System.out.println("\nPostOrder - Iteration");
       // iterativePostOrder(root); // 10 11 6 12 13 7 5

        //System.out.println("\nInOrder - Iteration");
       // iterativeInOrder(root); // 10 11 6 12 13 7 5



        //crate bt using array

        generateSkewedBt(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, true);
        printInorder(root);

    }
    public static void generateSkewedBt(int[] nums, boolean iLeft){
        root=generateSkewedBT(nums, 0, iLeft);
    }
    public static Node generateSkewedBT(int[] nums, int i, boolean isLeft){
        if (i >= nums.length || nums[i] == 0){
            return null;
        }
        Node node =new Node(nums[i]);
        if (isLeft){
            node.left = generateSkewedBT(nums, i+1, true);
        }else {
            node.right = generateSkewedBT(nums, i+1, false);
        }
        return node;
    }


    public static void generateBinaryTree(int[] nums){
      root= createBTUsingArray(nums, 0);
    }

    public static Node createBTUsingArray(int[] nums, int i){
        if (i >= nums.length ) {
            return null;
        }
       Node  node = new Node(nums[i]);
        // Calculate the indices of the left and right child nodes
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;

        // Generate left and right subtrees recursively
        node.left =  createBTUsingArray(nums, leftChildIndex);
        node.right=  createBTUsingArray(nums, rightChildIndex);

        return node;

    }




    private static void iterativeInOrder(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node temp=root;
        while (!stack.isEmpty() || temp!=null) {
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    private static void iterativePostOrder(Node root) {
        Node current=root;
        Stack<Node> stack=new Stack<>();
        while (current!= null ||!stack.isEmpty()) {
            if (current!= null) {
                stack.push(current);
                current = current.left;
            } else {
                Node temp=stack.peek().right;
                if (temp==null) {
                    temp=stack.pop();
                    System.out.print(temp.data+" ");
                    while (!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else {
                    current=temp;
                }
            }
        }
    }

    private static void iterativePreOrder(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right!= null)
                stack.push(node.right);
            if (node.left!= null)
                stack.push(node.left);
        }
    }

    public static void binaryTree() {
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
        //root.left.left.left=new Node(14);
        /*
         *                 5
         *             /        \
         *           6           7
         *          /   \       /  \
         *         10    11     12   13
         *        /  \   /  \   /  \   /  \
         *      14    N N    N N    N N    N
         *     /  \
         *    N     N
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


}
