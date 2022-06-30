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
        System.out.println("Insert Node Before");
        if (isEmpty()){
            System.out.println("List Is Empty!");
        }else{

            DNode t=new DNode(item);
            if (head.getNext()==null){
                if (head.getItem()==before)
                insertAtBeginning(item);
                else System.out.println("Before node not found");
            }else {
                DNode r=head;
                if (r.getItem()!=before){
                    while (r.getNext()!=null && r.getNext().getItem()!=before){
                        r=r.getNext();
                    }
                    if (r.getNext()==null){
                        System.out.println("Before node not found");
                    }else {
                        t.setNext(r.getNext());
                        t.setPrev(r);
                        r.setNext(t);
                        count+=1;
                    }
                }else {
                    insertAtBeginning(item);
                }

            }
        }


    }

    //insert after A Node
    void insertAfterANode(int after, int item) {
        System.out.println("Insert Node After");
        if (isEmpty()){
            System.out.println("List is empty");
        }else {
            DNode t=new DNode(item);
            //list has single element
            if (head.getNext()==null){
                if (head.getItem()==after)
                insertAtEnd(item);
                else System.out.println("after not found");
            }else {

                DNode r=head;
             while (r.getNext()!=null && r.getItem()!=after){
                 r=r.getNext();
             }
                if (r.getItem()==after){
                    r.setNext(t);
                    t.setNext(null);
                    t.setPrev(r);
                    count+=1;
                }else {
                    System.out.println("after element not found*");
                }
            }

        }
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
                System.out.println("Can Not Insert!");
            }

        }

    }

    //deleteElement at beginning
    void removeFromBeginning(){
        System.out.println("Remove from beginning");
        if (isEmpty()){
            System.out.println("List is empty");
        }else {
            if (head.getNext()==null){
                head=null;
            }else {
                head=head.getNext();
                head.setPrev(null);
            }
            count-=1;
        }

    }
    //deleteElement at end
    void removeFromEnd(){
        System.out.println("Remove from end");
        if (isEmpty()){
            System.out.println("List is empty");
        }else {
            DNode r=head;
            if (r.getNext()!=null){
                while (r.getNext().getNext() != null){
                    r=r.getNext();
                }
                r.setNext(null);
            }else {
                head=null;
            }
            count-=1;


        }
    }
    //deleteElement before of a Node
    void removeBeforeANode(){
        System.out.println("Remove before");
        if (isEmpty()){
            System.out.println("List is empty");
        }
    }
    //deleteElement after of a Node
    void removeAfterANode(){
        System.out.println("Remove after");
        if (isEmpty()){
            System.out.println("List is empty");
        }
    }
    //deleteElement at particular position(index)
    void removeFromParticularPosition(int position){
        System.out.println("Remove from position - "+position);
        if (isEmpty()){
            System.out.println("List is empty");
        }else {
            DNode r=head;
            for (int i = 0; i < position-2; i++) {
                r=r.getNext();
            }
            r.setNext(r.getNext().getNext());
            r.getNext().setPrev(null);
            count-=1;
        }

    }



}
