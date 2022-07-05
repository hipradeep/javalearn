package assignment.jul2ArrayLinkedList;

import dacclass.june.singlylinkedlist.Node;

import java.util.Scanner;

public class Q8DeletionInSinglyLinkedList {
    //Write a program to implement deletion from different position in singly
    //linked list.

    private Node head;
    private int count;
    private Node tail;

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
    //createLinkedList of n Node
    void createLinkedList(int n){
        System.out.println("\nSingly LinkedList Created of size : "+n);
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<n; i++){
            System.out.print("Enter data for node "+(i+1)+" : ");
            Node t=new Node(sc.nextInt());
            if(i==0){
                head=t;
            }else {
                Node r=head;
                while (r.next!=null){
                    r=r.next;
                }
                r.next=t;
            }
            count+=1;
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

    //insert Node at beginning
    void insertNodeAtBeginning(int item){
        System.out.println("\nInsert Node-" + item+ " At Beginning");
        Node t=new Node(item);
        if(head==null){
            head=t;
        }else {

            t.next=head;
            head=t;
            count+=1;
        }

    }
    //insert Node at end
    void insertNodeAtEnd(int item){
        System.out.println("\nInsert Node-" + item+ " At End");
        Node t=new Node(item);
        if(head==null){
            head=t;
        }else {
            Node r=head;
            while (r.next !=null){
                r=r.next;
            }
            r.next=t;
            count+=1;
        }
    }

    //delete Node at beginning
    void deleteNodeAtBeginning(){
        System.out.println("\n Remove Node From Beginning");
        if (head==null){
            System.out.println("\nLinked List Is Empty");
        }else {
            Node t=head;
            head=t.next;
            count-=1;
            System.out.println("Node("+t.item+") Is Removed From Beginning!");
        }


    }
    //delete Node at end
    void deleteNodeAtEnd(){
        System.out.println("\n Remove Node From End");
        if (head==null){
            System.out.println("\nLinked List Is Empty");
        }else {
        Node r=head;
            while (r.next.next!=null){
                r=r.next;
            }
            Node t=r.next;
            r.next=null;
            count-=1;
            System.out.println("Node("+t.item+") Is Removed From End!");
        }
    }

    public static void main(String[] args) {
        Q8DeletionInSinglyLinkedList ll=new Q8DeletionInSinglyLinkedList();
        ll.createLinkedList(5);
        ll.display();
        ll.deleteNodeAtBeginning();
        ll.display();
        ll.deleteNodeAtEnd();
        ll.display();
    }
}
