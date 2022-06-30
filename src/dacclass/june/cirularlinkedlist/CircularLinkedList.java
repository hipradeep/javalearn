package dacclass.june.cirularlinkedlist;

import java.util.Scanner;

public class CircularLinkedList {
    static Node head;
    static Node tail;
    static int count;

    public CircularLinkedList() {
        head = tail = null;
        count = 0;
    }

    int getLengthOfCircularLL() {
        return count;
    }

    void printSizeOfCircularLL() {
        System.out.println("\nSize of Linked List is : " + count);
    }

    //check LinkedList is empty
    boolean isEmpty() {
        return head == null && tail == null;
    }

    void createCLL(int[] arr) {
        for (int a : arr) {
            Node t = new Node(a);
            if (head == null) {
                head = t;
            } else {
                tail.setNext(t);
            }
            tail=t;
            tail.setNext(head);
            count++;
        }
    }

    //create circular linked list
    void createCircularLL(int n) {
        System.out.println("\nCircular LinkedList Created of size : " + n);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + " : ");
            Node t = new Node(sc.nextInt());
            if (i == 0) {
                head = t;
                tail = t;
                t.setNext(head);
            } else {
                tail.setNext(t);
                tail = t;
                tail.setNext(head);
            }
            count += 1;
        }
    }

    // display All Nodes
    void display() {
        if (isEmpty()) {
            System.out.println("\nLinked List Is Empty");
        } else {
            Node r = head;
            do {
                if (r.getNext() != head)
                    System.out.print(r.getItem() + " -> ");
                else System.out.print(r.getItem());
                r = r.getNext();
            } while (r != head);

        }
        System.out.println("");
    }

    //inset at Last
    void insertAtLast(int item) {
        Node t = new Node(item);
        if (head==null) {
            head = t;
            tail = t;
            t.setNext(head);
        } else {
            tail.setNext(t);
            tail = t;
            tail.setNext(head);
        }
        count += 1;
    }

    //insert at beginning
    void insertAtBeginning(int item) {
        Node t = new Node(item);
        if (head==null) {
            head = t;
            tail = t;
            t.setNext(head);
        } else {
            t.setNext(head);
            head = t;
            tail.setNext(head);
        }
        count += 1;
    }

    //insert At position
    void insertAtPosition(int position, int item) {

        System.out.println("\nInsert "+item+" at position-" + position);
        if (position >= count || count < 2)
            System.out.println("insertion not possible");
        else {
            Node t = new Node(item);
            Node r = head;
            for (int i = 1; i < position - 1; i++) {
                r = r.getNext();
            }
            t.setNext(r.getNext());
            r.setNext(t);
            count += 1;
        }
    }

    void insertAtIndex(int index, int item) {
        if (index==0){
            insertAtBeginning(item);
            return;
        }
        if (index == count-1){
            insertAtLast(item);
            return;
        }
            Node t = new Node(item);
            Node r = head;
            for (int i = 1; i < index; i++) {
                r = r.getNext();
            }
            t.setNext(r.getNext());
            r.setNext(t);
            count += 1;

    }


    public void removeFromPosition(int position) {
        System.out.println("\nRemove at position-" + position);
        if (position > count || count < 3) {
            System.out.println("deletion not possible");
        } else {
            Node t = head;
            Node r = null;
            for (int i = 1; i < position; i++) {
                r = t;
                t = t.getNext();
            }
            assert r != null;
            r.setNext( t.getNext());
            count-=1;
        }
    }

    public void removeAtBeginning() {
        System.out.println("\nRemove at position Beginning");
        if (isEmpty()) {
            System.out.println("list is empty nothing can be deleted");
        } else {
            head = head.getNext();
            tail.setNext( head);
            count-=1;
        }

    }

    public void removeFromEnd() {
        System.out.println("\nRemove at End");
        if (isEmpty()) {
            System.out.println("list is empty nothing can be deleted");
        } else {
            Node t = head;
            while (t.getNext() != tail) {
                t = t.getNext();
            }
            t.setNext( head);
            tail = t;
            count-=1;
        }
    }


}
