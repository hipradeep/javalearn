package practice.tree;

import java.util.Scanner;

public class BinaryTree {
    TreeNode root;


    public static void main(String[] args) {

        BinaryTree bt=new BinaryTree();
        bt.populate();
        bt.prettyDisplay();

    }

    private void populate( ){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter root of tree");
        root=new TreeNode(sc.nextInt());
        populate(root,sc);
    }

    private void populate(TreeNode t, Scanner sc) {
        if(t==null) return;
        System.out.println("Add Left of node "+t.val+"? ");
        boolean l=sc.nextBoolean();
        if (l){
            System.out.println("Value?");
            t.left= new TreeNode(sc.nextInt());
            populate(t.left, sc);
        }
         System.out.println("Add Right of node "+t.val+"? ");
        boolean r=sc.nextBoolean();
        if (r){
            System.out.println("Value?");
            t.right= new TreeNode(sc.nextInt());
            populate(t.right, sc);
        }

    }

    private void display(){
        display(this.root, "");
    }

    private void display(TreeNode node, String s) {
        if (node==null) return;
        System.out.println(s+node.val);
        display(node.left, "\t");
        display(node.right, "\t");
    }

    private void prettyDisplay(){
    prettyDisplay(root, 0);
    }

    private void prettyDisplay(TreeNode node, int level) {
        if (node==null) return;
        prettyDisplay(node.right, level+1);
        if (level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.val);
        }else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level+1);
    }

    private void display1(){
        BinaryTreePrinter btp=new BinaryTreePrinter();
        btp.printTree(root);
    }


}
