package dsanotes.datastructures.binarytree;



import java.util.Scanner;

public class BinaryTree1 extends BinaryTree{

    public static void main(String[] args) {
binaryTree();
        int sum=  sumOfLeft(root);
        System.out.println(sum);
    }

    private static int sumOfLeft(Node root) {
        if (root==null) return 0;

        return sumOfLeft(root, false);

    }

    private static int sumOfLeft(Node node, boolean isLeft) {
        if (node.left ==null && node.right ==null){
            if (isLeft) return node.data;
            else return 0;
        }
        int sum=0;
        if (node.left!=null){
            sum+=sumOfLeft(node.left,true);
        }

        if (node.right!=null){
            sum+= sumOfLeft(node.right,false);
        }
        return sum;
    }




    public static void main2(String[] args) {
        //generateBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        generateSkewedBt(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, false);
        BinaryTree1 btree = new BinaryTree1();
        btree.prettyDisplay();
    }


    public static void main1(String[] args) {
        BinaryTree1 tree=new BinaryTree1();
        tree.populate();
        tree.prettyDisplay();
    }

    private void populate( ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter root of tree");
        root=new Node(sc.nextInt());
        populate(root,sc);
    }

    private void populate(Node t, Scanner sc) {
        if(t==null) return;
        System.out.println("Add Left of node "+t.data+"? ");
        boolean l=sc.nextBoolean();
        if (l){
            System.out.println("Value?");
            t.left= new Node(sc.nextInt());
            populate(t.left, sc);
        }
        System.out.println("Add Right of node "+t.data+"? ");
        boolean r=sc.nextBoolean();
        if (r){
            System.out.println("Value?");
            t.right= new Node(sc.nextInt());
            populate(t.right, sc);
        }

    }

    private void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node==null) return;
        prettyDisplay(node.right, level+1);
        if (level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.data);
        }else {
            System.out.println(node.data);
        }
        prettyDisplay(node.left, level+1);
    }

}
