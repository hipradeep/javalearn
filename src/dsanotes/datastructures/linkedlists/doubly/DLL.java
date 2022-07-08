package dsanotes.datastructures.linkedlists.doubly;

import java.util.Scanner;

public class DLL {

    private Node head;
    private Node tail;
    private int count;

    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(int item) {
            this.item = item;
            next = prev = null;
        }

        public Node(int item,  Node prev,Node next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    void createDll(int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for Node-" + i + " : ");
            Node t = new Node(sc.nextInt());
            if (head == null) {
                head = t;
                tail = t;
            } else {
                tail.next = t;
                t.prev = tail;
                tail = t;
            }
            count++;
        }
    }

    void createUsingArr(int[] a) {

        for (int p : a) {
            Node t = new Node(p);
            if (head == null) {
                head = t;
                tail = t;
            } else {
                tail.next = t;
                t.prev = tail;
                tail = t;
            }
            count++;
        }
    }

    void insertAtFirst(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            t.next = head;
            t.prev = null;
            head.prev = t;
            head = t;
        }
        count++;
    }

    void insertAtEnd(int item) {
        Node t = new Node(item);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            tail.next = t;
            t.prev = tail;
            tail = t;
        }
        count++;
    }

    void insertAtIndex(int index, int item) {

        if (index > count) {
            System.out.println("Cant Insert");
            return;
        }
        if (index == 0) {
            insertAtFirst(item);
            return;
        }
        if (index == count) {
            insertAtEnd(item);
            return;
        }

        Node r = head;
        for (int i = 1; i < index; i++) {
            r = r.next;
        }
//        Node t = new Node(item, r, r.next);
//        r.next = t;
        //or

        Node t=new Node(item);
        t.next = r.next;
        t.prev = r;
        r.next = t;

        count++;


    }

    void display() {
        if (head == null) System.out.println("List Is empty!");
        else {
            Node r = head;
            while (r != null) {
                if (r.next == null) {
                    System.out.print(r.item);
                } else {
                    System.out.print(r.item + " -> ");
                }
                r = r.next;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        DLL dl = new DLL();
        //dl.createDll(5);
        dl.createUsingArr(new int[]{10, 20, 30, 40});
        dl.display();
        dl.insertAtFirst(11);
        dl.display();
        dl.insertAtEnd(21);
        dl.display();
        dl.insertAtIndex(5,31);
        dl.display();
    }

}
