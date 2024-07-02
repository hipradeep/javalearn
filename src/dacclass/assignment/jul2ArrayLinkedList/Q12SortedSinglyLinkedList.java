package dacclass.assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q12SortedSinglyLinkedList {
    //Write a program to Implement Sorted Singly Linked List. Insert node at
    //its proper position.
    private Node head;
    private int count;
    private Node tail;

    private static class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //createLinkedList of n Node
    void createLinkedList(int n) {
        System.out.println("\nSingly LinkedList Created of size : " + n);
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


    public void sortList() {

        Node r = head, t = null;

        int temp;

        if (head == null) {
            return;
        } else {
            while (r != null) {
                t = r.next;
                while (t != null) {
                    if (r.item > t.item) {
                        temp = r.item;
                        r.item = t.item;
                        t.item = temp;
                    }
                    t = t.next;
                }
                r = r.next;
            }
        }
    }


    public static void main(String[] args) {
        Q12SortedSinglyLinkedList ll = new Q12SortedSinglyLinkedList();
        ll.createLinkedList(5);
        ll.display();
        System.out.println("Sorted Linked List - ");
        ll.sortList();
        ll.display();


    }
}
