package practice.leetq;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class KeyPadProblem {
    static Vector<String> vList = new Vector<>();
    static Node head;

    public static void main(String[] args) {

        Node node1 = new Node(new char[]{}, 1);
        Node node2 = new Node(new char[]{'a', 'b', 'c'}, 2);
        Node node3 = new Node(new char[]{'d', 'e', 'f'}, 3);
        Node node4 = new Node(new char[]{'g', 'h', 'i'}, 4);
        Node node5 = new Node(new char[]{'j', 'k', 'l'}, 5);
        Node node6 = new Node(new char[]{'m', 'n', 'o'}, 6);
        Node node7 = new Node(new char[]{'p', 'q', 'r', 's'}, 7);
        Node node8 = new Node(new char[]{'t', 'u', 'v'}, 8);
        Node node9 = new Node(new char[]{'w', 'x', 'y', 'z'}, 9);
        Node node0 = new Node(new char[]{}, 0);


//        insertAtHead(node2);
//        insertAtHead(node3);
//        insertAtHead(node4);
//        insertAtHead(node5);
//
//        insertAtHead(node6);
//        insertAtHead(node7);
//        insertAtHead(node8);
//        insertAtHead(node9);

        insertAtLast(node2);
        insertAtLast(node3);
        insertAtLast(node4);
        insertAtLast(node5);
        insertAtLast(node6);
        insertAtLast(node7);
        insertAtLast(node8);
        insertAtLast(node9);
      //  printLL();
        System.out.print("Enter number : ");
        String str = (new Scanner(System.in)).next();
        pattern(str);

        printCombinations(str.length());
    }

    private static void printCombinations(int length) {
        for (String s : vList) {
            if (s.length() == length)
                System.out.print(s + ", ");
        }
    }

    static void insertAtHead(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;

    }

    static void insertAtLast(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = node;

    }

    static void printLL() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(Arrays.toString(node.alpha) + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    static void pattern(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(chars[i] + "");
        }
        //System.out.println(Arrays.toString(ints));

        for (int i = 0; i < ints.length; i++) {
            Node node = head;
            while (node != null) {
                if (node.num == ints[i]) {
                    makeCombinations(node.alpha);
                }
                node = node.next;
            }
        }

    }

    private static void makeCombinations(char[] chars) {

        int l = vList.size();

        if (vList.size() != 0) {
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < l; j++) {
                    vList.add(chars[i] + vList.get(j));
                }
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                vList.add(chars[i] + "");
            }

        }

    }


}


class Node {
    char[] alpha;
    int num;
    Node next;

    public Node(char[] alpha, int num) {
        this.alpha = alpha;
        this.num = num;
        this.next = null;
    }
}
