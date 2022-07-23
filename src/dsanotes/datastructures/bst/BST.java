package dsanotes.datastructures.bst;

public class BST {

    Node root;
    static class Node{
        int key;
        Node l,r ;
        Node(int k){
            this.key=key;
            this.l=this.r=null;
        }
    }

    void insert(int data){
        if(root==null){
            root=new Node(data);
            return;
        }else{
            Node t=new Node(data);
            Node c=root, p;

            while(true){

                if (c.key> data){
                    p=c;
                    c=c.l;
                    if (c.l==null){

                    }
                }else {
                    c=c.r;
                }


            }

        }


    }
}
