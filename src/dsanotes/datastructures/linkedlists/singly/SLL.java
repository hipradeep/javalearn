package dsanotes.datastructures.linkedlists.singly;

import java.util.Scanner;

public class SLL {
    private Node head;
    private int count;
    private Node tail;

    void createLL(int[] arr) {
        for (int a : arr) {
            Node t = new Node(a);
            if (head == null) head = t;
            else tail.next = t;
            tail = t;
            count++;
        }
    }
    void createLinkedList(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + " : ");
          Node t = new Node(sc.nextInt());
            if (i == 0) {
                head = t;
            } else {
                Node r = head;
                while (r.next != null) {
                    r = r.next;
                }
                r.next = t;
            }
            count += 1;
        }
    }

    void insetAtFirst(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            t.next = head;
            head = t;
        }
        count++;
    }

    void insertAtEnd(int item) {
        Node t = new Node(item);
        if (tail == null) {
            head = t;
        } else {
            tail.next = t;
        }
        tail = t;
        count++;
    }

    void insertAtIndex(int index, int item) {

        if (index == 0) {
            insetAtFirst(item);
        } else if (index == count - 1) {
            insertAtEnd(item);
        } else {
            Node t = new Node(item);
            Node r = head;
            for (int i = 1; i < index; i++) {
                r = r.next;
            }
            t.next = r.next;
            r.next = t;
            count++;
        }

    }

    int deleteFirstNode() {
        Node t = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        count--;
        return t.item;
    }

    public int deleteLast() {
        if (count <= 1) {
            return deleteFirstNode();
        }
        Node secondLast = get(count - 2);
        int val = tail.item;
        tail = secondLast;
        tail.next = null;
        count--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            // (i-1)th = (i)th
            node = node.next;
        }
        return node;
    }

    void display() {
        if (head == null) {
            System.out.println("LL is Empty!");
        } else {
            Node r = head;
            while (r != null) {
                if (r.next == null)
                    System.out.println(r.item);
                else System.out.print(r.item + " -> ");
                r = r.next;
            }
        }
    }

    private static class Node {
        private final int item;
        private Node next;

        public Node(int item) {
            this.item = item;
        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SLL ll = new SLL();
        int[] arr = {10, 2, 15, 20, 33, 45};
        ll.createLL(arr);
        ll.display();
        ll.insetAtFirst(55);
        ll.display();
        ll.insertAtEnd(44);
        ll.display();
        ll.insertAtIndex(6, 11);
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println( ll.deleteFirstNode());
        ll.display();

    }
}
