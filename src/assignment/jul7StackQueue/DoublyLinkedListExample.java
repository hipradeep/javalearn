package assignment.jul7StackQueue;

import dacclass.june.doublylinkedlist.DNode;

import java.util.Scanner;

public class DoublyLinkedListExample {

    static DNode head;
    static int count;

    public DoublyLinkedListExample() {
        head = null;
        count = 0;
    }

    private class DNode {
        private final int item;
        private DNode prev;
        private DNode next;

        public DNode(int item) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }
    }
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
                while (r.next != null) {
                    r = r.next;
                }
                r.next=t;
                t.prev=r;
            }
            count += 1;
        }
    }
    boolean isEmpty() {
        return head == null;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("\nList Is Empty");
        } else {
            System.out.println("\nDisplay All Nodes");
            DNode r = head;
            while (r != null) {
                if (r.next!= null)
                    System.out.print(r.item + " <-> ");
                else System.out.print(r.item);
                r = r.next;
            }
        }
        System.out.println("");
    }
    void removeFromBeginning(){
        System.out.println("Remove from beginning");
        if (isEmpty()){
            System.out.println("List is empty");
        }else {
            if (head.next==null){
                head=null;
            }else {
                head=head.next;
                head.prev=null;
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
            if (r.next!=null){
                while (r.next.next != null){
                    r=r.next;
                }
                r.next=null;
            }else {
                head=null;
            }
            count-=1;

        }
    }
    //insert at beginning
    void insertAtBeginning(int item) {
        System.out.println("\n Insert at Beginning");
        DNode t = new DNode(item);
        if (!isEmpty()) {
            t.next=head;
            t.prev=null;
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
            while (r.next != null) {
                r = r.next;
            }
            r.next=t;
            t.prev=r;
            t.next=null;
        }
        count += 1;
    }
    public static void main(String[] args) {
        DoublyLinkedListExample dl=new DoublyLinkedListExample();
        dl.createDoublyLinkedList(5);

        dl.display();

        dl.removeFromBeginning();
        dl.removeFromEnd();
    }
}
