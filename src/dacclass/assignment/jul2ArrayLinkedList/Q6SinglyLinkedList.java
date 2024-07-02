package dacclass.assignment.jul2ArrayLinkedList;

import java.util.Scanner;

public class Q6SinglyLinkedList {
    //Write a program to implement singly linked list

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

    public static void main(String[] args) {
        Q6SinglyLinkedList ll=new Q6SinglyLinkedList();
        ll.createLinkedList(5);
        ll.display();
    }
}
