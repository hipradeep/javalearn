package practice.tree;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrinter {
    public void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        int treeHeight = getHeight(root);
        int maxWidth = (int) Math.pow(2, treeHeight - 1) * 4;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int k=0;
        int level = 0;
        int nodesToPrint = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int spacing = maxWidth / (levelSize * 2);

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                k++;
                if (k==50) break;
                // Print spacing
                printSpaces(spacing);

                // Print node value
                if (node != null) {
                    System.out.print(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else {
                    System.out.print(" ");
                    queue.offer(null);
                    queue.offer(null);
                }

                // Print additional spacing between nodes
                printSpaces(spacing);

                // Reduce the number of nodes to print at this level
                nodesToPrint--;

                if (nodesToPrint == 0) {
                    System.out.println();
                    level++;
                    nodesToPrint = (int) Math.pow(2, level);
                    spacing = maxWidth / (nodesToPrint * 2);
                }

            }

            if (k==50) return;

        }
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}