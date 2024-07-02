package dsanotes.datastructures.binarytree;

import java.util.*;

public class BTLevelWise extends BinaryTree{
    public static void main(String[] args) {
        binaryTree();

        //levelWise2(root);
        System.out.println(levelWise2(root));
    }

    private static List<List<Integer>> levelWise2(Node root) {
        if (root==null) return null;
        List<List<Integer>> res = new ArrayList<>();

        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel= new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();

                assert temp != null;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);

                currentLevel.add(temp.data);
            }
            res.add(currentLevel);
        }
    return res;
    }

    private static void levelWise(Node root) {
        if(root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.data+" ");
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }

    }
}
