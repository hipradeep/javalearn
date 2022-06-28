package dacclass.june.doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedList {

    static DNode head;
    static int count;

    public DoublyLinkedList() {
        head = null;
        count = 0;
    }

    int getLengthOfDoublyLLt() {
        return count;
    }

    void printSizeOfDoublyLL() {
        System.out.println("\nSize of Doubly Linked List is : " + count);
    }

    //create doubly linked list
    void createDoublyLinkedList(int n) {
        System.out.println("\nDoubly LinkedList Created of size : " + n);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + " : ");
            DNode t = new DNode(sc.nextInt());
            if (head == null) {
                head = t;
            } else {
                DNode r = head;
                while (r.getNext() != null) {
                    r = r.getNext();
                }
                r.setNext(t);
                t.setPrev(r);
            }
            count += 1;
        }
    }

    // display all nodes of doubly linked list
    void display() {
        if (isEmpty()) {
            System.out.println("\nList Is Empty");
        } else {
            System.out.println("\nDisplay All Nodes");
            DNode r = head;
            while (r != null) {
                if (r.getNext() != null)
                    System.out.print(r.getItem() + " <-> ");
                else System.out.print(r.getItem());
                r = r.getNext();
            }
        }
        System.out.println("");
    }

    //check LinkedList is empty
    boolean isEmpty() {
        return head == null;
    }

    //insert at beginning
    void insertAtBeginning(int item) {
        System.out.println("\n Insert at Beginning");
        DNode t = new DNode(item);
        if (!isEmpty()) {
            t.setNext(head);
            t.setPrev(null);
        }
        head = t;
        count += 1;
    }

    //insert at end
    void insertAtEnd(int item) {
        System.out.println("\n Insert at End");
        DNode t = new DNode(item);
        if (isEmpty()) {
            head = t;
        } else {
            DNode r = head;
            while (r.getNext() != null) {
                r = r.getNext();
            }
            r.setNext(t);
            t.setPrev(r);
            t.setNext(null);
        }
        count += 1;
    }

    //insert before an Node
    void insertBeforeANode(int before, int item) {

    }

    //insert after an Node
    void insertAfterANode(int after, int item) {

    }

    //insert at position
    void insertAtPosition(int position, int item) {
        System.out.println("\nInsert at position - "+position);
        if (isEmpty()) {
            System.out.println("Insert Not Possible!");
        } else {
            DNode t = new DNode(item);
            DNode r = head;
            if (r.getNext()!=null && position<=count){
                for (int i = 0;  i < position-2 ; i++) {
                    r = r.getNext();
                }
                t.setNext(r.getNext());
                r.setNext(t);
                t.setPrev(r);
                count+=1;
            }else {
                if (r.getNext()==null){
                    t.setNext(head);
                    t.setPrev(null);
                    head=t;
                    count+=1;
                }else
                System.out.println("Can not be insert!");
            }

        }

    }

}
