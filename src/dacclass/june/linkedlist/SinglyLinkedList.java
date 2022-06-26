package dacclass.june.linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
    static Node head;
    static int count;

    public SinglyLinkedList() {
        head = null;
        count = 0;
    }

    void create(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("enter the node value : ");
            int data = sc.nextInt();
            Node t = new Node(data);//  allocate memory to node
            // connect node in list
            if (head == null)// list empty
            {
                head = t;   //first node
            } else {
                Node r = head;
                while (r.getNext() != null)  // traverse upto last node
                {
                    r = r.getNext();  // move reference to next node
                }
                r.setNext(t); // connect at last position
            }
            count++;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node r = head;
            while (r != null) {
                int f=r.getItem();
                System.out.print(f+ " ->");
                r = r.getNext();
            }
        }
    }

    public void insertAtBeginning(int item) {

        Node t = new Node(item);
        if (head == null) {
            head = t;
        } else {
            t.setNext(head);
            head=t;
        }
        count++;
    }
    public void insertAtEnd(int item){
        Node t = new Node(item);
        if (head == null) {
            head = t;
        }else {
            Node r=head;
            while (r.getNext() !=null){
                r=r.getNext();
            }
            r.setNext(t);
        }
        count++;
    }
    public void insertAfter(int after, int item){
        Node t=new Node(item);
        if (head==null){
            head = t;
        }else {
            Node r=head;
            while ( r!=null && r.getItem() != after){
                r=r.getNext();
            }

            if (r !=null){
                t.setNext(r.getNext());
                r.setNext(t);
            }else {
                System.out.println("");
                System.out.println(after+" not found");
            }

        }
    }

    public void insertBefore(int before, int item){
        Node t=new Node(item);
        if (head==null){
            head = t;
        }else {
            Node r=head;
            while (r.getNext() !=null && r.getNext().getItem() != before){
                r=r.getNext();
            }
           t.setNext(r.getNext());
            r.setNext(t);
        }
    }
    private void insertAtPosition(int position, int item) {

        Node t=new Node(item);
        if (head==null){
            System.out.println("List is empty!");
        }else {
            Node r=head;
            for (int i=1; r!= null && i<position-1; i++){
                r=r.getNext();
            }
            if (r!=null){
                t.setNext(r.getNext());
                r.setNext(t);
            }else {
                System.out.println("\nPosition Not found!");
            }

        }



    }
    private void removeFirst() {
        if (head !=null){
            Node t=head.getNext();
            head=t;
            //head=head.getNext();
        }else {
            System.out.println("List is empty!");
        }
    }
    private void removeLast() {
        if (head !=null){

            Node r=head;
            while (r.getNext().getNext()!=null){
                r=r.getNext();
            }
           r.setNext(null);
            //head=head.getNext();
        }else {
            System.out.println("List is empty!");
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.create(3);
        linkedList.display();
//        linkedList.insertAtBeginning(6);
//        System.out.println("");
//        linkedList.display();

//        linkedList.insertAtEnd(8);
//        System.out.println("");
//        linkedList.display();

//        linkedList.insertAfter(2, 10);
//        System.out.println("");
//        linkedList.display();

//        linkedList.insertBefore(4, 12);
//        System.out.println("");
//        linkedList.display();

//        linkedList.insertAtPosition(4, 15);
//        System.out.println("");
//        linkedList.display();

//        linkedList.removeFirst();
//        System.out.println("");
//        linkedList.display();


        linkedList.removeLast();
        System.out.println("");
        linkedList.display();
    }




}


class Node {
    private final int item;
    private Node next;

    Node(int item) {
        this.item = item;
        this.next = null;
    }

    public int getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
